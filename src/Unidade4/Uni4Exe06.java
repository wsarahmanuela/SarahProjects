package Unidade4;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);
        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Nao informado");
        } else {
            System.out.println("Entrada incorreta");
        }
        sc.close();
    }
}
