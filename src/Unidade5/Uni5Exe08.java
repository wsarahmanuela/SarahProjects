package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int n = sc.nextInt();
        int menor = 0;
        int maior = 0;
        int media = 0;
        int soma = 0;
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe um numero: ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            if (numero > 0) {
                soma = soma + numero;
                contador = contador + 1;
            }
        }
        media = soma / contador;
        System.out.println("Menor valor negativo: " + menor);
        System.out.println("Media dos numeros positivos: " + media);
        sc.close();
    }

}
