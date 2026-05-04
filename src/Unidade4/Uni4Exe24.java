package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    //Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

    // se opção = 1, escreva os 3 valores em ordem crescente
    //se opção = 2, escreva os 3 valores em ordem decrescente
    //se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valor1 = sc.nextInt();
        System.out.println("Digite um valor:");
        int valor2 = sc.nextInt();
        System.out.println("Digite um valor:");
        int valor3 = sc.nextInt();
        System.out.println("Opcao 1: escreva os 3 valores em ordem crescente\n" +
                "Opcao 2: escreva os 3 valores em ordem decrescente\n" +
                "Opcao 3: escreva os 3 valores de forma que o maior valor fique no meio");
        int opcao = sc.nextInt();

        int aux;

        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }

        if (valor1 > valor3) {
            aux = valor1;
            valor1 = valor3;
            valor3 = aux;
        }

        if (valor2 > valor3) {
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        switch (opcao) {
            case 1:
                System.out.println(valor1 + " " + valor2 + " " + valor3);
                break;
            case 2:
                System.out.println(valor3 + " " + valor2 + " " + valor1);
                break;
            case 3:
                System.out.println(valor2 + " " + valor3 + " " + valor1);
                break;
        }
        sc.close();

    }
}
