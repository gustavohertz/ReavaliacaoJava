package br.com.letheia.ufology;

// Capítulo 1
import br.com.letheia.ufology.FuncionalidadesCap1.normalizarRegiao;
import static br.com.letheia.ufology.FuncionalidadesCap1.ValidarEntrada.validarEntrada;

// Capítulo 2
import br.com.letheia.ufology.FuncionalidadesCapitulo2.Observador;
import br.com.letheia.ufology.FuncionalidadesCapitulo2.Coordenada;
import br.com.letheia.ufology.FuncionalidadesCapitulo2.Avistamento;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Capítulo 3 e 4
import br.com.letheia.ufology.FuncionalidadesCapitulo3.Evento;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.LuzAnomala;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.ObjetoSolido;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.SinalRadar;
import br.com.letheia.ufology.FuncionalidadesCapitulo4.CarregarDiario;
import br.com.letheia.ufology.FuncionalidadesCapitulo4.LerInteiroSeguro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("🛸 INICIANDO SISTEMAS DA ESTAÇÃO LETHEIA...\n");

        //CAPÍTULO 1
        System.out.println("--- [CAP 1] TESTANDO VALIDAÇÕES BÁSICAS ---");
        new normalizarRegiao("hahahah");
        validarEntrada(15, 5);
        validarEntrada(25, 0);
        System.out.println("Validações concluídas.\n");


        // CAPÍTULO 2

        System.out.println("--- [CAP 2] TESTANDO DOMÍNIO (OBSERVADORES E COORDENADAS) ---");
        try {
            // Criando Observador com dados válidos (Nascimento é opcional, passei null)
            Observador agente = new Observador(1, "Fox Mulder", null, 987654321L, "mulder@letheia.com");
            System.out.println("Observador registrado: " );

            // Criando Coordenada (Lat e Lon)
            Coordenada local = new Coordenada(-21.55, -45.43);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação no Domínio: " + e.getMessage());
        }
        System.out.println();


        // CAPÍTULO 3

        System.out.println("--- [CAP 3] TESTANDO EVENTOS E POLIMORFISMO ---");
        List<Evento> eventosCaptados = new ArrayList<>();

        eventosCaptados.add(new LuzAnomala());
        eventosCaptados.add(new ObjetoSolido());
        eventosCaptados.add(new SinalRadar());

        for (Evento ev : eventosCaptados) {
            // Chama o método da classe base
            ev.eventoBase();

            // Verifica se o evento implementa a interface Classificavel antes de classificar
            if (ev instanceof br.com.letheia.ufology.FuncionalidadesCapitulo3.Classificavel) {
                ((br.com.letheia.ufology.FuncionalidadesCapitulo3.Classificavel) ev).classificar();
            }
            System.out.println(" - ");
        }
        System.out.println();

        //CAPITULO 4
        System.out.println("--- [CAP 4] TESTANDO EXCEÇÕES E ARQUIVOS ---");

        System.out.println("\nTentando carregar o diário de registros...");
        CarregarDiario carregador = new CarregarDiario();
        try {
            List<Evento> historico = carregador.carregarDiario("diario.txt");
            System.out.println("Diário carregado com sucesso! " + historico.size() + " eventos encontrados.");
        } catch (IOException e) {
            System.out.println("Aviso: O arquivo 'diario.txt' não foi encontrado ou não pôde ser lido.");
            System.out.println("Crie um arquivo 'diario.txt' na raiz do seu projeto para testar essa função.");
        }

        System.out.println("\n SISTEMA ENCERRADO.");
    }
}