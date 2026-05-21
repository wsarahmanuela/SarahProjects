package Unidade5;

public class Uni5Exe22 {
    public static void main(String[] args) {
        float salario = 2000;
        int ano = 1995;
        float aumento = 0.015f;

        while (ano <= 2026) {
            salario = salario + (salario * aumento);
            aumento *= 2;
            ano++;
        }
        System.out.println("O salario atual é: "+salario);
    }

}
