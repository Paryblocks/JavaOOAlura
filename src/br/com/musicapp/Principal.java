package br.com.musicapp;

import br.com.musicapp.modelos.Musica;
import br.com.musicapp.modelos.Podcast;
import br.com.musicapp.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        Musica m2 = new Musica();
        Podcast p1 = new Podcast();
        Podcast p2 = new Podcast();

        m1.setTitulo("Fly Me To The Moon");
        m1.setArtista("Frank Sinatra");
        m1.setGenero("Jazz");
        for (int i = 0; i < 3000; i++) {
            m1.curtir();
        }
        for (int i = 0; i < 10000; i++) {
            m1.reproduzir();
        }

        m2.setTitulo("Breaking The Habit");
        m2.setArtista("Linkin Park");
        m2.setGenero("Rock");
        for (int i = 0; i < 7000; i++) {
            m2.curtir();
        }
        for (int i = 0; i < 20000; i++) {
            m2.reproduzir();
        }

        p1.setTitulo("Mestres do Capitalismo");
        p1.setHost("Mando Noura");
        p1.setTotalDeEpisodios(5);
        for (int i = 0; i < 74; i++) {
            p1.curtir();
        }
        for (int i = 0; i < 120; i++) {
            p1.reproduzir();
        }

        p2.setTitulo("Como plantar banana");
        p2.setHost("John Farmer");
        p2.setTotalDeEpisodios(20);
        for (int i = 0; i < 95; i++) {
            p2.curtir();
        }
        for (int i = 0; i < 98; i++) {
            p2.reproduzir();
        }

        Preferidas pref = new Preferidas();

        System.out.println("Titulo: " + m1.getTitulo());
        System.out.println("Artista: " + m1.getArtista());
        System.out.println("Genero: " + m1.getGenero());
        System.out.println("Curtidas: " + m1.getCurtidas());
        System.out.println("Reproduções: " + m1.getTotalReproducoes());
        pref.avalia(m1);

        System.out.println("Titulo: " + m2.getTitulo());
        System.out.println("Artista: " + m2.getArtista());
        System.out.println("Genero: " + m2.getGenero());
        System.out.println("Curtidas: " + m2.getCurtidas());
        System.out.println("Reproduções: " + m2.getTotalReproducoes());
        pref.avalia(m2);

        System.out.println("Titulo: " + p1.getTitulo());
        System.out.println("Host: " + p1.getHost());
        System.out.println("Total de Episodios: " + p1.getTotalDeEpisodios());
        System.out.println("Curtidas: " + p1.getCurtidas());
        System.out.println("Reproduções: " + p1.getTotalReproducoes());
        pref.avalia(p1);

        System.out.println("Titulo: " + p2.getTitulo());
        System.out.println("Host: " + p2.getHost());
        System.out.println("Total de Episodios: " + p2.getTotalDeEpisodios());
        System.out.println("Curtidas: " + p2.getCurtidas());
        System.out.println("Reproduções: " + p2.getTotalReproducoes());
        pref.avalia(p2);
    }
}
