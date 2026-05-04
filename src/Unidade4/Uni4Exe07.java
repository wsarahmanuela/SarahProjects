package Unidade4;

import java.util.Scanner;

public class Uni4Exe07 {
    // O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior 
    // pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso. 
    // Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
    // Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso da carta: ");
        float peso = sc.nextFloat();
        float valorAPagar = 0.45f;

        if (peso <= 50) {
            System.out.println("O valor a pagar é: " + valorAPagar);
        } else {
            float adicional = peso - 50f;
            float taxa = (adicional / 20f) + 1;
            valorAPagar = 0.45f + (taxa * 0.45f);
            System.out.println("O valor a pagar é: " + valorAPagar);
        }
        sc.close();
    }

}
