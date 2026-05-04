package Unidade4;

import java.util.Scanner;

public class Uni4Exe14 {
    // Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês.
    //  Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mes: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        boolean valida = false;
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31) {
                    valida = true;
                }
            } else if (mes == 2) {
                boolean bissexto = (ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0));
                if (bissexto) {
                    if (dia <= 29) {
                        valida = true;
                    }
                } else {
                    if (dia <= 28) {
                        valida = true;
                    }
                }
            }
        }
        if (valida) {
            System.out.println("Data valida");
        } else {
            System.out.println("Data invalida");
        }
        sc.close();
    }
}
