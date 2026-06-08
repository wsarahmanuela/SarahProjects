package Prova;

import java.util.Scanner;

public class Questao2 {

    Scanner sc = new Scanner(System.in);
    private String[] mochila;
    private int[] pesos;
    private int capacidadeMaxima;
    private int posicaoFim = 0;

    private void preencherMochila() {
        System.out.print("Tamanho da mochila: ");
        int tamanho = sc.nextInt();
        System.out.print("Qual vai ser a capacidade maxima da mochila: ");
        capacidadeMaxima = sc.nextInt();
        mochila = new String[tamanho];
        pesos = new int[tamanho];
    }

    private void Questao2() {
        int opcao;
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Imprimir itens");
            System.out.println("3 - Item mais pesado");
            System.out.println("4 - Ordenar mochila");
            System.out.println("5 - Excluir item");
            System.out.println("6 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserirItem();
                    break;
                case 2:
                    imprimirMochila();
                    break;
                case 3:
                    itemMaisPesado();
                    break;
                case 4:
                    ordenarMochila();
                    break;
                case 5:
                    excluirItemMochila();
                    break;
                case 6:
                    System.out.println("Saiu");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        } while (opcao !=6);
    }

    private int calcularPeso() {
        int soma = 0;
        for (int i = 0; i < posicaoFim; i++) {
            soma += pesos[i];
        }
        return soma;
    }

    private void inserirItem() {
        if (posicaoFim >= mochila.length) {
            System.out.println("A mochila esta cheia");
            return;
        }
        System.out.print("Nome do item: ");
        String item = sc.next();
        System.out.print("Peso do item: ");
        int peso = sc.nextInt();

        int pesoAtual = calcularPeso();
        int sobrando = capacidadeMaxima - pesoAtual;

        if (peso <= 0 || peso > sobrando) {
            System.out.println("Item nao foi inserido");
            System.out.println("Peso disponvel: " + sobrando + " kg");
            return;
        }
        mochila[posicaoFim] = item;
        pesos[posicaoFim] = peso;
        posicaoFim++;

        System.out.println("Item inserido");
        System.out.println("Peso sobrando: " + (capacidadeMaxima-calcularPeso()) + " kg");
    }
    private void imprimirMochila() {
        for (int i = 0; i < posicaoFim; i++) {
            System.out.println("Item: " + mochila[i]);
            System.out.println("Peso: "+pesos[i]);
        }
    }

    private void itemMaisPesado() {
        int maiorPeso = pesos[0];
        String itemMaisPesado = mochila[0];

        for (int i = 1; i < posicaoFim; i++) {
            if (pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
                itemMaisPesado = mochila[i];
            }
        }
        System.out.println("Item mais pesado: " + itemMaisPesado + " | " + maiorPeso);
    }

    private void ordenarMochila() {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1; j++) {
                if (pesos[j] > pesos[j + 1]) {
                    int bolha = pesos[j];
                    pesos[j] = pesos[j + 1];
                    pesos[j + 1] = bolha;

                    String bolha1 = mochila[j];
                    mochila[j] = mochila[j + 1];
                    mochila[j + 1] = bolha1;
                }
            }
        }

        System.out.println("Mochila ordenada");
    }

    private void excluirItemMochila() {
        System.out.print("Informe o item que deseja excluir: ");
        String item = sc.next();

        for (int i = 0; i < posicaoFim; i++) {
            if (mochila[i].equalsIgnoreCase(item)) {

                for (int j = i; j < posicaoFim - 1; j++) {
                    mochila[j] = mochila[j + 1];
                    pesos[j] = pesos[j + 1];
                }

                posicaoFim--;
                mochila[posicaoFim] = null;
                pesos[posicaoFim] = 0;

                System.out.println("Item excluido");
                return;
            }
        }
        System.out.println("Item não encontrado");
    }

    public Questao2() {
        
    }

    public static void main(String[] args) {
        Questao2 questao2 = new Questao2();
        questao2.preencherMochila();
        questao2.Questao2();
        questao2.inserirItem();
        questao2.imprimirMochila();
        questao2.itemMaisPesado();
        questao2.excluirItemMochila();
    }
}
