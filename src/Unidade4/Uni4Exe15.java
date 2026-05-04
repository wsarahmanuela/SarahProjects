package Unidade4;

import java.util.Scanner;

public class Uni4Exe15 {
    // Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
    // A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. 
    // Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste.
    //  O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionario ira receber 5% de reajuste");
        } else if (meses <= 48) {
            System.out.println("O funcionario ira receber 7% de reajuste");
        } else {
            System.out.println("O funcionario nao possui reajuste definido");
        }
        sc.close();
    }

}
