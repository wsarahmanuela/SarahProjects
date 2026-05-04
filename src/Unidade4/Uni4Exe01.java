package Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {
    // A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
    // que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
    // hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
    // de horas trabalhadas em um mês, o valor por hora e escreva o salário total do
    // funcionário, que deverá ser acrescido das horas extras, caso tenham sido
    // trabalhadas (considere que o mês possua 4 semanas exatas).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas: ");
        int horasMes = sc.nextInt();
        System.out.println("Digite o valor da sua hora: ");
        int horasValor = sc.nextInt();

        float salarioTotal = horasMes * horasValor;
        float salarioExtra;
        if (horasMes > 160) {// quantidade de horas extras
            salarioExtra = (horasMes - 160) * (horasValor / 2);// 50% a mais da hora
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.println("O salario total é: " + salarioTotal);
        sc.close();
    }

}
