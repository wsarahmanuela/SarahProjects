package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;
        float totalCompra = 0;
        float totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Nome da mercadoria: ");
            String nome = sc.next();
            System.out.println("O preco da compra: ");
            float pc = sc.nextFloat();
            System.out.println("O preco da venda: ");
            float pv = sc.nextFloat();

            float lucro = (pv - pc) / pc * 100;
            if (lucro <= 10) {
                menor10++;
            } else if (lucro <= 20) {
                entre10e20++;
            } else {
                maior20++;
            }
            System.out.println("");
        }
    }
}
