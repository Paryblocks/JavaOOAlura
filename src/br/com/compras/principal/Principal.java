package br.com.compras.principal;

import br.com.compras.modelos.CartaoDeCredito;
import br.com.compras.modelos.Compra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        int continua;
        double valor;
        Compra item = null;
        CartaoDeCredito cartao = null;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite o limite do cartão: ");
            cartao = new CartaoDeCredito(scan.nextDouble());
            if (cartao.getLimite() <= 0){
                System.out.println("Digite um valor válido para o limite!");
            }
        }while(cartao.getLimite() <= 0);

        do {
            System.out.println("Digite a descrição da compra: ");
            nome = scan.next();
            System.out.println("Digite o valor da compra: ");
            valor = scan.nextDouble();
            item = new Compra(nome, valor);

            if (!cartao.registraCompra(item)){
                System.out.println("Saldo insuficiente!");
                break;
            }else{
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                continua = scan.nextInt();
            }
        }while(continua != 0);

        cartao.getCompras();

    }
}
