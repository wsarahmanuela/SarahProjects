package Unidade4;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor maior que zero: ");
        valor = sc.nextInt();
        if (valor % 2 == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero é impar");
        }
        sc.close();
    }

}
