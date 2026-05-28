package Uniddade6;

import java.util.Scanner;

public class Uni6Exe04 {
    Scanner sc = new Scanner(System.in);
    private int tamanho = 10;
    private int[] vetor1 = new int[tamanho];
    private int[] vetor2 = new int[tamanho];
    private int[] vetor3 = new int[tamanho];

    public void lerValores() {
        System.out.println("Digite os valores do vetor 1");
        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor "+i);
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor 2");
        for(int i = 0; i<tamanho; i++){
            System.out.println("Digite o valor "+i);
            vetor2[i] = sc.nextInt();
        }
    }

    public void somarValores() {
        for(int i = 0; i < tamanho; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    public void escreverValores() {
        System.out.println("Vetor 1: [");
        for(int i = 0; i<tamanho; i++){
            if(i<tamanho-1){
                System.out.println(vetor1[i] + ",");
            } else {
                System.out.println(vetor1[i]);
            }
            
        }
        System.out.println("]");
        System.out.println("Vetor 2: [");
        for(int i = 0; i<tamanho; i++){
            System.out.println(vetor2[i] + ",");
        }
        System.out.println("]");
        System.out.println("Vetor 3: [");
        for(int i = 0; i <tamanho; i++){
            System.out.println(vetor3[i] + ",");
        }
    }

    public Uni6Exe04() {

    }

    public static void main(String[] args) {
        Uni6Exe04 uni6Exe04 = new Uni6Exe04();

    }

}
