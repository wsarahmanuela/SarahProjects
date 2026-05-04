package Unidade2;
import java.util.Scanner;

public class Uni2Exe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comprimento = 0;
        float altura = 0;
        System.out.println("Digite o comprimento em metros: ");
        comprimento = sc.nextFloat();
        System.out.println("Digite a altura em metros: ");
        altura = sc.nextFloat();

        float area = comprimento * altura;
        float quantAzulejo = area * 9;
        float total = quantAzulejo * 12.50f;

        System.out.println(total);
        sc.close();
    }
}
