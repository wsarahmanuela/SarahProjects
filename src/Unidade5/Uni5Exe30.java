package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float limiteM = 0;
        int k = 0;
        int n = 0;
        int somaEntrou = 0;
        int somaNEntrou = 0;
        System.out.println("Digite o tamanho da mochila: ");
        limiteM = sc.nextFloat();
        System.out.println("Digite N: ");
        n = sc.nextInt();
        System.out.println("Digite K: ");
        k = sc.nextInt();

        while (limiteM > 0) {
            System.out.println(n + " ");
            n -= k;
        }
        
        String entraram = "";
        String foramFora = "";

        while (n > 0) {
            if(somaEntrou + n <= limiteM){
                entraram += n + " ";
                somaEntrou += n;
            } else {
                foramFora += n + " ";
                somaNEntrou += n;
            }
            n -= k;
        }
        System.out.println("\nEntraram:     " + entraram);
        System.out.println("Ficaram fora: " + foramFora);
        System.out.println("\nSoma dos que entraram:     " + somaEntrou);
        System.out.println("Soma dos que ficaram fora: " + somaNEntrou);
        // NAO ENTENDI NADAAAA
    }

}
