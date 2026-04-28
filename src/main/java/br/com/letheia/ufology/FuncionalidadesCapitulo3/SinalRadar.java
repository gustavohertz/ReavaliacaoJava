package br.com.letheia.ufology.FuncionalidadesCapitulo3;

public class SinalRadar extends Evento implements Classificavel{

    @Override
    public void classificar(){
        System.out.println("Bip! Anomalia detectada nos sensores!");
    }
}
