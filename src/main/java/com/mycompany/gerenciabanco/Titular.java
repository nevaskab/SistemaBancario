package com.mycompany.gerenciabanco;

/**
 *
 * @author Andressa Martins Santana Santos
 */
class Titular {
    public GerenciaBanco titular;
    public String sobrenome;
    public String cpf;
    public final GerenciaBanco [] conta;

    public Titular(GerenciaBanco titular, String sobrenome, String cpf, GerenciaBanco[] conta){
        this.titular = titular;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = new GerenciaBanco[1];
    }

    //Verificando se a conta pode ser criada para o cliente (máximo de 1 conta por cpf)
    public void addConta(GerenciaBanco novaConta){
        int contaLength = this.conta.length;

        for(int i  = 0; i < contaLength; i++)
            if(this.conta[i] == null){
                this.conta[i] = novaConta;
                return;
            }
    }

    public GerenciaBanco getTitular() {
        return titular;
    }

    public void setTitular(GerenciaBanco titular) {
        this.titular = titular;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

