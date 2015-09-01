package estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import arquivo.Salva;
import principal.Menu;

public class Loja {
	public String nome;
	private String endere�o;
	public static ArrayList <Ve�culo> estoque = new ArrayList <Ve�culo>();
	
	public Loja(String nome, String endere�o) {
		this.nome = "Loja de Ve�culos";
		this.endere�o = endere�o;
	}
	
	public static void adicionar() {
		Ve�culo ve�culo = new Ve�culo();
		estoque.add(ve�culo);
		try {
           Salva.gravar(ve�culo);
        } catch (IOException e) {
            System.err.println("Ocorreu um problema na grava��o do arquivo.");
        }
		System.out.println();
		System.out.println("O ve�culo foi cadastrado. \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }
	}

	public static void remover(String chassi) {
		boolean apagou = false;
		try {
			for (Ve�culo ve: estoque){
				if (ve.getChassi().equals(chassi)){
					estoque.remove(ve);
					apagou = true;
					System.out.println();
					System.out.println("O ve�culo foi removido. \n");
					Thread.sleep(1500);
				}
			}
			if (!apagou){
				System.err.println("\nN�o existe ve�culo cadastrado com esse chassi. \n");
			}
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		} catch (ConcurrentModificationException ex) {
			Menu.main(null);
		  }
	}
	
	public static void listar() {
		StringBuilder ve�culo = new StringBuilder();
		for (Ve�culo ve: estoque){
		    ve�culo.append(ve.toString());
		}
		System.out.println(ve�culo.toString());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }	
	}

	/*public static Ve�culo buscarChassi(String chassi){ 		//Ao executar e depois pedir pra fechar o programa, ele abre o main.
		Ve�culo ve�culo = null;
		boolean achou = false;
		for (Ve�culo ve: estoque){
			if (ve.getChassi().equals(chassi)){
				ve�culo = ve;
				achou = true;
			}
		}
		if (!achou){
			System.out.println();
			System.out.println("N�o existe ve�culo cadastrado com esse chassi. \n");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
		}
		return ve�culo;
	}
	
	public static ArrayList<Ve�culo> pesquisar() {					//Retorna a lista de ve�culos mesmo quando n�o s�o do mesmo tipo.
		ArrayList <Ve�culo> ve�culos = new ArrayList <Ve�culo>();
		Ve�culo ve�culo = new Ve�culo();
		for (Ve�culo ve: estoque){
			if (ve.equals(ve�culo) == true){
				ve�culos.add(ve);
			}
		}
		return ve�culos;
	}*/
	
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