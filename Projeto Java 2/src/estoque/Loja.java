package estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import arquivo.Salva;
import principal.Menu;

public class Loja {
	public String nome;
	private String endereço;
	public static ArrayList <Veículo> estoque = new ArrayList <Veículo>();
	
	public Loja(String nome, String endereço) {
		this.nome = "Loja de Veículos";
		this.endereço = endereço;
	}
	
	public static void adicionar() {
		Veículo veículo = new Veículo();
		estoque.add(veículo);
		try {
           Salva.gravar(veículo);
        } catch (IOException e) {
            System.err.println("Ocorreu um problema na gravação do arquivo.");
        }
		System.out.println();
		System.out.println("O veículo foi cadastrado. \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }
	}

	public static void remover(String chassi) {
		boolean apagou = false;
		try {
			for (Veículo ve: estoque){
				if (ve.getChassi().equals(chassi)){
					estoque.remove(ve);
					apagou = true;
					System.out.println();
					System.out.println("O veículo foi removido. \n");
					Thread.sleep(1500);
				}
			}
			if (!apagou){
				System.err.println("\nNão existe veículo cadastrado com esse chassi. \n");
			}
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		} catch (ConcurrentModificationException ex) {
			Menu.main(null);
		  }
	}
	
	public static void listar() {
		StringBuilder veículo = new StringBuilder();
		for (Veículo ve: estoque){
		    veículo.append(ve.toString());
		}
		System.out.println(veículo.toString());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }	
	}

	/*public static Veículo buscarChassi(String chassi){ 		//Ao executar e depois pedir pra fechar o programa, ele abre o main.
		Veículo veículo = null;
		boolean achou = false;
		for (Veículo ve: estoque){
			if (ve.getChassi().equals(chassi)){
				veículo = ve;
				achou = true;
			}
		}
		if (!achou){
			System.out.println();
			System.out.println("Não existe veículo cadastrado com esse chassi. \n");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
		}
		return veículo;
	}
	
	public static ArrayList<Veículo> pesquisar() {					//Retorna a lista de veículos mesmo quando não são do mesmo tipo.
		ArrayList <Veículo> veículos = new ArrayList <Veículo>();
		Veículo veículo = new Veículo();
		for (Veículo ve: estoque){
			if (ve.equals(veículo) == true){
				veículos.add(ve);
			}
		}
		return veículos;
	}*/
	
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