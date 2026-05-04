package Unidade2;
import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dobras = 0;
        System.out.println("Digite o numero de dobras: ");
        dobras = sc.nextInt();

        int total = (int) Math.pow(2, dobras);
        System.out.println("O numero de dobras é: "+total);
        sc.close();
    }

}
