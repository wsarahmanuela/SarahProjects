package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número total de reabastecimentos: ");
        int numeroTotal = sc.nextInt();
        float conta = 0;

        for (int i = 1; i <= numeroTotal; i++) {
            System.out.print("Parada " + i + "\nQuilometragem: ");
            int quilometragem = sc.nextInt();
            System.out.print("Combustível: ");
            float combustivel = sc.nextFloat();

            float kmLitro = quilometragem / combustivel;
            conta += kmLitro;
            System.out.println("Parada " + i + ": " + kmLitro + " km por litro");
        }
        float media = conta / numeroTotal;
        System.out.println("Quilometragem média obtida por litro: " + media);
        sc.close();
    }

}
