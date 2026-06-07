package Uniddade6;

import java.util.Scanner;

public class ExemploNome {
    public static void main(String[] args) {
        int tamanho = 2;
        String[] nome = new String[tamanho];
        double[] notas = new double[tamanho];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome: " + i);
            nome[i] = sc.nextLine();
            System.out.println("Digite a nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Lista os nomes");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("\nPosicao: " + i);
            System.out.println(nome[i]);
            System.out.println("Notas: " + notas[i]);
        }
        int posicaoMaiorNota = 0;
        double maiorNota = Double.MIN_VALUE;
        for (int i = 0; i < tamanho; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                posicaoMaiorNota = i;
            }
        }
        System.out.println("Aluno com maior nota: \n" +
                nome[posicaoMaiorNota]);
    }

}
