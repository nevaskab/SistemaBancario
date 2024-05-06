package com.mycompany.gerenciabanco;
/**
 *
 * @author Andressa Martins Santana Santos
 */
import java.util.Scanner;

public class Main {    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Informe o primeiro nome: ");
        String titular = scan.nextLine();
        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scan.nextLine();
        System.out.println("Informe seu CPF: ");
        String cpf = scan.nextLine();
        System.out.println(Conta.criarDigitoConta());
        
        GerenciaBanco conta = new GerenciaBanco(sobrenome, titular, cpf);
        
        conta.exibirMenu();
        
        System.out.println("Obrigado!");
        scan.close();        
    }
}
