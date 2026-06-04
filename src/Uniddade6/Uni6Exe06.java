package Uniddade6;

import java.util.Scanner;

public class Uni6Exe06 {
    private Scanner sc = new Scanner(System.in);
    private double[] vetor; 

    
    public void tamanhovetor() {
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        vetor = new double[n];
    }
    private void preencherVetor(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite os numeros para preencher o vetor: ");
            vetor[i] = sc.nextInt();
        }
    }
    private boolean pesquisarValor() {
        System.out.println("Informe um numero real: ");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Numero " + numero + " encontrado na posicao " + i);
                encontrado = true;
                return true;
            }
        }
        if (!encontrado) {
            System.out.println("Numero nao encontrado");
        }
        return true;
    }
    private void mostrarVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.print(" |");

        }
    }
    public Uni6Exe06(){

    }
    public static void main(String[] args) {
        Uni6Exe06 uni6Exe06 = new Uni6Exe06();
        uni6Exe06.tamanhovetor();
        uni6Exe06.preencherVetor();
        uni6Exe06.pesquisarValor();
        uni6Exe06.mostrarVetor();
    }

}
