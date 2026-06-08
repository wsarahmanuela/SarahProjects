package Uniddade6;

import java.util.Scanner;

public class Questao2 {
    private Scanner sc = new Scanner(System.in);
    private int[] numero = new int[10];
    private int maior = 0;
    private int menor = 0;

    private void lerNumero(){
        for(int i = 0; i < 10; i++){
            System.out.println("Digite os numeros: ");
            numero[i] = sc.nextInt();
        }
    }
    private void maiorNumero(){
        for(int i = 0; i < 10; i++){
            if(numero[i] > maior){
                numero[i] = maior;
                maior = numero[i];
            }
        }
        System.out.println("O maior numero é: "+maior);
    }
    private void menorNumero(){
        for(int i = 0; i < 10; i++){
            if(numero[i] < menor){
                numero[i] = menor;
                menor = numero[i];
            }
        }
        System.out.println("O menor numero é: "+menor);
    }
    private void somaNumeros(){
        int soma = 0;
        for(int i = 0; i < 10; i++){
            soma += numero[i];
        }
        System.out.println("A soma dos numeros é: "+soma);
    }
    private void mediaNumeros(){
        
    }

}
