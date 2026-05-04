package Unidade4;

import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeM;
        int idadeZ;
        int idadeL;
        System.out.println("Digite a idade de marquinhos: ");
        idadeM = sc.nextInt();
        System.out.println("Digite a idade de Zezinho: ");
        idadeZ = sc.nextInt();
        System.out.println("Digite a idade de luluzinha: ");
        idadeL = sc.nextInt();

        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("O marquinhos é o caçula");
        } else if (idadeZ < idadeM && idadeZ < idadeL) {
            System.out.println("O zezinho é o cacula");
        } else {
            System.out.println("A luluzinha é a cacula");
        }
        sc.close();
    }
}
