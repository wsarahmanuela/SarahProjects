package Uniddade6;

import java.util.Scanner;

public class Uni6Exe01 {
    private int tamanho = 10;
    private int[] numero = new int[tamanho];
    private Scanner sc = new Scanner(System.in);

    public Uni6Exe01(int tamanho, int numero[]) {
        this.tamanho = tamanho;
        this.numero = numero;
    }

    public void ler() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um numero");
            numero[i] = sc.nextInt();// o vetor na posiscao i
        }
    }

    public void escrver() {
        for (int i = tamanho - 1; i > 0; i++) {
            System.out.println("Numero: " + numero[i]);
        }
    }

    public static void main(String[] args) {
        Uni6Exe01 uni6Exe01 = new Uni6Exe01(0, null);
        uni6Exe01.ler();
        uni6Exe01.escrver();
    }

}
