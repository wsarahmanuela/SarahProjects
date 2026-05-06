package Unidade5;

public class Uni5Exe11 {
    public static void main(String[] args) {
        int total = 0;
        int biscoitoHora = 0;
        for (int i = 1; i <= 16; i++){
            if(i == 1){
                biscoitoHora = 1;
            } else if(i == 2){
                biscoitoHora = 3;
            } else {
                biscoitoHora = biscoitoHora * 3;
            }
            total = total + biscoitoHora;
        }
        System.out.println("Total do dia: " + total);
    }
    
}
