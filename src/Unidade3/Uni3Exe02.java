package Unidade3;

import java.util.Scanner;

public class Uni3Exe02 {
    //Uma loja de calçados está concedendo 12% de desconto nos produtos. 
    // Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
    // O preço do par de sapatos deve ser informado pelo usuário
    private float valorDoCalcado;
    private float percentualDesconto;

    public Uni3Exe02(float valorDoCalcado, float percentualDesconto) {
        this.valorDoCalcado = valorDoCalcado;
        this.percentualDesconto = percentualDesconto;
    }

    public float totalDesconto() {
        return this.valorDoCalcado * (this.percentualDesconto / 100);
    }

    public float valorTotalAPagar() {
        return this.valorDoCalcado - this.totalDesconto();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        float valor = sc.nextFloat();

        float valorFixoPercentual = 12.0f;

        Uni3Exe02 classeAula = new Uni3Exe02(valor, valorFixoPercentual);
        System.out.println("O valor do desconto é de R$" + classeAula.totalDesconto());
        System.out.printf("O preço do par de sapatos com desconto é: %.2f", classeAula.valorTotalAPagar());
        sc.close();
    }

}
