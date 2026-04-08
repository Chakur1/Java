package Desafio;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double saldo = 2500.00;
        double valorTransferencia = 0;
        double valorReceber = 0;
        int opcaoDesejada = 0;

        System.out.println("****************" +
                "\nDados iniciais do cliente:\n" +
                "\nNome: Pedro Chakur" +
                "\nTipo de conta: Corrente" +
                "\nSaldo Inicial R$ "+ saldo +
                "\n****************");


        while (opcaoDesejada != 4){
            System.out.println("\noperações\n" +
                    "\n1- Consultar saldos" +
                    "\n2- Receber valor" +
                    "\n3- Transferir valor" +
                    "\n4- Sair\n");
            System.out.println("\nDigite o número da opção desejada");
            opcaoDesejada = leitura.nextInt();

            if(opcaoDesejada == 1){
                System.out.println("O saldo atual é R$ "+ saldo);
            } else if (opcaoDesejada == 2) {
                System.out.println("Informe o valor a receber: ");
                valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("\nSaldo atualizado R$ "+ saldo + "\n");

            } else if (opcaoDesejada == 3) {
                System.out.println("Digite o valor da transferência: ");
                valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo){
                    System.out.println("Não há saldo o suficiente para essa transferência");
                } else if (valorTransferencia < saldo){
                    saldo -= valorTransferencia;
                    System.out.println("\nSaldo atualizado R$ "+ saldo );
                }


            } else if (opcaoDesejada == 4) {
                System.out.println("Fechando operação...");
            } else {
                System.out.println("Opção inválida!");
            }

        }
    }
}
