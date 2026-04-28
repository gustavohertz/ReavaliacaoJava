package br.com.letheia.ufology.FuncionalidadesCapitulo3;

public class ObjetoSolido extends Evento implements Classificavel{

    @Override
    public void classificar(){
        System.out.println("Movimentacao fisica nos arredores");
    }
}
