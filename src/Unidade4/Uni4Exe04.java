package Unidade4;

import java.util.Scanner;

public class Uni4Exe04 {
    //Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor;
        System.out.println("Digite um valor: ");
        valor = sc.nextFloat();
        if (valor % 1 != 0) {
            System.out.println("Casas decimais foram digitadas");
        } else {
            System.out.println("Casas decimais não foram digitadas");
        }
        sc.close();
    }

}
