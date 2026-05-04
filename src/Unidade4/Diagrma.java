package Unidade4;

import java.util.Scanner;

public class Diagrma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        if (idade > 18){
            System.out.println("Adulto");
        }
        else if(idade > 6 && idade <18){
            System.out.println("Criança");
        }else{
            System.out.println("Infantil");
        }
        sc.close();

        }
}
   




