package Unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a prmeira idade: ");
        int idade1 = sc.nextInt();
        System.out.println("Digite a segunda idade: ");
        int idade2 = sc.nextInt();
        System.out.println("Digite a segunda idade: ");
        int idade3 = sc.nextInt();

        if (idade1 == idade2 && idade1 == idade2 && idade1 == idade3) {
            System.out.println("Trigemeos");
        } else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("Gemeos");
        } else {
            System.out.println("Apenas irmaos ");
        }
        sc.close();
    }
}
