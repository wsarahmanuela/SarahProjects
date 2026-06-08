package Prova;

import java.util.Scanner;

public class Questao1Prova {

    private Scanner sc = new Scanner(System.in);

    private void teste(int vetor[], int tamanho, int numero) {
        int aux = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; i < i; j++) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
            numero++;  
        }
    }
    public Questao1Prova(){

    }
    public static void main(String[] args) {
        Questao1Prova questao1Prova = new Questao1Prova();
        questao1Prova.teste(null, 0, 0);
    }

}
