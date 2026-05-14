package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroInscricao = -1;
        double altura = 0;
        int numeroMaisAlto = 0;
        int numeroMaisBaixo = 0;
        double alturaMaisAlto = Double.MIN_VALUE;
        double alturaMaisBaixo = Double.MAX_VALUE;
        double alturaTotalDoGrupo = 0;
        int totalInscricao = 0;

        while (numeroInscricao != 0) {
            System.out.println("Numero inscricao: ");
            numeroInscricao = sc.nextInt();
            if(numeroInscricao == 0){
                break;
            }
            System.out.println("Altura");
            altura = sc.nextDouble();
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                numeroMaisAlto = numeroInscricao;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                numeroMaisBaixo = numeroInscricao;
            }
            alturaTotalDoGrupo += altura;
            totalInscricao++;
        }
        System.out.println("O atleta mais baixo tem " + alturaMaisBaixo + "m" + " e o seu número de inscrição é "
                + numeroMaisBaixo);
        System.out.println(
                "O atleta mais alto tem " + alturaMaisAlto + "m" + " e o seu número de inscrição é " + numeroMaisAlto);
        System.out.println("A altura média do grupo de atletas é: " + (alturaTotalDoGrupo / totalInscricao));
    }

}
