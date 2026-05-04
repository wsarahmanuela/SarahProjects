package Unidade2;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero1: ");
        n1 = sc.nextInt();

        System.out.println("Digite o numero2: ");
        n2 = sc.nextInt();

       int soma = n1+n2;
       System.out.println("A soma dos dois numeros é: "+ soma);
       sc.close();
    }

}
