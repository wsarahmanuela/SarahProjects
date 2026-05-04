package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {
    // As tarifas de um estacionamento são as seguintes:
    // 1° e 2° hora - R$ 5,00 cada
    // 3° e 4° hora - R$ 7,50 cada
    // 5° hora e seguintes - R$ 10,00 cada
    // O número de horas a pagar é sempre inteiro e arredondado para cima ou para
    // baixo dependendo do tempo.
    // Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos
    // arredonda-se para cima. Por exemplo, quem estacionar
    // durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e
    // 35 minutos pagará por duas horas. Entretanto, se a pessoa
    // permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de
    // chegada e partida são apresentados na forma de pares de inteiros,
    // representando horas e minutos. Por exemplo, o par 12 50 representará meio dia
    // e cinquenta. Assim, faça um algoritmo que leia os horários de
    // chegada e de partida e escreva na tela o tempo que ficou estacionado, e o
    // preço a ser cobrado. Deverá haver validação de dados.
    // Admite-se que a chegada e a partida se dão com intervalo não superior a 24
    // horas, e sempre chegam e saem no mesmo dia.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora de chegada: ");
        int horasC = sc.nextInt();
        System.out.println("Minutos: ");
        int minutosC = sc.nextInt();
        System.out.println("Digite a hora da saida: ");
        int horasS = sc.nextInt();
        System.out.println("Minutos: ");
        int minutosS = sc.nextInt();

        if (horasC < 0 && minutosC < 0 && horasC <= 23 && minutosC <= 59 && horasS <= 23 && minutosS <= 59) {
            System.out.println("");
        }
        int tempo = minutosS - horasC;
        int horas = tempo / 60;
        int resto = tempo % 60;

        if (tempo < 30) {
            horas = 1;
        } else {
            if (resto >= 30) {
                horas++;
            }
            if (horas == 0) {
                horas = 1;
            }
        }

        double preco = 0;
        if (horas <= 2) {
            preco = horas * 5.0;
        } else if (horas <= 4) {
            preco = (2 * 5.0) + (horas - 2) * 7.5;
        } else {
            preco = (2 * 5.0) + (2 * 7.5) + (horas - 4) * 10.0;
        }

        System.out.println("Tempo estacionado: " + horas + " hora");
        System.out.println("Preço cobrado = R$" + preco);
        sc.close();
    }
}