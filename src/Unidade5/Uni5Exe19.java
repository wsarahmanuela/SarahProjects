package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float compra = 0;
        float valor = 0;
        while (true) {
            System.out.println("Digite o valor da compra: ");
            compra = sc.nextFloat();
            if(compra == 0){
                break;
            }
            if(compra > 500){
                valor = compra * 0.20f;
            } else {
                valor = compra * 0.15f;
            }
            float valorFinal = compra - valor;
            System.out.println("Valor a pagar R$:"+valorFinal);
        }
    }
}
