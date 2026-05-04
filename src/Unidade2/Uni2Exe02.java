package Unidade2;

import java.util.Scanner;

public class Uni2Exe02 {

        public static void main(String[] args) {
            int n1 = 0;
            int n2 = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Numero 1: ");
            n1 = sc.nextInt();

            System.out.println("Numero 2: ");
            n2 = sc.nextInt();

            float multiplicacao = n1*n2;
            System.out.println("A multiplicacao dos dois numeros é: "+multiplicacao);
            sc.close();
        }
}
