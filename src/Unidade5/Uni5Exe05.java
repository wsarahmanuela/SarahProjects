package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        n = sc.nextInt();
        int base = 8;
        if (n > 2) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(base + 2);
                }
                if (i % 2 != 0 && i > 1) {
                    base = base * 2;
                    System.out.println(base);
                }
            }
        } else {
            System.out.println("Numero deve ser maior que 2");
        }
        sc.close();
    }

}
