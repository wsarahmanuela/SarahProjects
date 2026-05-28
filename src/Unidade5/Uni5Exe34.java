package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nDiarias = 0;
        int opcao = 1;
        String nome;
        int contaEncerradas = 0;
        do {
            System.out.println("\n(1) Encerrar conta");
            System.out.println("(2) Ver contas encerradas");
            System.out.println("(3) Sair");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do hospede: ");
                nome = sc.next();
                System.out.println("Digite o numero de diarias: ");
                nDiarias = sc.nextInt();

                float taxa = 0;
                if (nDiarias < 15) {
                    taxa = (nDiarias * 7.50f) + 50;
                } else if (nDiarias == 15) {
                    taxa = (nDiarias * 6.50f) + 50;
                } else {
                    taxa = (nDiarias * 5.00f) + 50;
                }
                contaEncerradas++;

                System.out.println("Nome do hospede: " + nome);
                System.out.println("Total a pagar: " + taxa);
            } else if (opcao == 2) {
                System.out.println("Contas encerradas: " + contaEncerradas);
            }
        } while (opcao != 3);

    }
}
