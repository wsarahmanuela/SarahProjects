package Unidade4;

import java.util.Scanner;

//digitar um sinal
//dois numeros float
//chamar o metodo
public class Calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        System.out.println("Digite dois numero: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextFloat();

        char operador;
        System.out.println("Digite um operador para calcular: \n"+
            "+ para soma\n" + 
            "- para subtrair\n" +
            "* para multiolicar\n" +
            "/ para dividir\n" +
            "% para resto da divisao\n");
        operador = sc.next().charAt(0);

        if(operador == '+'){
            somar(n1, n2);
        }else if(operador == '-'){
            diminuir(n1, n2);
        }else if(operador == '*'){
            multiplicar(n1, n2);
        }else if(operador == '/'){
            dividir(n1, n2);
        }else if(operador == '%'){
            resto(n1,n2);
        }else{
            System.out.println("Operador invalido");
        }
        sc.close();
    }

    private static void resto(float n1, float n2) {
        System.out.println("O retso é: " + (n1%n2));
        throw new UnsupportedOperationException("Unimplemented method 'resto'");
    }

    private static void multiplicar(float n1, float n2) {
        System.out.println("A multiplicação é: "+ (n1*n2));
        throw new UnsupportedOperationException("Unimplemented method 'multiplicar'");
    }

    private static void somar(float n1, float n2) {
        System.out.println("A soma é: "+ (n1+n2));
        throw new UnsupportedOperationException("Unimplemented method 'somar'");
    }

    private static void dividir(float n1, float n2) {
        System.out.println("A divisao é: "+ (n1/n2));
        throw new UnsupportedOperationException("Unimplemented method 'dividir'");
    }

    private static void diminuir(float n1, float n2) {
        System.out.println("A subtração é: "+ (n1-n2));
        throw new UnsupportedOperationException("Unimplemented method 'diminuir'");
    }
}
