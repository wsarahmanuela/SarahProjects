package Unidade3;

import java.util.Scanner;

public class Uni3Exe13 {
    // Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
    // Faça um programa para ler o comprimento e altura de uma parede (em metros),
    // e depois escrever o valor gasto com a compra de azulejos. Considere que um
    // metro quadrado é formado por 9 azulejos.
    private float altura, comprimento;

    public Uni3Exe13(float altura, float comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public float valorFinal() {
        float area = this.comprimento * this.altura;
        float quantAzulejo = area * 9;
        float total = quantAzulejo * 12.50f;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do azulejo: ");
        float altura = sc.nextFloat();
        System.out.println("Digite o comprimento do azulejo: ");
        float comprimento = sc.nextFloat();

        Uni3Exe13 areaTotal = new Uni3Exe13(altura, comprimento);
        System.out.println("O valor final é: " + areaTotal.valorFinal());
        sc.close();
    }
}
