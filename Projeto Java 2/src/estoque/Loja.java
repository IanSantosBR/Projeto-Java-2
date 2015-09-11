package estoque;

//import java.io.IOException;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
//import java.util.InputMismatchException;

//import arquivo.Salva;
import principal.Menu;
import estoque.Ve�culo;
import ajustes.SincronizaConsole;

public class Loja {
    public String nome;
    private String endere�o;
    public static Collection<Ve�culo> estoque = new HashSet<>();

    public Loja(String nome, String endere�o) {
        SincronizaConsole.fixConsole();
        this.nome = "Loja de Ve�culos";
        this.endere�o = endere�o;
    }

    public static void adicionar() {
        boolean adicionou = true;
        //try {
            Ve�culo ve�culo = new Ve�culo();
            estoque.add(ve�culo);
            //Salva.gravar(ve�culo);
        //} catch (IOException ex) {
            //System.err.println("\nOcorreu um problema na grava��o do arquivo. \n");
            //adicionou = false;
       // }

        if (adicionou) {
            System.out.println();
            System.out.println("O ve�culo foi cadastrado. \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        } else {
            Menu.main(null);
        }
    }

    public static void remover(String chassi) {
        boolean apagou = false;
        try {
            for (Ve�culo ve : estoque) {
                if (ve.getChassi().equals(chassi)) {
                    estoque.remove(ve);
                    apagou = true;
                    System.out.println();
                    System.out.println("O ve�culo foi removido. \n");
                    Thread.sleep(1000);
                }
            }
            if (!apagou) {
                System.out.println("\nN�o existe ve�culo cadastrado com esse chassi. Digite 0 caso esteja pesquisando. \n");
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        } catch (ConcurrentModificationException ex) {
            Menu.main(null);
        }
    }

    public static void listar() {
        StringBuilder ve�culo = new StringBuilder();
        for (Ve�culo ve : estoque) {
            ve�culo.append(ve.toString());
        }
        System.out.println(ve�culo.toString());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static Ve�culo buscarChassi(String chassi) { 
        Ve�culo ve�culo = null;
        boolean achou = false;
        for (Ve�culo ve : estoque) {
            if (ve.getChassi().equals(chassi)) {
                ve�culo = ve;
                achou = true;
            }
        }
        if (!achou) {
            System.out.println();
            System.out.println("N�o existe ve�culo cadastrado com esse chassi. \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return ve�culo;
    }
    
    public static Collection<Ve�culo> pesquisar() {
        Collection<Ve�culo> ve�culos = new HashSet<Ve�culo>();
        System.out.println("Digite 0 para pular alguma op��o. \n");
        Ve�culo ve�culo = new Ve�culo();
        for (Ve�culo ve : estoque) {
            if (ve.equals(ve�culo) == true) {
                ve�culos.add(ve);
            }
        } 
        return ve�culos;
    }

    public String getEndere�o() {
        return endere�o;
    }

    public void setEndere�o(String endere�o) {
        this.endere�o = endere�o;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}