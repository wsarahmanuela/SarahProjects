package Unidade4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor diferente de 0: ");
        float v1 = sc.nextFloat();
        System.out.println("Digite o segundo valor diferente de 0: ");
        float v2 = sc.nextFloat();
        System.out.println("Escolha uma opcao: \n" +
                "1 - Soma de dois números \n" +
                "2 - Diferença entre dois números \n" +
                "3 - Produto entre dois números \n" +
                "4 - Divisão entre dois números (o denominador não pode ser zero)");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                float soma = v1 + v2;
                System.out.println("A soma dos dois numeros é: " + soma);
                break;
            case 2:
                float diferenca = v1 - v2;
                System.out.println("A diferenca entre dois numeros é: " + diferenca);
                break;
            case 3:
                float produto = v1 * v2;
                System.out.println("O produto dos dois numeros é: "+produto);
                break;
            case 4:
                float divisao = v1 / v2;
                System.out.println("A divisao dos dois numeros é: "+divisao);
                break;
        }
        sc.close();
    }
}
