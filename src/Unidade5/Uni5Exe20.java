package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0;

        System.out.println("Digite a massa inicial (kg): ");
        float massaInicial = sc.nextFloat();
        float massa = massaInicial; 
        while (massa >= 0.0005f) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial + " kg");
        System.out.println("Massa final: " + massa + " kg");
        System.out.println("Tempo: " + tempo + " segundos");

        sc.close();
    }
}