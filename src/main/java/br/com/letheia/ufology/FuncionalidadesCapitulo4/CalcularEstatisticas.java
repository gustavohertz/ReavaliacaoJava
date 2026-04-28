package br.com.letheia.ufology.FuncionalidadesCapitulo4;

public class CalcularEstatisticas {

    void calcularEstatisticas(int[] niveis){
        niveis = new int[]{1, 2, 3, 5, 8, 99};
       int soma = 0;
       int media =0;
       int maiorValor = 0;

        for(int i = 0; i<= niveis.length; i++){
           soma += niveis[i];
           media = soma/niveis.length;
           if(i>maiorValor){
               maiorValor = i;
           }
        }
        System.out.println(soma +" " + media +" " + maiorValor);
    }
}
