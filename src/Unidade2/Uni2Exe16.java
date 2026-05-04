package Unidade2;
import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant1 = 0;
        int quant2 = 0;
        int quant3 = 0;
        System.out.println("Digite a quantidade de refrigerante lata: ");
        quant1 = sc.nextInt();
        System.out.println("Digite a quantidade de refrigerante 600ml: ");
        quant2 = sc.nextInt();
        System.out.println("Digite a quantidade de refrigerante 2 litros: ");
        quant3 = sc.nextInt();
        int lata = quant1*350;
        int garrafa = quant2*600;
        int litros = quant3*2000;
        int soma = (lata+garrafa+litros)/1000;
        System.out.println("A quantidade de litros que comprou: "+soma);
        sc.close();
    }
}
