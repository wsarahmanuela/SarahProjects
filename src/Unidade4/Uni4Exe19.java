package Unidade4;

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        System.out.println("Valor de X: ");
        x = sc.nextFloat();
        System.out.println("Valor de Y: ");
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 2) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        }
        sc.close();
    }
}
