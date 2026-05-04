package Unidade3;

import java.util.Scanner;

public class Uni3Exe11 {
    // Descreva um programa que dado uma temperatura em °C informe o seu valor em °F
    private int celsius;

    public Uni3Exe11(int celsius) {
        this.celsius = celsius;
    }

    public float temperatura() {
        return (9f / 5f) * this.celsius + 32f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        int celsius = sc.nextInt();

        Uni3Exe11 temp = new Uni3Exe11(celsius);
        System.out.printf("A temperaturame em fahrenheit é: %.2f", temp.temperatura());
        sc.close();
    }
}
