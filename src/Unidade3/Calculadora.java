package Unidade3;

public class Calculadora {
    int numero1;
    int numero2;
    int resultado;

    public Calculadora(){
       numero1 = 5;
       numero2 = 7;
       resultado = somar();
       System.out.println(resultado);

       numero1 = 4;
       numero2 = 5;
       resultado = somar();
       System.out.println(resultado);

       resultado = somaDoiaValores(numero2, numero1);
       System.out.println(resultado);

       somaValores();
       System.out.println(resultado);
    }
    public int somar(){
        return numero1 + numero2;
    }
    public int somaDoiaValores(int num1, int num2){
        return num1 + num2;
    }

    public void somaValores(){
        resultado = numero1 + numero2;
    }
    public static void main(String[] args) {
        new Calculadora();
    }
}
