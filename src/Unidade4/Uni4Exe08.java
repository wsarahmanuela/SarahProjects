package Unidade4;

import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        boolean vogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');

        if (vogal) {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        sc.close();
    }

}
