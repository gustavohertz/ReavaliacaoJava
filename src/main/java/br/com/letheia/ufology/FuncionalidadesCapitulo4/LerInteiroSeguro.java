package br.com.letheia.ufology.FuncionalidadesCapitulo4;

import java.util.Scanner;

public class LerInteiroSeguro {
    Scanner scanner = new Scanner(System.in);

    public int lerInteiroSeguro() {
        while (true) {
            System.out.println("Digite um numero");

            try {
                int valor = scanner.nextInt();

                return valor;
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
                scanner.nextLine();
            }

        }
    }
}
