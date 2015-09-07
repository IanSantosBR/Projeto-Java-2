package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import estoque.Loja;
import estoque.Veículo;
import ajustes.SincronizaConsole;

public class Menu {

    private static Scanner lêOpção;
    static String chassi = null;

    public static void main(String[] args) {

        int opção = 236541789;
        lêOpção = new Scanner(System.in);

        SincronizaConsole.fixConsole();
        System.out.println("\t ----------------");
        System.out.println("\t LOJA DE VEÍCULOS");
        System.out.println("\t ---------------- \n");
        System.out.println("1 - Adicionar veículo  \n" +
                           "2 - Remover veículo    \n" +
                           "3 - Buscar por chassi  \n" +
                           "4 - Pesquisar veículo  \n" +
                           "5 - Exibir estoque     \n" +
                           "0 - Sair 			   \n" +
                           "---------------------    ");
        System.out.print("Escolha uma opção: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("\nSomente números são permitidos neste campo. \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            main(args);
        }

        switch (opção) {
        case 1:
            System.out.println();
            System.out.println("\t ----------------------------   ");
            System.out.println("\t LOJA DE VEÍCULOS - ADICIONAR   ");
            System.out.println("\t ---------------------------- \n");
            Loja.adicionar();
            main(args);
            break;

        case 2:
            System.out.println();
            System.out.println("\t ---------------------------- ");
            System.out.println("\t LOJA DE VEÍCULOS - REMOVER ");
            System.out.println("\t ---------------------------- \n");
            System.out.print("Digite o chassi para remover: ");
            chassi = lêOpção.next();
            Loja.remover(chassi);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            main(args);
            break;

        case 3:
            System.out.println();
            System.out.println("\t ---------------------------------- ");
            System.out.println("\t LOJA DE VEÍCULOS - BUSCAR CHASSI ");
            System.out.println("\t ---------------------------------- \n");
            System.out.print("Digite o chassi para buscar: ");
            chassi = lêOpção.next();
            Veículo veículo = Loja.buscarChassi(chassi);
            try {
                System.out.println(veículo.toString());
                Thread.sleep(1500);
            } catch (NullPointerException ex) {
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            main(args);
            break;
            
        case 5:
            System.out.println();
            System.out.println("\t ----------------------------- ");
            System.out.println("\t LOJA DE VEÍCULOS - LISTAR ");
            System.out.println("\t ----------------------------- ");
            if (Loja.estoque.isEmpty()) {
                System.err.println("\nNão existem veículos cadastrados. \n");
            } else {
                Loja.listar();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            main(args);
            break;

        case 236541789:
            System.exit(0);

        case 0:
            System.out.print("Fechando o programa... ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Terminou.");
            break;

        default:
            System.err.println("\nA opção escolhida é inválida. \n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            main(args);
        }
    }
}
