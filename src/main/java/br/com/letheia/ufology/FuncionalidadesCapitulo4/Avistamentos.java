package br.com.letheia.ufology.FuncionalidadesCapitulo4;

import br.com.letheia.ufology.FuncionalidadesCapitulo3.Evento;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.LuzAnomala;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.ObjetoSolido;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.SinalRadar;

public abstract class Avistamentos {
    public static void avistamentos(){

        Evento[] arrayEventos = new Evento[3];
        arrayEventos[0] = new LuzAnomala();
        arrayEventos[1] = new ObjetoSolido();
        arrayEventos[2] = new SinalRadar();

        for (int i = 0; i < arrayEventos.length; i++) {
            arrayEventos[i].eventoBase();
        }
    }
}
