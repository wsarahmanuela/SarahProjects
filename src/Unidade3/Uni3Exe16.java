package Unidade3;

import java.util.Scanner;

public class Uni3Exe16 {
    // Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
    // Considerando que alguém está pagando uma compra,
    // faça um programa que determine e escreva o número mínimo de notas que o caixa
    // deve fornecer como troco.
    // Escreva também o número de cada tipo de nota a ser fornecido como troco.
    // Suponha que o sistema monetário não utilize centavos.
    private int valorTotal;
    private int valorPago;

    public Uni3Exe16(int valorTotal, int valorPago) {
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
    }

    public int troco() {
        return this.valorPago - this.valorTotal;
    }

    public int notaDeCem() {
        return troco() / 100;
    }

    public int notasDeDez() {
        return (troco() % 100) / 10;
    }

    public int notasDeUm() {
        return troco() % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("valor total da compra: ");
        int valorTotal = sc.nextInt();
        System.out.println("Valor total dado pelo cliente: ");
        int valorPago = sc.nextInt();

        Uni3Exe16 uni3Exe16 = new Uni3Exe16(valorTotal, valorPago);
        int totalNotas = uni3Exe16.notaDeCem() + uni3Exe16.notasDeDez() + uni3Exe16.notasDeUm();
        System.out.println("O numero minimo de notas de troco é: " + totalNotas);
        System.out.println("Quantodades de notas de 100 necessárias é: " + uni3Exe16.notaDeCem());
        System.out.println("Quantodades de notas de 10 necessárias é: " + uni3Exe16.notasDeDez());
        System.out.println("Quantodades de notas de 1 necessárias é: " + uni3Exe16.notasDeUm());
    }
}
