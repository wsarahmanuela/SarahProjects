package Unidade3;

import java.util.Scanner;

public class Uni3Exe08 {
    // Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela
    // entregou um valor em dólares para o atendente.
    // Considerando que o atendente tem a cotação do dólar, descreva um programa
    // para calcular quantos reais o atendente deve devolver para a pessoa.
    private float valor, dollar = 5.65f;

    public Uni3Exe08(float valor, float dollar) {
        this.valor = valor;
        this.dollar = dollar;
    }

    public float cotacao() {
        return this.valor * this.dollar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor em dólares recebido pelo cliente: ");
        float valor = sc.nextFloat();

        Uni3Exe08 reais = new Uni3Exe08(valor, 5.65f);
        System.out.println("O atendente deve devolver R$ " + reais.cotacao() + " para o cliente");
        sc.close();
    }
}
