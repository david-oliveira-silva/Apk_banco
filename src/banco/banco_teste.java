package banco;

import java.util.Scanner;

public class banco_teste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        funcoes funcao1 = new funcoes();
        mensagem escrever = new mensagem();


        System.out.println("escolha a opcao :  \n 1- Criar conta \n 2- sair" );
        int opcao = leia.nextInt();

        if (opcao == 1) {


            funcao1.criarConta("david");
            funcao1.inserirContas(funcao1);


        } else if (opcao == 2) {
            funcao1.getContas();
        }


        while (true) {
            System.out.println("\nescolha oque deseja fazer \n 1 -depositar \n 2- sacar \n 3 - ver conta \n 4 - sair");
            int opc = leia.nextInt();
            leia.nextLine();
            if (opc == 1) {
                funcao1.setDeposito();
                funcao1.getDeposito();


            } else if (opc == 2) {
                funcao1.setSacar();
                funcao1.getSacar();

            } else if (opc == 3) {
                funcao1.getContas();

            }else{
                funcao1.getContas();
                break;
            }


        }


        }












}

