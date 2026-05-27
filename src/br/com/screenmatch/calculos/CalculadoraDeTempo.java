package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    // shift + alt + o -> Resolve importação
    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
