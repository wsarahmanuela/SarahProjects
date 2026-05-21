package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float limite = 1;
        float peso;
        char opcao = 's';
        float total = 1;

        System.out.println("Digite o limite diário (em quilogramas): ");
        limite = sc.nextFloat();
        limite *= 1000;

        while (total < limite) {
            System.out.println("Digite o peso (em gramas) de cada peixe: ");
            peso = sc.nextFloat();
            total += peso;

            if (total > limite) {
                System.out.println("Limite ultrapassado");
                break;
            }
            if (opcao == 's') {
                System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                opcao = sc.next().charAt(0);
                if (opcao == 'n') {
                    break;
                }
            }

        }

    }

}
