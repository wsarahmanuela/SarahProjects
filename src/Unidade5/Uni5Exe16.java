package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String genero;
        float altura = 0;
        float somaTotalF = 0, somaTotal = 0;
        int contF = 0, cont = 0;
        while (true) {
            System.out.println("Digite sua altura: ");
            altura = sc.nextFloat();
            if(altura == 0){
                break;
            }
            sc.nextLine();
            System.out.println("Digite seu genero: ");
            genero = sc.nextLine().toUpperCase();

            if(genero.equalsIgnoreCase("F")){
                somaTotalF += altura; // vai ser so para a media das mulheres
                contF++;
            }
            if(genero.equalsIgnoreCase("M")){
                somaTotal += altura;
                cont++;
            }
            if(genero.equalsIgnoreCase("O")){
                somaTotal += altura;
                cont++;
            }
        }
        float mediaF = somaTotalF / contF;
        float media = somaTotal / cont;

        System.out.println("A media da altura das mulheres é: "+mediaF);
        System.out.println("A media da altura do grupo é: "+media);
    }

}
