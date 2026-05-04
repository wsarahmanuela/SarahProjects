package Unidade1;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        nota1 = sc.nextFloat();

        System.out.println("Digite a nota 2");
        nota2 = sc.nextFloat();

        System.out.println("Digite a nota 3");
        nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) /3;
        System.out.println("A média é: " + media );
        sc.close();
    }

}
