package br.com.letheia.ufology.FuncionalidadesCapitulo4;

import br.com.letheia.ufology.FuncionalidadesCapitulo3.Evento;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.LuzAnomala;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.ObjetoSolido;
import br.com.letheia.ufology.FuncionalidadesCapitulo3.SinalRadar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CarregarDiario {

    /**
     * @param nomeArquivo Nome ou caminho do arquivo (ex: "diario.txt")
     * @return Lista de eventos reconstruídos
     * @throws IOException Caso ocorra erro na leitura do arquivo
     */
    public List<Evento> carregarDiario(String nomeArquivo) throws IOException {
        List<Evento> eventosReconstruidos = new ArrayList<>();
        Path path = Path.of(nomeArquivo);

        List<String> linhas = Files.readAllLines(path);

        for (String linha : linhas) {
            String[] partes = linha.split(";");
            String tipo = partes[0].toUpperCase();

            switch (tipo) {
                case "LUZ":
                    eventosReconstruidos.add(new LuzAnomala());
                    break;
                case "SOLIDO":
                    eventosReconstruidos.add(new ObjetoSolido());
                    break;
                case "RADAR":
                    eventosReconstruidos.add(new SinalRadar());
                    break;
                default:
                    System.out.println("Tipo de evento desconhecido na linha: " + linha);
                    break;
            }
        }

        return eventosReconstruidos;
    }
}
