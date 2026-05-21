package Uniddade6;

import java.util.Scanner;

public class Uni6Exe03 {
    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];

    public Uni6Exe03() {

    }

    public void lerValores() {
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite os valores: ");
            valores[i] = sc.nextDouble();
        }

    }

    public void ajustarValores() {
        for (int i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                valores[i] = valores[i] + (valores[i] * 0.05);
            } else {
                valores[i] = valores[i] + (valores[i] * 0.02);
            }

        }

    }

    public void escreverValoresAtualizados() {
        
    }

    public static void main(String[] args) {
        Uni6Exe03 uni6Exe03 = new Uni6Exe03();
    }

}
