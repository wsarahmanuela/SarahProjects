package Unidade3;

import java.util.Scanner;

public class Uni3Exe14 {
    //Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
    // calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro
    private int distancia;
    private int tempo;

    public Uni3Exe14(int distancia, int tempo) {
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float velocidadeMedia() {
        float velocidade = this.distancia / this.tempo;
        return velocidade;
    }

    public float combustivelGasto() {
        float combustivel = this.distancia / 12f;
        return combustivel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia ");
        int distancia = sc.nextInt();
        System.out.println("Digite o tempo: ");
        int tempo = sc.nextInt();

        Uni3Exe14 calculo = new Uni3Exe14(distancia, tempo);
        System.out.println("A velocidade média foi de " + calculo.velocidadeMedia()
                + " km/h e a quantidade de combustível usado foi " + calculo.combustivelGasto() + " litros");
        sc.close();
    }

}
