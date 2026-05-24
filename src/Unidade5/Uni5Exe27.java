package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int pecasManha = 0, pecasTarde = 0;
        int soma = 0;
        float valor = 0;
        float maiorProducao = 0, diaMaiorProducao = 0;
        int novoFuncionario;

        while (true) {
            System.out.println("Digite o dia do mes de abril: ");
            dia = sc.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Dia invalido");
            }
            System.out.println("Peças produzidasno periodo da manhã: ");
            pecasManha = sc.nextInt();
            System.out.println("Peças produzidas no periodo da tarde: ");
            pecasTarde = sc.nextInt();
            soma = pecasManha + pecasTarde;

            if (soma > 100 && pecasManha >= 30 && pecasTarde >= 30) {
                valor = soma * 0.80f;
            } else {
                valor = soma * 0.50f;
            }

            valor = (pecasManha * 0.40f) + (pecasTarde * 0.30f);

            if (valor > maiorProducao) {
                maiorProducao = valor;
                diaMaiorProducao = dia;
            }
            if (pecasManha > pecasTarde) {
                System.out.println("Manhã produziu mais: " + pecasManha);
            } else {
                System.out.println("Tarde produziu mais: " + pecasTarde);
            }

            System.out.println("Novo funcionário (1.sim 2.não)? ");
            novoFuncionario = sc.nextInt();
            if (novoFuncionario == 2) {
                break;
            }

        }

    }

}
