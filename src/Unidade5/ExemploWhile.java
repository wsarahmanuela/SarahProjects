package Unidade5;

public class ExemploWhile {
    public static void main(String[] args) {
        boolean continuar = true;
        int contador = 0;
        while(continuar){
            System.out.println("Continuando");
            contador++;
            if(contador >= 10){
                continuar = false; 
            }
        }
        int x = 1;
        contador = 1;
        int potencia = x;
        while (potencia <= 100){
            potencia *= x;
            x ++;
        }
    }

}
