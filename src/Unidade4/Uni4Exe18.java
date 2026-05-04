package Unidade4;

import java.util.Scanner;

public class Uni4Exe18 {
    //Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 
    // o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias 
    // após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso.
    //  Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, 
    // exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês 
    // seguinte.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vencimento;
        int diaPagamento;
        float valorPrestacao;
        System.out.println("Digite o dia do vencimento: ");
        vencimento = sc.nextInt();
        System.out.println("Digite o dia do pagamento: ");
        diaPagamento = sc.nextInt();
        System.out.println("Digite o valor da prestacao: : ");
        valorPrestacao = sc.nextFloat();

        if (diaPagamento <= vencimento) {
            float valorFinal = valorPrestacao - (valorPrestacao * 0.10f);
            System.out.println("Pagamento em dia. Valor com desconto: R$ " + valorFinal);
        } else if (diaPagamento <= vencimento + 5) {
            System.out.println(
                    "Cinco dias apos o vencimento, perdeu o desconto. Valor da prestacao é R$" + valorPrestacao);
        } else {
            int diasAtraso = diaPagamento - vencimento;
            float valorFinal = valorPrestacao + (valorPrestacao * 0.02f * diasAtraso);
            System.out.println(
                    "Pagamento passou dos 5 dias. Dias do atraso = " + diasAtraso + "Valor com multa: R$" + valorFinal);
        }
        sc.close();
    }

}
