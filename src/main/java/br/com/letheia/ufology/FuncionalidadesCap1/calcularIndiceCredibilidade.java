package br.com.letheia.ufology.FuncionalidadesCap1;

public class calcularIndiceCredibilidade {

    static double credibilidade;
  public static void calcularIndiceCredibilidade(int visibilidade, int testemunhas, int duracaoSegundos){
     credibilidade = (visibilidade * 2 + testemunhas * 3 + duracaoSegundos / 10) / 3;
        System.out.println(credibilidade);
    }
}
