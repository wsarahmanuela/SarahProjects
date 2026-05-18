package Unidade5;

import java.util.Scanner;

public class Uni5Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chico = 1.50f;
        float ze = 1.10f;
        int anos = 0;
        while (chico >= ze) {
            chico += 0.02;
            ze += 0.03;
            anos += 1;
        }
        System.out.println("O ano de diferenca: " + anos);
    }

}
