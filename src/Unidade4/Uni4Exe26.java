package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma opcao: \n" +
                "opção = T: calcular a área de um triângulo de base b e altura h \n" +
                "opção = Q: calcular a área de um quadrado de lado l \n" +
                "opção = R: calcular a área de um retângulo de base b e altura h \n" +
                "opção = C: calcular a área de um círculo de raio r");
        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'T':
                if (opcao == 'T') {
                    System.out.println("Digite a altura do triangulo: ");
                    float altura = sc.nextFloat();
                    System.out.println("Digite a base do tringulo: ");
                    float base = sc.nextFloat();
                    float area = (base * altura) / 2;
                    System.out.println("A area do tringulo é: " + area);
                }
            case 'Q':
                if (opcao == 'Q') {
                    System.out.println("Digite o lado: ");
                    float lado = sc.nextFloat();
                    float area = lado * lado;
                    System.out.println("A area do quadrado é: " + area);
                }
            case 'R':
                if (opcao == 'R') {
                    System.out.println("Digite a base do retangulo: ");
                    float base = sc.nextFloat();
                    System.out.println("Digite a altura do retangulo: ");
                    float altura = sc.nextFloat();
                    float area = base * altura;
                    System.out.println("A area do retangulo é: " + area);
                }
            case 'C':
                if (opcao == 'C') {
                    System.out.println("Digite o raio: ");
                    float raio = sc.nextFloat();
                    double area = Math.PI * Math.pow(raio, 2);
                    System.out.println("A area do circulo é: " + area);
                }
            default:
                System.out.println("Opcao invalida");
        }
        sc.close();
    }

}
