package Uniddade6;

import java.util.Scanner;

public class Questao2 {
    private Scanner sc = new Scanner(System.in);
    private int[] numero = new int[10];

    private void lerNumero() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os numeros: ");
            numero[i] = sc.nextInt();
        }
    }

    private void maiorNumero() {
        int maior = numero[0];
        for (int i = 0; i < 10; i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }
        }
        System.out.println("O maior numero é: " + maior);
    }

    private void menorNumero() {
        int menor = numero[0];
        for (int i = 0; i < 10; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        System.out.println("O menor numero é: " + menor);
    }

    private int somaNumeros() {
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numero[i];
        }
        System.out.println("A soma dos numeros é: " + soma);
        return soma;
    }

    private void mediaNumeros() {
        int soma = somaNumeros();
        int media = soma / 10; // usa a variável, não chama de novo
        System.out.println("A media é: " + media);
    }

    public Questao2() {

    }

    public static void main(String[] args) {
        Questao2 questao2 = new Questao2();
        questao2.lerNumero();
        questao2.maiorNumero();
        questao2.menorNumero();
        questao2.mediaNumeros();
    }

}
