package br.com.musicapp.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        curtidas++;
    }

    public void reproduzir(){
        totalReproducoes++;
    }
}
