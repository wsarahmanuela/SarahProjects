package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canal = 0;
        int assistindo = 0;
        int cont = 0;
        while (true) {
            System.out.println("Canal (4, 5, 9, 12): ");
            canal = sc.nextInt();
            if (canal == 0) {
                break;
            }
            if (canal != 4 && canal != 5 && canal != 9 && canal != 12) {
                System.out.println("Numero invalido");
                break;
            }
            System.out.println("Assistindo: ");
            assistindo = sc.nextInt();
            cont++;

            int percentual = (assistindo / cont) * 10;
            System.out.println("Percentual de audiência do canal " + canal + ": " + percentual + "%");
        }

    }

}
