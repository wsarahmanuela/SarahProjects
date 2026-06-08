package Uniddade6;

import java.util.Scanner;

public class Questao3 {
    // Crie um vetor de 5 inteiros, peça pro usuário preencher, e mostre somente os
    // números pares.
    // private Scanner sc = new Scanner(System.in);
    // private int[] vetor = new int[5];

    // public void preenceherVetor() {
    // for (int i = 0; i < 5; i++) {
    // System.out.println("Digite " + (i+1));
    // vetor[i] = sc.nextInt();
    // }
    // }

    // public void mostraPar() {
    // boolean temPar = false;
    // for (int i = 0; i < 5; i++) {
    // if (vetor[i] % 2 == 0) {
    // System.out.println("Par: " + vetor[i]);
    // temPar = true;
    // }
    // }
    // if (!temPar) {
    // System.out.println("Nao tem numeros pares");
    // }
    // }
    // public Questao3() {
    // }

    // public static void main(String[] args) {
    // Questao3 questao3 = new Questao3();
    // questao3.preenceherVetor();
    // questao3.mostraPar();
    // }



    // Crie um vetor com os valores {10, 30, 50, 70, 90} já preenchido. Peça um
    // número pro usuário e fique pedindo enquanto ele não acertar um número que
    // está no vetor. Quando acertar, mostre em qual posição está.

    // private Scanner sc = new Scanner(System.in);
    // private int[] vetor = { 10, 30, 50, 70, 90 };

    // public void verificarVetor() {
    // int numero;
    // int posicao = -1;// ta indicando que a posicao ainda nao foi encontada
    // do {
    // System.out.print("Digite um número: ");
    // numero = sc.nextInt();
    // for (int i = 0; i < vetor.length; i++) {
    // if (numero == vetor[i]) {
    // posicao = i;
    // break;
    // }
    // }
    // } while (posicao == -1);

    // System.out.println("Número encontrado na posição " + posicao);
    // }



    // Faça um menu com 3 opções que se repete até o usuário escolher sair:
    // 1 → Mostrar "Olá!"
    // 2 → Mostrar a soma de dois números digitados
    // 3 → Sair

    private Scanner sc = new Scanner(System.in);

    int opcao;
    public Questao3() {
    do{
        
        System.out.println();
        System.out.println("Menu");
        System.out.println("1 - Mostrar Olá!");
        System.out.println("2 - Mostrar a soma de dois números digitados");
        System.out.println("3 - Sair");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Ola!");
                break;
            case 2: 
                mostrarSoma();
                break;
            case 3:
                System.out.println("tchau");
            default:
                break;
        }
    } while (opcao != 3);
   
    }
    private void mostrarSoma() {
            System.out.println("Digite o primeiro numero: ");
            int num1 = sc.nextInt();
            System.out.println("DIgite o segundo numero: ");
            int num2 = sc.nextInt();
            int soma = 0;
            soma = num1+num2;
            System.out.println("A soma dos dois numeros é: " + soma);
    
    }
    public static void main(String[] args) {
        new Questao3();
    }
//Crie um vetor de 5 posições. Peça números ao usuário, mas não deixe inserir número repetido. Se repetir, avisa e pede de novo.

    //private Scanner sc = new Scanner(System.in);
    //private int[] vetor = new int[5];
    //private int tamanho = 0;

    //public void preencherVetor() {
    //    while (tamanho < 5) {
    //        System.out.print("Digite um número: ");
    //        int numero = sc.nextInt();

    //        boolean repetido = false;
    //        for (int i = 0; i < tamanho; i++) {
    //            if (vetor[i] == numero) {
    //                repetido = true;
    //                break;
    //            }
    //        }

    //        if (repetido) {
    //            System.out.println("Número já existe! Digite outro.");
    //        } else {
    //            vetor[tamanho] = numero;
    //            tamanho++;
    //        }
    //    }
    //}

    //public void mostrarVetor() {
    //    System.out.print("Vetor: ");
    //    for (int i = 0; i < tamanho; i++) {
    //        System.out.print("[" + vetor[i] + "]");
    //    }
    //    System.out.println();
    //}

    //public static void main(String[] args) {
    //    Questao4 q = new Questao4();
    //    q.preencherVetor();
    //    q.mostrarVetor();
    //}
//}
    
}

//1. Por que tamanho começa em 0?
//Porque o vetor começa vazio. tamanho controla quantas posições foram preenchidas, não o tamanho fixo do array.

//2. Por que do-while no menu?
//Porque o menu precisa aparecer pelo menos uma vez antes de checar se o usuário quer sair.

//3. Por que boolean repetido = false antes do for?
//Porque você assume que não repetiu, e só muda pra true se achar. Se fizesse o contrário, não funcionaria.

//4. Por que i -= 1 no Bubble Sort?
//Porque depois de uma troca, precisa rever a posição anterior — um número grande pode precisar "andar" várias posições.

//5. Por que usar variável bolha na troca?
//Sem ela, o valor original seria sobrescrito e perdido antes de ser copiado.



    //static Scanner sc = new Scanner(System.in);
    //static int[] vetor = {10, 20, 30, 40, 50}; // vetor ja preenchido com 5 valores
    ///static int tamanho = 5; // controla quantos elementos existem de verdade

    //static void excluir() {
    //    System.out.print("Valor a excluir: ");
    //    int val = sc.nextInt(); // le o valor que o usuario quer excluir
    //    boolean achou = false; // assume que nao encontrou, so muda se achar

    //    for (int i = 0; i < tamanho; i++) { // percorre o vetor do inicio ate o ultimo elemento
    //        if (vetor[i] == val) { // encontrou o valor a excluir

      //          // empurra cada elemento uma posicao pra esquerda
        //        // comeca do indice excluido ate o penultimo
          //      for (int j = i; j < tamanho - 1; j++) {
            //        vetor[j] = vetor[j + 1]; // copia o elemento seguinte pro lugar atual
              //  }

                //tamanho--; // diminui o contador, sem isso o ultimo valor apareceria duplicado
                //achou = true;
                //break; // para o loop, remove so a primeira ocorrencia
           // }
        //}

        // operador ternario: se achou imprime "Excluido", senao "Nao encontrado"
        //System.out.println(achou ? "Excluído!" : "Não encontrado.");
    //}

    //static void mostrar() {
      //  for (int i = 0; i < tamanho; i++) { // percorre so ate tamanho, nao ate o fim do array
        //    System.out.print("[" + vetor[i] + "]");
        //}
        //System.out.println();
    //}

    //public static void main(String[] args) {
      //  System.out.print("Antes: ");
        //mostrar();
        //excluir();
        //System.out.print("Depois: ");
        //mostrar();

