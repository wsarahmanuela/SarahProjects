package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int numero = sc.nextInt();
        int count = 0;
        
        for(int i = 1; i <= numero; i++){
            for(int coluna = 1; coluna <= i; coluna++){
                System.out.printf("%-4d", + count);
                count ++;
            }
            System.out.println();
        }
        sc.close();
    }
}
