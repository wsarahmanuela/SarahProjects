package Unidade4;

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String curso;

        System.out.println("Opcao do aluno: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                curso = "Curso invalido";
        }
        sc.close();
    }

}
