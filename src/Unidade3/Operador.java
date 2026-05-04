package Unidade3;

public class Operador {

    public static void main(String[] args) {
        int num1 = 0;
        num1++;
        num1++;
        num1++;
        int num2 = 5;
        num1 = num1+num2;
        num1 += num2;

        num1 = num1 - num2;
        num1 -= num2;

        num1 = num1 * num2;
        num1 *= num2;

        num1 = num1 / num2;
        num1 /= num2;

        num1 = num1 % num2;
        num1 %= num2;

        String texto = "Aula de Introd. a programação";
        System.out.println(texto.toUpperCase());

        texto = texto.toLowerCase();
        System.out.println(texto);

        String texto1 = "BANANA";
        String texto2 = "banana";

        boolean verdade = false;
        verdade = (texto1.toUpperCase().equals(texto2.toUpperCase()));
        System.out.println(verdade);
    }
}
