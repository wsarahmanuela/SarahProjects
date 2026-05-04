package Unidade3;

import java.util.Scanner;

public class Uni3Exe07 {
    // Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350
    // ml,
    // garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma
    // determinada quantidade de cada formato,
    // faça um programa para calcular quantos litros de refrigerante ele comprou.
    private int quant1, quant2, quant3;

    public Uni3Exe07(int quant1, int quant2, int quant3) {
        this.quant1 = quant1;
        this.quant2 = quant2;
        this.quant3 = quant3;
    }

    public int soma() {
        int lata = this.quant1 * 350;
        int garrafa = this.quant2 * 600;
        int litros = this.quant3 * 2000;
        return (lata + garrafa + litros) / 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade do refrigerante lata");
        int lata = sc.nextInt();
        System.out.println("Digite a quantidade do refrigerante 600ml: ");
        int garrafa = sc.nextInt();
        System.out.println("Digite a quantidade do refrigerante dois litros: ");
        int litros = sc.nextInt();

        Uni3Exe07 quantidade = new Uni3Exe07(lata, garrafa, litros);
        System.out.println("O cliente comprou ao total " + quantidade.soma() + "litros");
        sc.close();
    }
}
