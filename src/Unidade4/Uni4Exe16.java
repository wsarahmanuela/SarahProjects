package Unidade4;

import java.util.Scanner;

public class Uni4Exe16 {
    // Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
    // Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher 
    // mais velha.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade de dois homens: ");
        int idadeH1 = sc.nextInt();
        int idadeH2 = sc.nextInt();

        System.out.println("Digite a idade de duas mulheres: ");
        int idadeM1 = sc.nextInt();
        int idadeM2 = sc.nextInt();

        int homemMaisVelho, homemMaisNovo;
        int mulherMaisVelha, mulherMaisNova;

        if (idadeH1 > idadeH2) {
            homemMaisVelho = idadeH1;
            homemMaisNovo = idadeH2;
        } else {
            homemMaisVelho = idadeH2;
            homemMaisNovo = idadeH1;
        }

        if (idadeM1 > idadeM2) {
            mulherMaisVelha = idadeM1;
            mulherMaisNova = idadeM2;
        } else {
            mulherMaisVelha = idadeM2;
            mulherMaisNova = idadeM1;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
        sc.close();
    }
}