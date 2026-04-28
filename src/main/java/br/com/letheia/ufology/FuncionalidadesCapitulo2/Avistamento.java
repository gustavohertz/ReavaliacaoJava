package br.com.letheia.ufology.FuncionalidadesCapitulo2;
import java.math.BigInteger;
import java.time.LocalTime;

public enum Avistamento {
    ;
    private BigInteger id;
    private LocalTime dataHora;
    private String coordenada;
    private String descricao;
    private int visibilidade;
    private int testemunhas;
    private String observador;

    Avistamento(BigInteger id, LocalTime dataHora, String coordenada, String descricao,
                int visibilidade, int testemunhas, String observador) {
        this.id = id;
        this.dataHora = dataHora;
        this.coordenada = coordenada;
        this.descricao = descricao;
        this.visibilidade = visibilidade;
        this.testemunhas = testemunhas;
        this.observador = observador;
    }
    public BigInteger getId() {
        return id;
    }

    public LocalTime getDataHora() {
        return dataHora;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVisibilidade() {
        return visibilidade;
    }

    public int getTestemunhas() {
        return testemunhas;
    }

    public String getObservador() {
        return observador;
    }

    public BigInteger setId() {
        return id;
    }

    public LocalTime setDataHora() {
        return dataHora;
    }

    public String setCoordenada() {
        return coordenada;
    }

    public String setDescricao() {
        return descricao;
    }

    public int setVisibilidade() {
        return visibilidade;
    }

    public int setTestemunhas() {
        return testemunhas;
    }

    public String setObservador() {
        return observador;
    }

   public String descricaoCurta(){
        return "Avistamento: " + this.dataHora + " " + this.coordenada + " " + this.descricao;
    }
}

