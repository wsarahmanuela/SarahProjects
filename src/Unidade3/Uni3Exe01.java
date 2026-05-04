package Unidade3;

import java.util.Scanner;

public class Uni3Exe01 {
    // Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler
    // as dimensões de um terreno e depois exibir a área do terreno.
    int largura;
    int comprimento;

    public Uni3Exe01(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public int CalcularArea() {
        return this.largura * this.comprimento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de largura: ");
        int largura = sc.nextInt();

        System.out.println("Digite o valor do comprimento: ");
        int comprimento = sc.nextInt();

        Uni3Exe01 uni3Exe01 = new Uni3Exe01(largura, comprimento);
        int area = uni3Exe01.CalcularArea();
        System.out.println("Area total: " + area);
        sc.close();
    }
}
