package Unidade2;
import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int horasTrabalhadas = 0 ;
        int dependentes = 0 ;
        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();
        System.out.println("Digite as horas trabalhadas: "); 
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o numero de dependentes: ");
        dependentes = sc.nextInt();

        float salarioHoras = horasTrabalhadas * 10;
        float salarioFamilia = dependentes * 60;
        float salarioBruto = salarioHoras + salarioFamilia;

        float inss = salarioHoras * 0.085f;
        float imposto = salarioHoras * 0.005f;
        float salarioLiquido = salarioBruto - inss - imposto;

        System.out.println(nome);
        System.out.println(salarioBruto);
        System.out.println(salarioLiquido);
        sc.close();
    }

}
