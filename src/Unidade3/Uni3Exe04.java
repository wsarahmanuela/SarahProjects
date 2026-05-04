package Unidade3;

import java.util.Scanner;

public class Uni3Exe04 {
    // Faça um programa para ler três notas de um aluno em uma disciplina e
    // imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
    private float nota1, nota2, nota3;

    public Uni3Exe04(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float mediaFinal() {
        return ((this.nota1 * 5) + (this.nota2 * 3) + (this.nota3 * 2)) / 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        Uni3Exe04 uni3Exe04 = new Uni3Exe04(nota1, nota2, nota3);
        System.out.println("A media final é: " + uni3Exe04.mediaFinal());
        sc.close();
    }

}
