package Unidade2;
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        int horas = numero/3600;
        int restos = numero%3600;
        int minutos = restos/60;
        int segundos = restos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }

}
