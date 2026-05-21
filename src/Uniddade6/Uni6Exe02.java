package Uniddade6;

import java.util.Scanner;

public class Uni6Exe02 {
    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private double media = 0;

    public Uni6Exe02() {
       
    }

    public void lerValores() {
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite um numero real: ");
            valores[i] = sc.nextDouble();
        }
    }

    public void calcularMedia() {
        double soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += valores[i];
        }
        media = soma/12;
    }

    public void listarValoresMaiorMedia() {
        for(int i = 0; i < 12; i++){
            if(valores[i] >= media){
                System.out.println("valor " + valores[i] + " maior que a média " + media);
            }
        }

    }

    public static void main(String[] args) {
        Uni6Exe02 uni6Exe02 = new Uni6Exe02();
        uni6Exe02.lerValores();
        uni6Exe02.calcularMedia();
        uni6Exe02.listarValoresMaiorMedia();
    }

}
