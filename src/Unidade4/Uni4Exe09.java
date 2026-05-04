package Unidade4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor1: ");
        float valor1 = sc.nextFloat();
        System.out.println("Digite o segundo valor2: ");
        float valor2 = sc.nextFloat();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores sao multiplos");
        } else {
            System.out.println("Os valores nao sao multiplos");
        }
        sc.close();
    }

}
