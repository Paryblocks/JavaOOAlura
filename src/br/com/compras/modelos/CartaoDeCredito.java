package br.com.compras.modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoDeCredito {
    private double limite, saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public boolean registraCompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public void getCompras() {
        compras.sort(Comparator.comparing(Compra::getValor));

        System.out.println("""
                            **************************
                            COMPRAS REALIZADAS:
                            """);
        compras.forEach(System.out::println);
        System.out.println("""
                            
                            **************************
                            """);
        System.out.println("Saldo do cartão: " + saldo);
    }
}
