package Unidade2;
import java.util.Scanner;

public class Uni2Exe08 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float codigo1, codigo2;
            float num1, num2;
            float valor1, valor2;

            System.out.println("O codigo da peça 1: ");
            codigo1 = sc.nextFloat();
            System.out.println("O numero de peça 1:");
            num1 = sc.nextFloat();
            System.out.println("O valor unitário de cada peça 1: ");
            valor1 = sc.nextFloat();

            System.out.println("O codigo da peça 2: ");
            codigo2 = sc.nextFloat();
            System.out.println("O numero de peça 2:");
            num2 = sc.nextFloat();
            System.out.println("O valor unitário de cada peça 2: ");
            valor2 = sc.nextFloat();

            float total = (num1 * valor1) + (num2 * valor2);

            System.out.println("O valor das peças 1 e paças 2 sera de "+ total);
            sc.close();
        }
}
