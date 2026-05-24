package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pedagio = 0;
        float distancia;
        float valorMAximo;
        int totalTrechos = 0;       
        int acimaDolimite = 0;      
        int longoEaceito = 0;       
        System.out.println("Digite o valor que se recusa a pagar: ");
        valorMAximo = sc.nextFloat();
        while (true) {
            System.out.println("Digite o valor do pedagio: ");
            pedagio = sc.nextFloat();
            if (pedagio == -1) {    
                break;
            }
            System.out.println("Digite a distancia: ");
            distancia = sc.nextFloat();
            totalTrechos++;

            if (pedagio <= valorMAximo) {
                acimaDolimite++;
            }

            if (distancia >= 150 && pedagio <= valorMAximo) {
                longoEaceito++;
            }
        }
        System.out.println("Trechos com valor acima do qual ele nega-se a pagar: " + totalTrechos);
        System.out.println("quantidade de trechos informados: " + acimaDolimite);
        System.out.println("trechos acima de 150km com valor aceito por ele: " + longoEaceito);
    }

}
