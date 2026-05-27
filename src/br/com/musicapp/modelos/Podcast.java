package br.com.musicapp.modelos;

public class Podcast extends Audio {
    private String host;
    private int totalDeEpisodios;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTotalDeEpisodios() {
        return totalDeEpisodios;
    }

    public void setTotalDeEpisodios(int totalDeEpisodios) {
        this.totalDeEpisodios = totalDeEpisodios;
    }

    @Override
    public double getClassificacao() {
        return ((double) this.getCurtidas() / this.getTotalReproducoes()) * 10;
    }
}
