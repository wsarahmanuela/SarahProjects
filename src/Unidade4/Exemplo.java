package Unidade4;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos validar se você tem direito a meia entrada: ");

        System.out.println("Dogite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("É doador de sangue? ");
        String resposta = sc.next();

        boolean doador = false;
        if(resposta.equalsIgnoreCase("Sim")){
            doador = true;
        }

        if(idade < 18 || idade >= 60 || doador){
            System.out.println("Meia entrada");
        }else{
            System.out.println("Não tem direito");
        }

        sc.close();
    }
   
}
