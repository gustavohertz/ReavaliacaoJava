package br.com.letheia.ufology.FuncionalidadesCapitulo3;

public final class LuzAnomala extends Evento implements Classificavel {

    @Override
    public void classificar(){
        System.out.println("Luz não identificada no espectro visível!");
    }

}
