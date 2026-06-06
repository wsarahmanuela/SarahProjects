package Uniddade6;

import java.util.Scanner;

public class Uni6Exe08 {
    private Scanner sc = new Scanner(System.in);
    private float[] vetor;
    private int[] frequencia;

    private void tamanhovetor() {
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        while (n > 20) {
            System.out.println("Valor inválido! Digite um valor até 20: ");
            n = sc.nextInt();
        }
        vetor = new float[n];
        frequencia = new int[n];
    }
    private void preencherVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite os numeros reais: ");
            vetor[i] = sc.nextFloat();
        }
    }
    private void verificarNumero() {
        for (int i = 0; i < vetor.length; i++) {
            int freq = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    freq++; // achou igual, conta mais 1
                }
            }
            frequencia[i] = freq;
        }
    }
    private void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" |");
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            boolean jaExibido = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    jaExibido = true;
                }
            }
            if (!jaExibido) {
                System.out.println("valor " + vetor[i] + " | frequencia " + frequencia[i]);
            }
        }
    }
    public Uni6Exe08() {

    }
    public static void main(String[] args) {
        Uni6Exe08 uni6Exe08 = new Uni6Exe08();
        uni6Exe08.tamanhovetor();
        uni6Exe08.preencherVetor();
        uni6Exe08.verificarNumero();
        uni6Exe08.mostrarVetor();
    }

}
