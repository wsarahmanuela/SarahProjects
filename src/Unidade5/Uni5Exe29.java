package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valor = 0;
        float nota100 = 0,  nota50 = 0,  nota20 = 0,  nota10 = 0,  nota5 = 0,  nota2 = 0,  nota1 = 0;
        System.out.println("Digite um valor: ");
        valor = sc.nextFloat();
        
        while (valor >= 100) {
            valor -= 100;//subtrai a nota do valor
            nota100++;//conta mais uma nota
        }
        while (valor >= 50) {
            valor -= 50;
            nota50++;
        }
        while (valor >= 20) {
            valor -= 20;
            nota20++;
        }
        while (valor >= 10) {
            valor -= 10;
            nota10++;
        }
        while (valor >= 5) {
            valor -= 5;
            nota5++;
        }
        while (valor >= 2) {
            valor -= 2;
            nota2++;
        }
        while (valor >= 1) {
            valor -= 1;
            nota1++;
        }
        System.out.println("Notas de 100: "+nota100);
        System.out.println("Notas de 50: "+nota50);
        System.out.println("Notas de 20: "+nota20);
        System.out.println("Notas de 10: "+nota10);
        System.out.println("Notas de 5: "+nota5);
        System.out.println("Notas de 2: "+nota2);
        System.out.println("Notas de 1: "+nota1);
    }

}
