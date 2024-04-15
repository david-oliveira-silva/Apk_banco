package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funcoes {
    private double sacar;
    private double deposito;

    public double saldo;

    private int id;

    private String nome = "";

    List<funcoes> contas = new ArrayList<>();




    Scanner leia = new Scanner(System.in);

    mensagem escrever = new mensagem();


    public double getSacar() {

        return sacar;
    }

    public void setSacar() {

        System.out.println("Quantos deseja sacar?");
        sacar = leia.nextDouble();
        if (sacar < saldo) {
            saldo -= sacar;
            escrever.mensagem("saque efetuado com sucesso ");

            escrever.mensagem("Saldo : " + saldo);

        } else {
            escrever.mensagem("Saldo insuficiente Saldo : " + saldo);
        }
    }

    public double getDeposito() {
        return deposito;

    }

    public void setDeposito() {
        escrever.mensagem("quantos deseja depositar?");
        deposito = leia.nextDouble();
        saldo += deposito;
        escrever.mensagem("Deposito efetuado com sucesso!");
        escrever.mensagem("Saldo : " + saldo);
    }

    public List<funcoes> getContas() {

        escrever.mensagem("" + contas);
        return contas;

    }


    public void inserirContas(funcoes contaNova){
        contas.add(contaNova);
        System.out.println(contaNova);

    }
    public funcoes criarConta(String nome){
        this.nome = nome;
        id++;
        escrever.mensagem("Nome : " + nome);
        escrever.mensagem("Id : " + id);


        return null;
    }
    @Override
    public String toString() {
        String resultado = "agencia:" + this.id +"/"+"nome:" +  this.nome + "/saldo:" + saldo  ;
        return resultado;
    }

}
