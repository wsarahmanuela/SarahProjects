package Unidade2;
import java.util.Scanner;

public class Uni2Exe03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = 0;
        double area = 0;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();

        area = (Math.pow(raio, 2)*Math.PI);
        System.out.println("O valor é: "+area);
        sc.close();
    }
}
