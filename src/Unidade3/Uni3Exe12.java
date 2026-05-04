package Unidade3;

import java.util.Scanner;

public class Uni3Exe12 {
    //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
    // A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) 
    // e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
    // Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
    private String nome;
    private int horasTrabalhadas;
    private int numeroDependentes;

    public Uni3Exe12(String nome, int horasTrabalhadas, int numeroDependentes) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.numeroDependentes = numeroDependentes;
    }

    public float salario() {
        float salarioTrabalho = horasTrabalhadas * 10f;
        float salarioFamilia = numeroDependentes * 60f;
        return salarioTrabalho + salarioFamilia;
    }

    public float salarioLiquido() {
        float salarioTrabalho = horasTrabalhadas * 10f;
        float inss = salarioTrabalho * 0.085f;
        float imposto = salarioTrabalho * 0.05f;
        return salario() - (inss + imposto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o numero de dependentes: ");
        int numeroDependentes = sc.nextInt();

        Uni3Exe12 uni3Exe12 = new Uni3Exe12(nome, horasTrabalhadas, numeroDependentes);
        System.out.println("O funcionário " + nome + " possui um salário bruto de R$" + uni3Exe12.salario()
                + " e um salário líquido de " + uni3Exe12.salarioLiquido());
        sc.close();
    }
}
