package Unidade5;

public class Uni5Exe02 {
    public static void main(String[] args) {
        int totalPar = 0;
        int totalImpar = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                totalPar = totalPar + i;
            } else {
                totalImpar = totalImpar + i;
            }
        }
        System.out.println("Pares: "+totalPar);
        System.out.println("Impares: "+totalImpar);
    }

}
