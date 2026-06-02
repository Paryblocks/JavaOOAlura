package br.com.viacep;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsultaCep {
    private List<Cep> listaEnderecos;
    private Gson gson;

    public ConsultaCep() {
        this.listaEnderecos = new ArrayList<>();
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public void getEndereco(String pesquisa){
        var link = "https://viacep.com.br/ws/" + pesquisa + "/json/";
        try{
            // Recebe os dados da API
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Converte para um objeto Cep
            Cep cep = gson.fromJson(response.body(), Cep.class);

            // Verifica se recebeu um cep válido
            if (cep.cep() != null) {
                // Adiciona na lista
                listaEnderecos.add(cep);

                // Mostra o atual para o usuario
                System.out.println(cep);
            } else {
                // Mostra erro
                System.out.println("Cep não encontrado!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void escreveJson() throws IOException {
        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(gson.toJson(listaEnderecos));
        escrita.close();
        System.out.println("Endereços salvos no arquivo!");
    }
}
