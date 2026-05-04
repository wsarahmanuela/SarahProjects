package Unidade2;
import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int valor = sc.nextInt();
        System.out.println(valor);
        System.out.println(valor/100 + " nota de 100,00");
        valor = valor % 100;
        System.out.println(valor/50 + " nota de 50,00");
        valor = valor % 50;
        System.out.println(valor/20 + " nota de 20,00");
        valor = valor % 20;
        System.out.println(valor/10 + " nota de 10,00");
        valor = valor % 10;
        System.out.println(valor/5 + " nota de 5,00");
        valor = valor % 5;
        System.out.println(valor/2 + " nota de 2,00");
        valor = valor % 2;
        System.out.println(valor/1 + " nota de 1,00");
        valor = valor % 1;


        sc.close();
    }

}
