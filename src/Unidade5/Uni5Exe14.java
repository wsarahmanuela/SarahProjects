package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;
        float totalPC = 0;
        float totalPV = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Nome da mercadoria: ");
            String nome = sc.next();
            System.out.println("Preco de compra: ");
            float pc = sc.nextFloat();
            System.out.println("Preco de venda: ");
            float pv = sc.nextFloat();

            totalPC = totalPC + pc;
            totalPV = totalPV + pv;

            float lucro = (pv - pc) / pc * 100;

            if (lucro < 10) {
                menor10++;
            } else if (lucro <= 20) {
                entre10e20++;
            } else {
                maior20++;
            }
        }
        float lucroTotal = totalPV - totalPC;

        System.out.println("Lucro < 10%: " + menor10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro > 20%: " + maior20);
        System.out.println("Total de compra: " + totalPC);
        System.out.println("Total de venda: " + totalPV);
        System.out.println("Lucro total: " + lucroTotal);
        sc.close();
    }
}