package br.com.letheia.ufology.FuncionalidadesCap1;

public class ValidarEntrada {
    public static void validarEntrada(int hora,int visibilidade){
        if(hora>=0 && hora<=23){
            System.out.println(true);
        } else if (visibilidade>0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
