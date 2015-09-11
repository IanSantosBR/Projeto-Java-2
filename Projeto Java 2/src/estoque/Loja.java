package estoque;

//import java.io.IOException;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
//import java.util.InputMismatchException;

//import arquivo.Salva;
import principal.Menu;
import estoque.Veículo;
import ajustes.SincronizaConsole;

public class Loja {
    public String nome;
    private String endereço;
    public static Collection<Veículo> estoque = new HashSet<>();

    public Loja(String nome, String endereço) {
        SincronizaConsole.fixConsole();
        this.nome = "Loja de Veículos";
        this.endereço = endereço;
    }

    public static void adicionar() {
        boolean adicionou = true;
        //try {
            Veículo veículo = new Veículo();
            estoque.add(veículo);
            //Salva.gravar(veículo);
        //} catch (IOException ex) {
            //System.err.println("\nOcorreu um problema na gravação do arquivo. \n");
            //adicionou = false;
       // }

        if (adicionou) {
            System.out.println();
            System.out.println("O veículo foi cadastrado. \n");
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
            for (Veículo ve : estoque) {
                if (ve.getChassi().equals(chassi)) {
                    estoque.remove(ve);
                    apagou = true;
                    System.out.println();
                    System.out.println("O veículo foi removido. \n");
                    Thread.sleep(1000);
                }
            }
            if (!apagou) {
                System.out.println("\nNão existe veículo cadastrado com esse chassi. Digite 0 caso esteja pesquisando. \n");
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        } catch (ConcurrentModificationException ex) {
            Menu.main(null);
        }
    }

    public static void listar() {
        StringBuilder veículo = new StringBuilder();
        for (Veículo ve : estoque) {
            veículo.append(ve.toString());
        }
        System.out.println(veículo.toString());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static Veículo buscarChassi(String chassi) { 
        Veículo veículo = null;
        boolean achou = false;
        for (Veículo ve : estoque) {
            if (ve.getChassi().equals(chassi)) {
                veículo = ve;
                achou = true;
            }
        }
        if (!achou) {
            System.out.println();
            System.out.println("Não existe veículo cadastrado com esse chassi. \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return veículo;
    }
    
    public static Collection<Veículo> pesquisar() {
        Collection<Veículo> veículos = new HashSet<Veículo>();
        System.out.println("Digite 0 para pular alguma opção. \n");
        Veículo veículo = new Veículo();
        for (Veículo ve : estoque) {
            if (ve.equals(veículo) == true) {
                veículos.add(ve);
            }
        } 
        return veículos;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}