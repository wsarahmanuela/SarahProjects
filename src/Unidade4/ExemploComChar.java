package Unidade4;

import java.util.Scanner;

public class ExemploComChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().toUpperCase().charAt(0);
        switch (letra) {
            case 'A':
                System.out.println("Letra A digitada");
                break;
            case 'B':
                System.out.println("Letra B digitada");
                break;
            default: 
                System.out.println("Letra invalida");
                break;
        }
        sc.close();
    }

}
