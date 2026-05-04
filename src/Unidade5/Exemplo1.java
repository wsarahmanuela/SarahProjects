package Unidade5;

public class Exemplo1 {
    public static void main(String[] args) {
        for (int numero = 100; numero >= 1; numero--) {
            System.out.println("O numero é: " + numero);
        }
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        for (int i = 2; i <= 1000; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

        }
    }

}
