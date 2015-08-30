package estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import IO.InputLoad;
import IO.OutputSave;
import principal.Menu;

public class Loja {
	private String nome;
	private String endere�o;
	private static ArrayList <Ve�culo> estoque = new ArrayList <Ve�culo>();
	public Loja(){
		Ve�culo veiculoCarregado=new Ve�culo(0);
		InputLoad loadSavedFiles=new InputLoad();
		try {
			veiculoCarregado=loadSavedFiles.LoadStoque();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		estoque.add(veiculoCarregado);
	}
	
	public Loja(String nome, String endere�o) {
		nome = "Loja de Ve�culos";
		this.endere�o = endere�o;
	}
	
	public static void adicionar() {
		Ve�culo ve�culo=NovoVe�culo.NovosVe�culo();
		estoque.add(ve�culo);
		try {
			OutputSave.SaveToFIle(estoque);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Ve�culo cadastrado com sucesso. \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }
	}

	public static boolean remover(String chassi) {
		boolean apagou = false;

		try {
					
				for (Ve�culo ve: estoque){
					if (ve.getChassi().equals(chassi)){
						estoque.remove(ve);
						apagou = true;
						System.out.println();
						System.out.println("Ve�culo removido com sucesso. \n");
						Thread.sleep(1500);
						return apagou;
					}
				}
				if (!apagou){
					System.err.println("N�o existe ve�culo cadastrado com esse chassi. \n");
					return apagou;
				}
			
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		} catch (ConcurrentModificationException ex) {
			Menu.main(null);
		  }
		return apagou;
	}
	
	public static void listar() {
		StringBuilder ve�culo = new StringBuilder();
		if (estoque.isEmpty()){
			System.out.println("N�o existem ve�culos cadastrados. \n");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
		}
		else {
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