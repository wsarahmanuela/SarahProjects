package Unidade4;

import java.util.Scanner;

public class Uni4Exe03 {
    //Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Digite um valor inteiro: ");
        valor1 = sc.nextInt();
        System.out.println("Digite um segundo valor inteiro: ");
        valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O valor1 " + valor1 + " maior do que o valor2 " + valor2);
        } else {
            System.out.println("O valor2 " + valor2 + " maior do que o valor1 " + valor1);
        }
        sc.close();
    }

}
