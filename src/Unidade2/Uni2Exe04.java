package Unidade2;
import java.util.Scanner;

public class Uni2Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = 0;
        float n2 = 0;

        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2  = sc.nextFloat();

        float media = ((n1*3.5f)+(n2*7.5f))/11f;
        System.out.println("A media é: "+media);
        sc.close();
    }
}
