package Unidade3;

import java.util.Scanner;

public class Uni3Exe09 {
    // Descreva um programa que calcule o volume de uma lata de óleo.
    private float raio, altura;

    public Uni3Exe09(float raio, float altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double volume() {
        return Math.PI * (this.raio * this.raio) * this.altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        float raio = sc.nextFloat();
        System.out.println("Digite o valor da altura ");
        float altura = sc.nextFloat();

        Uni3Exe09 formula = new Uni3Exe09(raio, altura);
        System.out.printf("O volume da lata de óleo é %.2f", formula.volume());
        sc.close();
    }
}
