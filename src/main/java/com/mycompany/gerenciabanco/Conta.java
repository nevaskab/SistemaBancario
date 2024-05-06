package com.mycompany.gerenciabanco;

import java.util.Random;

/**
 *
 * @author Andressa Martins Santana Santos
 */
class Conta {
    public GerenciaBanco[] conta;
    
    public Conta(GerenciaBanco[] conta){
        this.conta = conta;
    }
    
    public static String criarDigitoConta(){
        Random rand = new Random();

        int firstSeq = rand.nextInt(9999999);
        int lastSeq = rand.nextInt(9);
        String conta = String.format("%07d-%d", firstSeq, lastSeq);
        
        System.out.print("Número da conta: ");

        return conta;
    }
    
    public void setConta(GerenciaBanco[] conta){
        this.conta = conta;
    }
    
    public GerenciaBanco[] conta(){
        return conta;
    }
}
