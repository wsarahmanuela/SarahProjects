package Unidade2;
import java.util.Scanner;

public class Uni2Exe09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valor;
        float dollar = 5.20f;

        System.out.println("Digite o valor para trocar dólares por reais: ");
        valor = sc.nextFloat();

        float reais = valor * dollar;
        System.out.println("O valor sera: "+reais);
        sc.close();
    }
}
