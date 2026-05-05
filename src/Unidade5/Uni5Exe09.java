package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        String nomes = " ";
        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();

            if (idade == 18) {
                nomes = nomes + nome + " ";
            }
            if (idade > 20) {
                cont++;
            }
        }
        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + cont);
        sc.close();
    }

}
