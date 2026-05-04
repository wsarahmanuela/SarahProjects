package Unidade2;
import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0; 
        float d = 0;

        System.out.println("Digite o valor de a: ");
        a = sc.nextFloat();
        System.out.println("Digite o valor de b: ");
        b = sc.nextFloat();
        System.out.println("Digite o valor de c: ");
        c = sc.nextFloat();
        System.out.println("Digite o valor de d: ");
        d = sc.nextFloat();

        float diferenca = ((a*b)-(c*d));
        System.out.println("A diferenca é: "+diferenca);
        sc.close();
    }
}
