package br.com.exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalExercicios {
    public static void main(String[] args) {
        // Converter JSON, para objeto pessoa com Record

        String json = "{\"nome\":\"Rodrigo\"," +
                        "\"idade\":20," +
                        "\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Pessoa: " + pessoa);

        // Converter JSON em objeto livro Record com atributo objeto

        String jsonLivro = "{\"titulo\":\"Como Treinar seu Dragão\"," +
                            "\"autor\":\"Cressida Cowell\"," +
                            "\"editora\":{\"nome\":\"Instrínseca\",\"cidade\":\"Rio de Janeiro\"}}";

        Gson gsonLivro = new Gson();
        Livro livro = gsonLivro.fromJson(jsonLivro, Livro.class);

        System.out.println("Livro: " + livro);
    }

}
