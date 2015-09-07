package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import estoque.Loja;
import estoque.Ve�culo;
import ajustes.SincronizaConsole;

public class Menu {

    private static Scanner l�Op��o;
    static String chassi = null;

    public static void main(String[] args) {

        int op��o = 236541789;
        l�Op��o = new Scanner(System.in);

        SincronizaConsole.fixConsole();
        System.out.println("\t ----------------");
        System.out.println("\t LOJA DE VE�CULOS");
        System.out.println("\t ---------------- \n");
        System.out.println("1 - Adicionar ve�culo  \n" +
                           "2 - Remover ve�culo    \n" +
                           "3 - Buscar por chassi  \n" +
                           "4 - Pesquisar ve�culo  \n" +
                           "5 - Exibir estoque     \n" +
                           "0 - Sair 			   \n" +
                           "---------------------    ");
        System.out.print("Escolha uma op��o: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo. \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            main(args);
        }

        switch (op��o) {
        case 1:
            System.out.println();
            System.out.println("\t ----------------------------   ");
            System.out.println("\t LOJA DE VE�CULOS - ADICIONAR   ");
            System.out.println("\t ---------------------------- \n");
            Loja.adicionar();
            main(args);
            break;

        case 2:
            System.out.println();
            System.out.println("\t ---------------------------- ");
            System.out.println("\t LOJA DE VE�CULOS - REMOVER ");
            System.out.println("\t ---------------------------- \n");
            System.out.print("Digite o chassi para remover: ");
            chassi = l�Op��o.next();
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
            System.out.println("\t LOJA DE VE�CULOS - BUSCAR CHASSI ");
            System.out.println("\t ---------------------------------- \n");
            System.out.print("Digite o chassi para buscar: ");
            chassi = l�Op��o.next();
            Ve�culo ve�culo = Loja.buscarChassi(chassi);
            try {
                System.out.println(ve�culo.toString());
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
            System.out.println("\t LOJA DE VE�CULOS - LISTAR ");
            System.out.println("\t ----------------------------- ");
            if (Loja.estoque.isEmpty()) {
                System.err.println("\nN�o existem ve�culos cadastrados. \n");
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
            System.err.println("\nA op��o escolhida � inv�lida. \n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            main(args);
        }
    }
}
