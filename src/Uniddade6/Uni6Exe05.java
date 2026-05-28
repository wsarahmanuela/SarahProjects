package Uniddade6;

import java.util.Scanner;

public class Uni6Exe05 {
    private Scanner sc = new Scanner(System.in);
    private String[] perguntas = new String[]{
        "Gosta de música sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta da Oktoberfest?"};

        private String[] rapaz = new String[perguntas.length];
        private String[] moca = new String[perguntas.length];
        private int afinidade = 0;

        private void obterRespostaRapaz(){
            for(int i = 0; i <perguntas.length; i++){
                System.out.println(perguntas[i]);
                System.out.println("Digite SIM ou NAO ou IND");
                rapaz[i] = sc.next();
            }
        }
        private void obterRespostaMoca(){
            for(int i = 0; i <perguntas.length; i++){
                System.out.println(perguntas[i]);
                System.out.println("Digite SIM ou NAO ou IND");
                moca[i] = sc.next();
            }
        }
        private void calcularAfinidade(){
            for(int i = 0; i<perguntas.length; i++){
                if(rapaz[i].equalsIgnoreCase("Sim") && moca[i].equalsIgnoreCase("Sim")){
                    afinidade += 3;
                } 
            }
        }



}
