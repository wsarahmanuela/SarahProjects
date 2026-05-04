package Unidade1;

import java.text.DecimalFormat;

public class Arredondamento {
    public static void main(String[] args) {
        float numero = 7.873254f;
        System.out.println("Nota: " + numero);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nota: " + df.format(numero));

        System.out.printf("Nota: %.2f%n", numero);
    }

}
