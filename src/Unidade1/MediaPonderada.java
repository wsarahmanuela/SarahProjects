package Unidade1;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        float p1 = 0;
        float p2 = 0;
        float[] ativ = new float[6];
        float projetoFinal = 0;
        float soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a prova 1: ");
        p1 = sc.nextFloat();

        System.out.println("Digite a prova 2: ");
        p2 = sc.nextFloat();
       
        System.out.println("Digite o projeto final: ");
        projetoFinal = sc.nextFloat();

        for(int i = 0; i < ativ.length; i++){
            System.out.println("Digite as notas das atividades ");
            ativ[i] = sc.nextFloat();
            soma = soma+ativ[i];
        }
        float mediaAtiv = soma / ativ.length;

        float mediaAritmetrica = (p1*0.20f)+(p2*0.20f)+(mediaAtiv*0.20f)+(projetoFinal*0.30f);
        System.out.println("A media é: "+mediaAritmetrica);
        sc.close();
    }

}
