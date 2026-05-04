package Unidade4;

import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, exercicios;
        System.out.println("Digite a nota da primeira prova: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a nota da segunda prova: ");
        nota2 = sc.nextFloat();
        System.out.println("Digite a nota da terceira prova: ");
        nota3 = sc.nextFloat();
        System.out.println("Digite a nota do exercicos: ");
        exercicios = sc.nextFloat();

        float media = (nota1 * 1 + nota2 * 2 + nota3 * 3 + exercicios * 1) / 7;

        if (media >= 9) {
            System.out.println("A média de aproveitamento foi: " + media + " Conceito: A. Aprovado");
        } else if (media >= 7.5f && media < 9) {
            System.out.println("A média de aproveitamento foi: " + media + " Conceito: B. Aprovado");
        } else if (media >= 6 && media < 7.5f) {
            System.out.println("A média de aproveitamento foi: " + media + " Conceito: C. Aprovado");
        } else if (media >= 4 && media < 6) {
            System.out.println("A média de aproveitamento foi: " + media + " Conceito: D. Reprovado");
        } else if (media < 4) {
            System.out.println("A média de aproveitamento foi: " + media + " Conceito: E. Reprovado");
        }
        sc.close();
    }
}
