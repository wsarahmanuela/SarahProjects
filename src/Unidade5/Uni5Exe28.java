package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char votos;
        int quantVotos = 0;
        int codigo1 = 0, codigo2 = 0, codigo3 = 0, codigo4 = 0;
        float percentual1 = 0, percentual2 = 0, percentual3 = 0, percentual4 = 0;
        String ganhador = "";
        int maiorVoto = 0;

        while (true) {
            System.out.println("mais um voto: s (SIM) / n (NÃO)? ");
            votos = sc.next().charAt(0);
            if (votos == 'n') {
                break;
            }
            System.out.println("Informe o total de votos da Nenhum de Nós: ");
            codigo1 = sc.nextInt();
            System.out.println("Informe o total de votos da CPM22: ");
            codigo2 = sc.nextInt();
            System.out.println("Informe o total de votos da Skank: ");
            codigo3 = sc.nextInt();
            System.out.println("Informe o total de votos da Jota Quest: ");
            codigo4 = sc.nextInt();

            quantVotos = codigo1 + codigo2 + codigo3 + codigo4;
            percentual1 = ((float) codigo1 / quantVotos) * 100;
            percentual2 = ((float) codigo2 / quantVotos) * 100;
            percentual3 = ((float) codigo3 / quantVotos) * 100;
            percentual4 = ((float) codigo4 / quantVotos) * 100;

            if (maiorVoto < codigo1) {
                maiorVoto = codigo1;
                ganhador = "Nenhum de nos";
            }
            if (maiorVoto < codigo2) {
                maiorVoto = codigo2;
                ganhador = "CPM22";
            }
            if (maiorVoto < codigo3) {
                maiorVoto = codigo3;
                ganhador = "Skank";
            }
            if (maiorVoto < codigo4) {
                maiorVoto = codigo4;
                ganhador = "Jota Quest";
            }

            System.out.println("Votos da Nenhum de Nós é: " + codigo1);
            System.out.println("Votos da CPM22 é: " + codigo2);
            System.out.println("Votos da Skank é: " + codigo3);
            System.out.println("Votos da Jota Quest: " + codigo4);

            System.out.println("\nO percentual da Nenhum de Nós é: " + percentual1);
            System.out.println("O percentual da CPM22 é: " + percentual2);
            System.out.println("O percentual da Skank é: " + percentual3);
            System.out.println("O percentual da Jota Quest é: " + percentual4);

            System.out.println("\nE o grupo vencendor é: " + ganhador);

        }
    }

}
