package br.com.letheia.ufology;

import java.util.Scanner;

public class ExibirMenu {
    public ExibirMenu(){
        System.out.println("[1] Novo avistamento, [2] Listar, [3] Filtrar por nível, [4] Estatísticas, [0] Sair.");

        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();
        switch (sc) {
            case "1":
                System.out.println("Novo avistamento selecionado");
                break;

            case "2":
                System.out.println("Listando");
                break;
            case "3":
                System.out.println("Filtrando");
                break;
            case "4":
                System.out.println("estatisticas");
                break;
            case "0":
                System.out.println("saindo");
                break;

            default:
                System.out.println("Digite valor valido");
        }
    }
}
