package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        int saida = 0;
        System.out.println("Digite o dia da semana que vc quer que comece: ");
        entrada = sc.nextInt();
        System.out.println("Digite se quer o mes com 30 ou 31 dias: ");
        saida = sc.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");
        int indice = entrada - 1;
        int espaco = 0;

        while (espaco < indice) {
            System.out.print("\t");
            espaco++;// aqui sempre vai pular os espacos
        }
        int dia = 1;
        while (dia <= saida) {
            System.out.print(dia + "\t");
            indice++;
            dia++;
            if (indice == 7) {
            System.out.println(); 
            indice = 0; 
        }
        }//nunca mais  
        
    }

}
