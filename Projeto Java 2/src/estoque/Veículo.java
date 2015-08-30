package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import �ndices.*;

public class Ve�culo {
	
	private String chassi;
	private float pre�o;
	private int cilindrada; 
	private int capacidadeDoTanque;
	public HashMap<String, Enum> mapa;
	public Ve�culo(int empty){
		
	}
	public Ve�culo() {
			
	}
	
	
	@Override
	public String toString() {
		if (mapa.containsValue(TipoVe�culo.CARRO)){
			return " \n" + "==========================================================" + "\n" + "\t\t\t" +
				   " CARRO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Motoriza��o: " + mapa.get("Motoriza��o") + " | C�mbio: " + mapa.get("C�mbio") + " | Cor: " + mapa.get("Cor") + "\n" +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + "\n" +
				   "========================================================== \n";
		}
		else {
			return " \n" + "==========================================================" + "\n" + "\t\t\t" +
				   " MOTO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + "\n" +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + "\n" +
				   "========================================================== \n";
		}
	}
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
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
	public String getMotoriza��o(){
		
		String motoriza��o = mapa.get("Motoriza��o").toString();
		return motoriza��o;
	}
	public String getC�mbio(){
			
			String c�mbio = mapa.get("C�mbio").toString();
			return c�mbio;
	}
	public String getCor(){
		
		String cor = mapa.get("Cor").toString();
		return cor;
	}
	
	
public String getTipoVeiculo(){
		
		String tipoVeiculo = mapa.get("TipoVe�culo").toString();
		return tipoVeiculo;
	}

	
}