package Unidade4;

import java.util.Scanner;

public class Familia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeSarah, idadeGreyce, idadeLucas;

        System.out.println("Digite a idade da Sarah: ");
        idadeSarah = sc.nextInt();
        System.out.println("Digite a idade da Greyce: ");
        idadeGreyce = sc.nextInt();
        System.out.println("Digite a idade do Lucas: ");
        idadeLucas = sc.nextInt();

        if(idadeSarah < idadeGreyce && idadeSarah < idadeLucas){
            System.out.println("A Sarah é a cacula da familia");
        }else if(idadeGreyce < idadeSarah && idadeGreyce <idadeLucas){
            System.out.println("A greyce é a cacula da familia");
        }
        else{
            System.out.println("O Lucas é o cacula da familia");
        }
        sc.close();
    }

}
