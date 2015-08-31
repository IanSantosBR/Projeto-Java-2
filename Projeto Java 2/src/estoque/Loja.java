package estoque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;

import IO.InputLoad;
import IO.OutputSave;
import principal.Menu;
import índices.TipoVeículo;

public class Loja {
	private String nome;
	private String endereço;
	private static ArrayList <Veículo> estoque = new ArrayList <Veículo>();
	private static Veículo veículo;
	public Loja(){
		Veículo veiculoCarregado=new Veículo(0);
		InputLoad loadSavedFiles=new InputLoad();
		try {
			veiculoCarregado=loadSavedFiles.LoadStoque();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		estoque.add(veiculoCarregado);
	}
	
	public Loja(String nome, String endereço) {
		nome = "Loja de Veículos";
		this.endereço = endereço;
	}
	
	public static void adicionar() {
		Veículo veículo=NovoVeículo.NovosVeículo();
		estoque.add(veículo);
		try {
			OutputSave.SaveToFIle(estoque);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Veículo cadastrado com sucesso. \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		  }
	}

	public static boolean remover(String chassi) {
		boolean apagou = false;

		try {
					
				for (Veículo ve: estoque){
					if (ve.getChassi().equals(chassi)){
						estoque.remove(ve);
						apagou = true;
						System.out.println();
						System.out.println("Veículo removido com sucesso. \n");
						Thread.sleep(1500);
						return apagou;
					}
				}
				if (!apagou){
					System.err.println("Não existe veículo cadastrado com esse chassi. \n");
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
		StringBuilder veículo = new StringBuilder();
		if (estoque.isEmpty()){
			System.out.println("Não existem veículos cadastrados. \n");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
		}
		else {
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
	}

	public static Veículo buscarChassi(String chassi, int option){ 		//Ao executar e depois pedir pra fechar o programa, ele abre o main.
		
		veículo = null;
		boolean achou = false;
		for (Veículo ve: estoque){
			System.out.println(ve.mapa.containsValue(TipoVeículo.CARRO));
			if (ve.getChassi().equals(chassi) && option==1 && ve.mapa.containsValue(TipoVeículo.CARRO)){
				System.out.println(option);
				veículo = ve;
				achou = true;
				return veículo;
			}
			else if (ve.getChassi().equals(chassi) && option==2 && ve.mapa.containsValue(TipoVeículo.MOTO)){
				veículo = ve;
				achou = true;
				return veículo;
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