package Unidade3;

import java.util.Scanner;

public class Uni3Exe03 {
    // Um motorista deseja abastecer seu tanque de combustível.
    // Escreva um programa para ler o preço do litro da gasolina e o valor do
    // pagamento e exibir quantos litros ele conseguiu colocar no tanque.
    private float litroGasolina;
    private float pagamento;

    public Uni3Exe03(float litroGasolina, float pagamento) {
        this.litroGasolina = litroGasolina;
        this.pagamento = pagamento;
    }

    public float litros() {
        return this.pagamento / this.litroGasolina;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do preço da gasolina: ");
        float litroGasolina = sc.nextFloat();
        System.out.println("Digite o valor do pagamento: ");
        float pagamento = sc.nextFloat();

        Uni3Exe03 uni3Exe03 = new Uni3Exe03(litroGasolina, pagamento);
        System.out.println("O motorista conseguiu colocar: " + uni3Exe03.litros() + "litros");
        sc.close();
    }
}
