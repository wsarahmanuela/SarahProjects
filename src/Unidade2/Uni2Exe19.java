package Unidade2;
import java.util.Scanner;

public class Uni2Exe19 {
    //a+c = b+d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b = 0;
        float c = 0;
        float d = 0;
        System.out.println("Digite o valor de b: ");
        b = sc.nextFloat();
        System.out.println("Digite o valor de c: ");
        c = sc.nextFloat();
        System.out.println("Digite o valor de d: ");
        d = sc.nextFloat();

        float a = b + d - c;
        System.out.println("o valor de A é: "+a);
        sc.close();
    }

}
