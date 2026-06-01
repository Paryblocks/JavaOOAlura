package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie minhaSerie = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        Filme maisUmFilme = new Filme("Transformers", 2007);
        maisUmFilme.avalia(10);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(maisUmFilme);
        listaDeAssistidos.add(minhaSerie);

        // Maneira de reescrever for each mais moderno
        // listaDeAssistidos.forEach(nome -> System.out.println(nome));

        for (Titulo item: listaDeAssistidos){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao() + " Estrelas");
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Larissa");
        buscaPorArtista.add("Matheus");
        buscaPorArtista.add("Adam Sandler");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Depois da ordenação");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    }
}
