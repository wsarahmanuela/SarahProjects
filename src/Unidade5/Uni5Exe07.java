package Unidade5;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int menor = n;
        int maior = n;
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe um numero: ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        sc.close();
    }

}
