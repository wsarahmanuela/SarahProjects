package Unidade3;

import java.util.Scanner;

public class Uni3Exe15 {
    private int numero;
    public Uni3Exe15(int numero){
        this.numero = numero;
    }
    public int centena(){
        int centena = numero / 100;
        return centena;
    }
    public int dezena(){
        int dezena =  (numero%100) / 10;
        return dezena;
    }
    public int unidade(){
        int unidade = numero%10;
        return unidade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 3 digitos: ");
        int numero = sc.nextInt();
        Uni3Exe15 inteiro = new Uni3Exe15(numero);
        System.out.println(inteiro.centena()+" centenas "+inteiro.dezena()+" dezena "+inteiro.unidade()+" unidade");
        sc.close();
    }

}
