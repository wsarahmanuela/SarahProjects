package Uniddade6;

import java.util.Scanner;

public class Questao1Estudar {
    private Scanner sc = new Scanner(System.in);
    private String nomes[] = new String[30];
    private int tamanho = 0;

    public Questao1Estudar() {
        int opcao;
        do {
            System.out.println("1 - Incluir nome");
            System.out.println("2 - Pesquisar nome");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Excluir nome");
            System.out.println("5 - Mostrar nomes");
            System.out.println("6 - Ordenar nomes");
            System.out.println("7 - Sair");
            System.out.print("Digite a opcao escolhida");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirNome();
                    break;
                case 2:
                    pesquisarNome();
                    break;
                case 3:
                    alterarNome();
                    break;
                case 4:
                    excluirNome();
                    break;
                case 5:
                    mostrarNome();
                    break;
                case 6:
                    ordernarNome();
                    break;
                case 7:
                    System.out.println("Saiu do sistema");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 7);

    }

    private void incluirNome() {
        if (tamanho < nomes.length) {
            System.out.println("Digite o nome a ser inserido: ");
            String nome = sc.next();
            nomes[tamanho] = nome;
            System.out.println("Nome: " + nome + " inserido!");
            tamanho++;
        } else {
            System.out.println("Vetor cheio");
        }
    }
    private String pesquisarNome() {
        System.out.println("Digite o nome que vc quer pesquisar: ");
        String nome = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                System.out.println("Nome encontardo");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nome nao encontrado");
        }
        return nome;
    }

    private void alterarNome() {
        String buscarNoma = pesquisarNome();
        System.out.println("Digite o nome que vc quer alterar: ");
        String novoNome = sc.next();
        for (int i = 0; i < tamanho; i++) {
            if (nomes[i].equalsIgnoreCase(buscarNoma)) {
                nomes[i] = novoNome;
                break;
            }
        }
    }

    private void excluirNome() {
        String buscarNome = pesquisarNome();
        for (int i = 0; i < tamanho - 1; i++) {
            if (nomes[i].equalsIgnoreCase(buscarNome)) {
                for (int j = 0; j < tamanho; j++) {
                    nomes[i] = nomes[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }

    private void mostrarNome() {
        System.out.println("MOstrando vetor");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("| ");
            System.out.print(nomes[i]);
            System.out.print(" |");
        }
    }

    private void ordernarNome() {
        String bolha;
        for (int i = 0; i < tamanho - 1; i++) {
            if (nomes[i].compareTo(nomes[i + 1]) > 0) {// nao da pra usar > com string // Loop que percorre o array de 0 até tamanho - 2. Para em tamanho - 1 porque compara nomes[i] com nomes[i+1] — se fosse até o fim estouraria o índice.
                bolha = nomes[i];// guarda o maior temporariamente
                nomes[i] = nomes[i + 1]; //  coloca o menor na posição anterior
                nomes[i + 1] = bolha; // coloca o maior na posição seguinte
                i -= 1;
            }
        }
        System.out.println("Valores ordanados");
    }

    public static void main(String[] args) {
        Questao1Estudar questao1Estudar = new Questao1Estudar();

    }
}

// verificar oq ta fazendo
// private void misterio() {
// int[] numeros = {5, 3, 8, 1, 9, 2, 7, 4, 6}; // ta preenchendo o vetor com numeros inteiros
// int resultado = numeros[0]; // essa o resultado ta recendo o vetor na posicao 0
// for (int i = 1; i < numeros.length; i++) { // o for ta percorendo com o vetor e o i comeca com 1, pq o resultado já começa com o valor da posição 0
// if (numeros[i] > resultado) { // se o numero de tal posicao for maior que o resultado, resultado recebe tal numero
// resultado = numeros[i]; // se o numero de tal posicao for maior que o resultado, resultado recebe tal numero
// }
// }
// System.out.println(resultado); // vai imprimir o maior numero
// }



// while
// private void misterio4() {
// int[] numeros = {3, 6, 9, 2, 5, 8, 1, 4, 7}; // cria vetor com os valores
// int i = 0; // controla a posição do while
// int resultado = 0; // guarda o ultimo divisivel por 3 encontrado
// while (i < numeros.length) { // percorre o vetor enquanto nao chegar no fim
// if (numeros[i] % 3 == 0) { // verifica se o numero é divisivel por 3
// resultado = numeros[i]; // substitui o resultado pelo numero encontrado
// }
// i++; // avanca para a proxima posicao
// }
// System.out.println(resultado); // mostra o ultimo numero divisivel por 3
// }



// private void ordernarNome(){
// String bolha; // ariável temporária para guardar um nome durante a troca, igual a uma caixinha auxiliar
// for(int i = 0; i < tamanho - 1; i++){ // percorre o vetor até o penúltimo elemento, porque compara i com i+1, se fosse até o último daria erro
// if(nomes[i].compareTo(nomes[i + 1]) > 0){// nao da pra usar > com string // compara dois nomes alfabeticamente. Se retorna maior que 0, significa que o nome atual vem depois do próximo, ou seja, está fora de ordem
// bolha = nomes[i]; //guarda o nome atual na caixinha para não perder
// nomes[i] = nomes[i + 1];coloca o próximo nome na posição atual
// nomes[i + 1] = bolha; // coloca o nome que estava guardado na caixinha naposição seguinte
// i -= 1; //Se i for 3, vira 2, não recomeça do início. Precisa ser i = -1 para depois do i++ do for virar 0 e recomeçar do início garantindo que tudo fiqueordenado
// }
// }
// System.out.println("Valores ordanados");
// }



// private void misterio7() {
// int[] numeros = {4, 7, 2, 9, 1, 5};
// int menor = numeros[0]; // começa com o primeiro valor do vetor
// for (int i = 1; i < numeros.length; i++) { // começa em 1 pois o 0 já foi pego
// if (numeros[i] < menor) {
// menor = numeros[i];
// }
// }
// System.out.println("Menor: " + menor);
// }