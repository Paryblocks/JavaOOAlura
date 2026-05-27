package br.com.musicapp.modelos;

public class Preferidas {
    public void avalia(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é um(a) dos(as) preferidos(as)!");
        } else if (audio.getClassificacao() >= 7) {
            System.out.println(audio.getTitulo() + " é bem bom(a)!");
        }else {
            System.out.println(audio.getTitulo() + " não é tão curtido(a).");
        }
    }
}
