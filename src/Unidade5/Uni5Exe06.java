package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura;
        float soma = 0;
        float media = 0;
        for(int i = 1; i <= 20; i++){
            System.out.println("Altura da pessoa "+i +":");
            altura = sc.nextFloat();
            soma += altura;
        }
        media = soma / 20;
        System.out.println("A média das alturas é: "+media);
        sc.close();
    }

}
