package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto = 0;
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;
        do {
            System.out.println("Digite seu voto: ");
            voto = sc.nextInt();
            if (voto == 1) {
                cand1++;
            } else if (voto == 2) {
                cand2++;
            } else if (voto == 3) {
                cand3++;
            } else if (voto == 4) {
                cand4++;
            } else if (voto == 5) {
                brancos++;
            } else if (voto == 6) {
                System.out.println("Votação encerrada!");
            } else {
                System.out.println("Opção incorreta");
            }
        } while (voto != 0);//aqui quebra 

        int totalVotos = cand1 + cand2 + cand3 + cand4 + nulos + brancos;
        float percentual = (nulos + brancos) / totalVotos * 100;

        System.out.println("Candidato 1: " + cand1);
        System.out.println("Candidato 2: " + cand2);
        System.out.println("Candidato 3: " + cand3);
        System.out.println("Candidato 4: " + cand4);
        System.out.println("Nulos: " + nulos);
        System.out.println("Brancos: " + brancos);
        System.out.println("nulos e brancos: " + percentual);
    }

}
