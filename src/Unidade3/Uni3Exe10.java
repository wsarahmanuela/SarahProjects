package Unidade3;

import java.util.Scanner;

public class Uni3Exe10 {
    // Descreva um programa que leia o comprimento dos catetos de um triângulo
    // retângulo e calcule o comprimento da hipotenusa.
    private float oposto, adjacente;

    public Uni3Exe10(float oposto, float adjacente) {
        this.oposto = oposto;
        this.adjacente = adjacente;
    }

    public float hipotenusa() {
        return (float) Math.sqrt(oposto * oposto + adjacente * adjacente);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cateto oposto:");
        float oposto = sc.nextFloat();
        System.out.println("Cateto adjacente: ");
        float adjacente = sc.nextFloat();

        Uni3Exe10 formula = new Uni3Exe10(oposto, adjacente);
        System.out.println("A hipotenusa é: " + formula.hipotenusa());
        sc.close();
    }
}
