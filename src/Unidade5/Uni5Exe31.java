package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int divisor = 2;
        System.out.println("Digite um numero primo: ");
        numero = sc.nextInt();

        while (numero > 1) {
            if(numero % divisor == 0){
                numero /= divisor;
                System.out.println(numero + " = " + divisor);
            } else {
                divisor++;
            }
        }

    }

}
