package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 1;
        int e = 1;

        while (true) {
            System.out.println("Digite os pontos do D ou E: ");
            String jogada = sc.next();

            if (jogada.equals('d')) {
                d++;
            }
            if (jogada.equals('e')) {
                e++;
            }

            System.out.println("Placar D: \n" + d + "Placar E: " + e);
            int diferenca = Math.abs(d - e);
            int maior = Math.max(d, e);
            if(maior >= 21 && diferenca >= 2){
                break;
            }
            if(d > e){
                System.out.println("Vencedor D");
            } else {
                System.out.println("Vencedor E");
            }
        }
    }
}
