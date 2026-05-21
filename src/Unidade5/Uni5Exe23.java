package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        float totalDeVendas;
        float salario = 0;
        char opcao = 's';
        int n = 0;

        while (opcao == 's') {
            System.out.println("Digite o nome: ");
            nome = sc.next();
            sc.nextLine();
            System.out.println("Digite o total de vendas (em R$): ");
            totalDeVendas = sc.nextFloat();
            System.out.println("Digite o salario: ");
            salario = sc.nextFloat();
            System.out.println("Informe o numero de produtos: ");
            n = sc.nextInt();

            n *= 0.30f;
            salario += n;

            System.out.println("Vendedor: " + nome);
            System.out.println("Salário final: R$ " + salario);

            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            opcao = sc.next().charAt(0);
            if (opcao == 'n') {
                break;
            }
        }

    }

}
