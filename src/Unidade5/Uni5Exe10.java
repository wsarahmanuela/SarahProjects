package Unidade5;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; count < 10; i++){
            int esquerda = i / 100;
            int direita = i % 100;

            if((esquerda + direita) *(esquerda + direita ) == i){
                System.out.println(i);
                count++;
            }
        }
    }
}
