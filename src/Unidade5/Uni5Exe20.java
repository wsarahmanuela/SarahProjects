package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float massaInicial = 0;
        float massaFinal = 0;
        int tempo = 0;
        System.out.println("Digite a massa inicial: ");
        massaInicial = sc.nextFloat();
        System.out.println("Digite o tempo: ");
        tempo = sc.nextInt();
        while (massaInicial >= 0.0005) {
            massaFinal = massaInicial / 2;
            tempo += 50;
        }
        System.out.println("Massa Inicial: "+massaInicial);
        System.out.println("Massa final: "+massaFinal);
        System.out.println("Tempo: "+ tempo);
    }

}
