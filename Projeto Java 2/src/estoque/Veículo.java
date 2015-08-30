package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import índices.*;

public class Veículo {
	
	private String chassi;
	private float preço;
	private int cilindrada; 
	private int capacidadeDoTanque;
	public HashMap<String, Enum> mapa;
	public Veículo(int empty){
		
	}
	public Veículo() {
			
	}
	
	
	@Override
	public String toString() {
		if (mapa.containsValue(TipoVeículo.CARRO)){
			return " \n" + "==========================================================" + "\n" + "\t\t\t" +
				   " CARRO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Motorização: " + mapa.get("Motorização") + " | Câmbio: " + mapa.get("Câmbio") + " | Cor: " + mapa.get("Cor") + "\n" +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + "\n" +
				   "========================================================== \n";
		}
		else {
			return " \n" + "==========================================================" + "\n" + "\t\t\t" +
				   " MOTO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + "\n" +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + "\n" +
				   "========================================================== \n";
		}
	}
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(int capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	public HashMap<String, Enum> getMapa() {
		return mapa;
	}
	
	public void setMapa(HashMap<String, Enum> mapa) {
		this.mapa = mapa;
	}
	public String getFabricante(){
		
		String fabricante = mapa.get("Fabricante").toString();
		return fabricante;
	}
public String getModelo(){
		
		String Modelo = mapa.get("Modelo").toString();
		return Modelo;
	}
	public String getEstilo(){
	
	String Estilo = mapa.get("Estilo").toString();
	return Estilo;
}
	public String getMotorização(){
		
		String motorização = mapa.get("Motorização").toString();
		return motorização;
	}
	public String getCâmbio(){
			
			String câmbio = mapa.get("Câmbio").toString();
			return câmbio;
	}
	public String getCor(){
		
		String cor = mapa.get("Cor").toString();
		return cor;
	}
	
	
public String getTipoVeiculo(){
		
		String tipoVeiculo = mapa.get("TipoVeículo").toString();
		return tipoVeiculo;
	}

	
}