package Unidade2;
import java.util.Scanner;

public class Uni2Exe07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float salario = 0;
        float totalVendas;
        
        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();
        System.out.println("Digite o salario do funcionario: ");
        salario = sc.nextFloat();
        System.out.println("Digite o total de vendas do funcionario: ");
        totalVendas = sc.nextInt();

        float total = salario + (totalVendas*0.15f);

        System.out.printf("O funcionario %s recebera %.2f no final do mes", nome, total);
        sc.close();
    }
}
