package Unidade2;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        System.out.println("Digite o valor do eixo x1: ");
        x1 = sc.nextDouble();
        System.out.println("Digite o valor do eixo y1: ");
        y1 = sc.nextDouble();
        System.out.println("Digite o valor do eixo x2: ");
        x2 = sc.nextDouble();
        System.out.println("Digite o valor do eixo y2: ");
        y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1,2));
        System.out.printf("%.4f", distancia);
        sc.close();
    }
}
