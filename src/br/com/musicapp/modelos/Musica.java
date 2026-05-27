package br.com.musicapp.modelos;

public class Musica extends Audio {
    private String artista, genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (this.getCurtidas() > 5000){
            return 10.0;
        } else if (this.getCurtidas() > 1000) {
            return 8.0;
        } else {
            return 6.0;
        }
    }
}
