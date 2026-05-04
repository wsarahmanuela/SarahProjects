package Unidade2;
import java.util.Scanner;

public class Uni2Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int funcionario = 0;
        float horasTrabalhada = 0;
        float valor = 0;

        System.out.println("Digite o ID  do funcionario:");
        funcionario = sc.nextInt();
        System.out.println("Digite a horas trabalhadas: ");
        horasTrabalhada = sc.nextFloat();
        System.out.println("Digite o valor que voce recebe: ");
        valor = sc.nextFloat();

        double salario =  horasTrabalhada * valor;

        System.err.println("Número do fucionario: "+funcionario);
        System.out.printf("Salario = R$ %.2f%n", salario);
        sc.close();
    }
}
