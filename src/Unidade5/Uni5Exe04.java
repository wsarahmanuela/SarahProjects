package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double soma = 0;
        int numerador = 3;
        for (int i = 1; i <= 20; i++) {
            int dominador = i * (i + 1);

            soma = soma + (double) numerador / dominador;
            numerador += 2;

        }
        System.out.println(soma);
    }

}
