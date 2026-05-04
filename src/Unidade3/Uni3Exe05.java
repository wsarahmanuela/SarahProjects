package Unidade3;

import java.util.Scanner;

public class Uni3Exe05 {
    // Uma granja possui um controle automatizado de cada frango da sua produção.
    // No pé direito do frango há um anel com um chip de identificação; no pé
    // esquerdo são dois anéis para indicar o tipo de
    // alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o
    // anel de alimento custa R$ 3,50, faça
    // um programa para calcular o gasto total da granja para marcar todos os seus
    // frango
    private int quantidade;

    public Uni3Exe05(int quantidade) {
        this.quantidade = quantidade;
    }

    public float gastoTotal() {
        float anelChip = 4.0f;
        float anelAlimento = 3.5f;
        return this.quantidade * (anelChip + (2 * anelAlimento));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de frangos: ");
        int quantidade = sc.nextInt();

        Uni3Exe05 granja = new Uni3Exe05(quantidade);
        System.out.println("O gasto total para marcar é: " + granja.gastoTotal());
        sc.close();
    }
}
