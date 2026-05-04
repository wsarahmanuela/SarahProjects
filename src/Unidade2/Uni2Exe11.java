package Unidade2;
import java.util.Scanner;

public class Uni2Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;
        System.out.println("Digite o valor de A:");
        a = sc.nextFloat();
        System.out.println("Digite o valor de B:");
        b = sc.nextFloat();
        System.out.println("Digite o valor de C:");
        c = sc.nextFloat();

        float areaTriangulo = a*c/2;
        System.out.println("A area do triangulo retangulo é: "+areaTriangulo);

        float areaCirculo = 3.14159f*(c*c);
        System.out.println("A area do circulo é: "+areaCirculo);

        float areaTrapezio = (a+b)*c/2;
        System.out.println("A area do trapezio: "+areaTrapezio);

        float areaQuadrado = b*b;
        System.out.println("Area do quadrado: "+areaQuadrado);

        float areaRetangulo = a*b;
        System.out.println("A area do retangulo é: "+areaRetangulo);
        sc.close();
    }

}
