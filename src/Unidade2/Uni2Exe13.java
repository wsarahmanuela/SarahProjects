package Unidade2;
import java.util.Scanner;

public class Uni2Exe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = 0;
        System.out.println("Digite a distância em km: ");
        km = sc.nextInt();
        int tempo = km * 2;
        System.out.println(tempo + " minustos");
        sc.close();
    }
}
