package br.com.viacep;

import java.io.IOException;
import java.util.Scanner;

public class MenuCep {
    public static void main(String[] args) throws IOException {
        int op;
        Scanner ler = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

         do {
            System.out.println("""
                                PESQUISA VIACEP
                                1 - Pesquise um endereço
                                2 - Sair e Salvar Endereços
                                """);
            op = ler.nextInt();
            switch (op){
                case 1:
                    System.out.println("Digite o cep para pesquisar: ");
                    String cep = ler.next();
                    if (!cep.matches("[0-9]+") || cep.length() != 8) {
                        System.out.println("Digite um CEP válido com apenas números!");
                    } else {
                        consultaCep.getEndereco(cep);
                    }
                    break;
                case 2:
                    consultaCep.escreveJson();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while (op != 2);
    }
}
