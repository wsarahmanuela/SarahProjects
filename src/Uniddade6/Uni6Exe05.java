package Uniddade6;

import java.util.Scanner;

public class Uni6Exe05 {
    private Scanner sc = new Scanner(System.in);
    private String[] perguntas = new String[] {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?" };

    private String[] rapaz = new String[perguntas.length];
    private String[] moca = new String[perguntas.length];
    private int afinidade = 0;

    private void obterRespostaRapaz() {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM ou NAO ou IND");
            rapaz[i] = sc.next();
        }
    }

    private void obterRespostaMoca() {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM ou NAO ou IND");
            moca[i] = sc.next();
        }
    }

    private void calcularAfinidade() {
        for (int i = 0; i < perguntas.length; i++) {
            if (rapaz[i].equalsIgnoreCase("Sim") && moca[i].equalsIgnoreCase("Sim")) {
                afinidade += 3;
            } else if (rapaz[i].equalsIgnoreCase("nao") && moca[i].equalsIgnoreCase("nao")) {
                afinidade += 3;
            } else if (rapaz[i].equalsIgnoreCase("ind") && (moca[i].equalsIgnoreCase("Nao") || moca[i].equalsIgnoreCase("sim"))) {
                afinidade += 1;
            } else if ((rapaz[i].equalsIgnoreCase("sim") || rapaz[i].equalsIgnoreCase("nao"))&& moca[i].equalsIgnoreCase("ind")) {
                afinidade += 1;
            } else if (rapaz[i].equalsIgnoreCase("Sim") && moca[i].equalsIgnoreCase("nao")) {
                afinidade -= 2;
            } else if (rapaz[i].equalsIgnoreCase("nao") && moca[i].equalsIgnoreCase("sim")) {
                afinidade -= 2;
            } else if (rapaz[i].equalsIgnoreCase("ind") && moca[i].equalsIgnoreCase("ind")) {
                afinidade += 3;
            }
        }
    }
    private void mostrarResultado(){
        if(afinidade == 15){
            System.out.println("Casem");
        } else if(afinidade >= 10){
            System.out.println("vocês têm muita coisa em comum!");
        } else if(afinidade >= 5){
            System.out.println("Talvez não dê certo :(");
        } else if(afinidade >= 0){
            System.out.println("Vale um encontro.");
        } else if(afinidade >= -9){
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
    public Uni6Exe05(){

    } public static void main(String[] args) {
        Uni6Exe05 uni6Exe05 = new Uni6Exe05();
        uni6Exe05.obterRespostaRapaz();
        uni6Exe05.obterRespostaMoca();
        uni6Exe05.calcularAfinidade();
        uni6Exe05.mostrarResultado();
    }

}
