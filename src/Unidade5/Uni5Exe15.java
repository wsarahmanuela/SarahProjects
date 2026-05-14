package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        float nota1, nota2;
        while (!nome.toLowerCase().equals("fim")) {
            System.out.println("Digite o nome: ");
            nome = sc.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextFloat();
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextFloat();

            double media = (nota1 + nota2) / 2;
            System.out.println("A media do aluno " + nome + " é " + media);

        }
        sc.close();
    }
}
