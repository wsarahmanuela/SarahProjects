package Unidade3;

import java.util.Scanner;

public class Uni3Exe06 {
    // Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa
    // que leia
    // o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O
    // peso do prato é de 750 gramas.
    private float quilos;

    public Uni3Exe06(float quilos) {
        this.quilos = quilos;
    }

    public float valorAPagar() {
        return (this.quilos - 0.75f) * 25f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso do prato: ");
        float peso = sc.nextFloat();

        Uni3Exe06 uni3Exe06 = new Uni3Exe06(peso);
        System.out.println("O valor prato do clinete é: " + uni3Exe06.valorAPagar());
        sc.close();
    }

}
