package com.mycompany.gerenciabanco;

/**
 *
 * @author Andressa Martins Santana Santos
 */

import java.util.Scanner;

class GerenciaBanco{
    
    public String conta;
    public double saldo;
    public String titular;
    public String sobrenome;
    public String cpf;

    public GerenciaBanco(String conta, String titular, String cpf1){
        this.conta = conta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String conta(){
        return this.conta;
    }
    
    public String getTitular(){
        return this.titular;
    }

    public double saldo(){
        return this.saldo;
    }
    
    public double consultarSaldo(){
        return saldo;
    }
    
    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("OPERAÇÃO REALIZADA.");
        }
        else{
            System.out.println("SALDO INSUFICIENTE.");
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo+= valor;
            System.out.println("OPERAÇÃO REALIZADA.");
        }
        else{
            System.out.println("OPERAÇÃO INDEVIDA.");
        }
    }
    
    public void exibirMenu(){
        Scanner scan = new Scanner(System.in);
        
        int opcao = 0;
        
        while (opcao!=4) {
            System.out.println("------Menu------");
            System.out.println("1 - Fazer saque");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Encerrar");

            System.out.println("Escolha a opção correspondente a ação desejada: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1 -> { 
                    System.out.println("Digite o valor para sacar: R$ ");
                    double valorSacar = scan.nextDouble();
                    sacar(valorSacar);
                }
                
                case 2 -> {
                    System.out.println("Digite o valor para depositar: R$ ");
                    double valorDepositar = scan.nextDouble();
                    depositar(valorDepositar);
                }
                    
                case 3 -> System.out.println("Saldo: R$ " + consultarSaldo());
                
                case 4 -> System.out.println("FINALIZANDO OPERAÇÃO...");
                
                default -> System.out.println("OPERAÇÃO INVÁLIDA, TENTE NOVAMENTE.");
            }
        }       
    }
}
