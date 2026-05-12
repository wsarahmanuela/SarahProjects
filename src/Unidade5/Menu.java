package Unidade5;

import java.util.Scanner;

public class Menu {

    private static double valor1;
    private static double valor2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - dividir");
            System.out.println("4 - multiplicar");
            System.out.println("9 - sair");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    informarValores(sc);
                    soma(valor1, valor2);
                    break;
                case 2:
                    informarValores(sc);
                    subtrair(valor1, valor2);
                    break;
                case 3:
                    informarValores(sc);
                    dividir(valor1, valor2);
                    break;
                case 4:
                    informarValores(sc);
                    multiplicar(valor1, valor2);
                    break;
                default:
                    break;
            }
        } while (num != 9);
    }

    public static void informarValores(Scanner sc) {
        System.out.println("Digite o primeiro numero: ");
        valor1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        valor2 = sc.nextDouble();
    }

    private static void multiplicar(double valor1, double valor2) {
        System.out.println("Numero escolhido: Multiplicar");
        System.out.println("Resultado: " + (valor1 * valor2));
    }

    private static void dividir(double valor1, double valor2) {
        System.out.println("Numero escolhido: Dividir");
        System.out.println("Resultado: " + (valor1 / valor2));
    }

    private static void subtrair(double valor1, double valor2) {
        System.out.println("Numero escolhido: Subtrair");
        System.out.println("Resultado: " + (valor1 - valor2));
    }

    private static void soma(double valor1, double valor2) {
        System.out.println("Numero escolhido: Soma");
        System.out.println("Resultado: " + (valor1 + valor2));
    }

}
