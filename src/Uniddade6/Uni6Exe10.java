package Uniddade6;

import java.util.Scanner;

public class Uni6Exe10 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int posicaoFim = 0;

    public Uni6Exe10() {
        int opcao;
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valor");
            System.out.println("6 - Ordenar valor");
            System.out.println("7 - Inverter valor");
            System.out.println("8 - Sair do sistema");
            System.out.print("Digite a opcao escolhida");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:// incluir valor
                    incluirValor();
                    break;
                case 2:// pesquisar
                    pesquisarValor();
                    break;
                case 3:// alterar
                    alterarValor();
                    break;
                case 4:// excluir
                    excluirValor();
                    break;
                case 5:// mostrar
                    mostrarVetor();
                    break;
                case 6:// ordenar
                    ordernarValor();
                    break;
                case 7:// inverter
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Obrigado por usar o sistema");
                    System.out.println("Até");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opcao != 8);
    }

    private void incluirValor() {
        if (posicaoFim < vetor.length) {
            System.out.println("Digite o valor a ser inserido: ");
            int numero = sc.nextInt();
            vetor[posicaoFim] = numero;
            System.out.println("Numero: " + numero + " inserido na posicao " + posicaoFim);
            posicaoFim++;
        } else {
            System.out.println("Vetor cheio");
        }
    }

    private int pesquisarValor() {
        System.out.println("Informe um numero");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Numero " + numero + " encontrado na posicao " + i);
                encontrado = true;
                return i;
            }
        }
        if (!encontrado) {
            System.out.println("Numero nao encontrado");
        }
        return -1;
    }

    private void alterarValor() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            vetor[posicao] = numero;
            System.out.println("Substituindo o numero na posicao " + posicao);
        }
    }

    private void excluirValor() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            System.out.println("Digite o numero que vc quer excluir: ");
            for (int i = posicao; i < posicaoFim - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            posicaoFim--;
            System.out.println("Valor excluido");
        }
    }

    private void mostrarVetor() {
        System.out.println("Exibindo o vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" |");

        }
    }

    private void ordernarValor() {
        int bolha;
        for (int i = 0; i < posicaoFim - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = -1;
            }
        }
        System.out.println("Valores ordenados");
    }

    public void inverterValores() {
        int temp = 0;
        for (int i = 0; i < posicaoFim; i++) {
            for (int j = 0; j < i; j++) {
                temp = vetor[i];//guarda o valor de i na caixinha temporária para não perder
                vetor[i] = vetor[j];//coloca o valor de j na posição de i
                vetor[j] = temp;//coloca o valor que estava em i (guardado no temp) na posição de j
            }
        }
    }

    public static void main(String[] args) {
        Uni6Exe10 uni6Exe10 = new Uni6Exe10();
        uni6Exe10.incluirValor();
        uni6Exe10.pesquisarValor();
        uni6Exe10.alterarValor();
        uni6Exe10.excluirValor();
        uni6Exe10.mostrarVetor();
        uni6Exe10.ordernarValor();
        uni6Exe10.inverterValores();
    }

}
