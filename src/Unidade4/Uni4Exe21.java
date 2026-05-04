package Unidade4;

import java.util.Scanner;

public class Uni4Exe21 {
    //O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. 
    // O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas
    //  e a altura está em metros, de acordo com a fórmula:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, massa;

        System.out.println("Altura: ");
        altura = sc.nextFloat();
        System.out.println("Massa: ");
        massa = sc.nextFloat();

        float imc = massa / (altura * altura);

        if (imc < 18.5f) {
            System.out.println("Magreza");
        } else if (imc <= 24.9f) {
            System.out.println("Saudavel");
        } else if (imc <= 29.9f) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9f) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9f) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
        sc.close();
    }

}
