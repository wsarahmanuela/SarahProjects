package Uniddade6;

import java.util.Scanner;

public class Uni6Exe09 {
    private Scanner sc = new Scanner(System.in);
    private int[] sexo = new int[30];
    private int[] nota = new int[30];
    private int[] idade = new int[30];

    private void perguntas() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Feminino (1) ou Masculino (2)?");
            sexo[i] = sc.nextInt();
            System.out.println("uma nota para o cinema (zero até dez, valor inteiro)?");
            nota[i] = sc.nextInt();
            System.out.println("Sua idade? ");
            idade[i] = sc.nextInt();
        }
    }
    private int mediaCinema() {
        int soma = 0;
        for (int i = 0; i < 30; i++) {
            soma += nota[i];
        }
        int media = soma / 30;
        System.out.println("A media do cinema é: " + media);
        return media;
    }
    private void mediaCinemaHomens() {
        int soma = 0;
        int homens = 0;
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                homens++;
            } else {
                System.out.println("Nao é homem");
            }
        }
        int media = soma / homens;
        System.out.println("A media do cinema pelo os homens é: " + media);

    }
    private void mediaCinemaMulhres() {
        int soma = 0;
        int mulherenovas = 0;
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] >= 25) {
                soma += nota[i];
                mulherenovas++;
                System.out.println("Nao é mulher jovem");
            } else {
                System.out.println("Nao é mulher");
            }
        }
        int media = soma / mulherenovas;
        System.out.println("A media do cinema para mulheres novas é: " + media);
    }
    private void mulheesAcimade50() {
        int contMulhres = 0;
        double media = mediaCinema();
        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaCinema()) {
                contMulhres++;
            }

        }
        System.out.println("A quantidade de mulhres acima de 50 é: " + contMulhres);
    }
    public Uni6Exe09(){

    }
    public static void main(String[] args) {
        Uni6Exe09 uni6Exe09 = new Uni6Exe09();
        uni6Exe09.perguntas();
        uni6Exe09.mediaCinema();
        uni6Exe09.mediaCinemaHomens();
        uni6Exe09.mediaCinemaMulhres();
        uni6Exe09.mulheesAcimade50();
    }

}
