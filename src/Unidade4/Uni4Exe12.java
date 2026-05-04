package Unidade4;

import java.util.Scanner;

public class Uni4Exe12 {
    // Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos
    // lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem
    // ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique
    // e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo
    // escaleno". Em caso negativo, informe que os mesmos não formam um triângulo.
    // Considere que:
    // o comprimento de cada lado de um triângulo é menor que a soma dos
    // comprimentos dos outros lados
    // um triângulo equilátero tem três lados iguais
    // um triângulo isóscele tem dois lados iguais e um diferente
    // um triângulo escaleno tem três lados diferentes
    public static void main(String[] args) {
        float lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado1: ");
        lado1 = sc.nextFloat();
        System.out.println("Digite o lado2: ");
        lado2 = sc.nextFloat();
        System.out.println("Digite o lado3: ");
        lado3 = sc.nextFloat();

        if (lado1 > lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Não forma um triangulo");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É equlilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("É isosceles");
        } else {
            System.out.println("É escaleno");
        }
        sc.close();
    }

}
