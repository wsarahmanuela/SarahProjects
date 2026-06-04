package Uniddade6;

import java.util.Scanner;

public class Uni6Exe07 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor;

    private void tamanhovetor() {
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        vetor = new int[n];
        while (n > 20) {
            System.out.println("Valor inválido! Digite um valor até 20: ");
            n = sc.nextInt();
        }
    }

    private boolean verificarVetor(int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private void preencherVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            int valor = sc.nextInt();
            while (verificarVetor(valor)) {
                System.out.println("Numero ja existe! Digite outro: ");
                valor = sc.nextInt();
            }
            vetor[i] = valor;
        }
    }

    private void ordernarValor() {
        int bolha;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = -1;
            }
        }
        System.out.println("Valores ordenados");
    }
    private void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" |");

        }
    }

    public Uni6Exe07() {

    }

    public static void main(String[] args) {
        Uni6Exe07 uni6Exe07 = new Uni6Exe07();
        uni6Exe07.tamanhovetor();
        uni6Exe07.preencherVetor();
        uni6Exe07.ordernarValor();
        uni6Exe07.mostrarVetor();
    }
}
