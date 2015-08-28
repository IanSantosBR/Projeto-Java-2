package estoque;

import java.util.HashMap;
import java.util.Scanner;

import índices.*;


public class Veículo {
	private String chassi;
	private float preço;
	private int cilindrada; 
	private int capacidadeDoTanque;
	public HashMap<String, Enum> mapa;
	private static Scanner lêOpção = new Scanner(System.in);
	int opção;
	
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
	
	public Veículo() {
		mapa = new HashMap <String, Enum>();
		mapa.put("TipoVeículo", defineTipoVeículo());
		mapa.put("Fabricante", defineFabricante());
		mapa.put("Modelo", defineModelo());
		mapa.put("Estilo", defineEstilo());
			if (mapa.containsValue(TipoVeículo.CARRO)){
				mapa.put("Motorização", defineMotorização());
				mapa.put("Câmbio", defineCâmbio());
			}
				else {
					cilindrada = defineCilindrada();
					capacidadeDoTanque = defineCapacidadeDoTanque();
				}
		mapa.put("Cor", defineCor());
		chassi = defineChassi();
		preço = definePreço();
	}

	private TipoVeículo defineTipoVeículo() {
		TipoVeículo veículo = null;
		System.out.println("1 - Carro  			       \n" + 
		       	           "2 - Moto   			       \n" +
						   "-----------------------------");
		System.out.print("Escolha o tipo do veículo: ");
		opção = lêOpção.nextInt();
		for (TipoVeículo tv: TipoVeículo.values()){
			if (tv.getOpção() == (opção - 1)){
				veículo = tv;
			}
		}
		return veículo;
	}
	
	private Fabricante defineFabricante() {
		Fabricante fabricante = null;
		System.out.println();
		System.out.println("1 - Volkswagen  		   \n" + 
    	           		   "2 - Honda    			   \n" +
    	           		   "3 - Ford    			   \n" +
    	           		   "4 - Toyota    			   \n" +
    	           		   "5 - Hyundai    			   \n" +
						   "-----------------------------");
		System.out.print("Escolha o fabricante: ");
		opção = lêOpção.nextInt();
		for (Fabricante fa: Fabricante.values()){
			if (fa.getOpção() == (opção - 1)){
				fabricante = fa;
			}
		}
		return fabricante;
	}
	
	private Modelo defineModelo() {
		Modelo modelo = null;
		System.out.println();
		System.out.println("1 - Golf  		           \n" + 
    	           		   "2 - HR-V    			   \n" +
    	           		   "3 - Focus    			   \n" +
    	           		   "4 - Corolla    			   \n" +
    	           		   "5 - HB20    			   \n" +
						   "-----------------------------");
		System.out.print("Escolha o modelo: ");
		opção = lêOpção.nextInt();
		for (Modelo mo: Modelo.values()){
			if(mo.getOpção() == (opção - 1)){
				modelo = mo;
			}
		}
		return modelo;
	}
	
	private Estilo defineEstilo() {
		Estilo estilo = null;
		System.out.println();
		System.out.println("1 - Perua  		   		   \n" + 
        		   		   "2 - Esportivo    		   \n" +
        		   		   "3 - Sedã    			   \n" +
        		   		   "4 - Hatchback   		   \n" +
        		   		   "5 - Trail    			   \n" +
				   		   "-----------------------------");
		System.out.print("Escolha o estilo: ");
		opção = lêOpção.nextInt();
		for (Estilo es: Estilo.values()){
			if (es.getOpção() == (opção - 1)){
				estilo = es;
			}
		}
		return estilo;
	}
	
	private Cor defineCor() {
		Cor cor = null;
		System.out.println();
		System.out.println("1 - Preto  		   		   \n" + 
    	           		   "2 - Branco    			   \n" +
    	           		   "3 - Cinza    			   \n" +
    	           		   "4 - Vermelho    		   \n" +
    	           		   "5 - Amarelo    			   \n" +
						   "-----------------------------");
		System.out.print("Escolha a cor: ");
		opção = lêOpção.nextInt();
		for (Cor co: Cor.values()){
			if (co.getOpção() == (opção - 1)){
				cor = co;
			}
		}
		return cor;
	}
	
	private String defineChassi() {
		System.out.println();
		System.out.print("Digite o número do chassi: ");
		chassi = lêOpção.next();
		return chassi;
	}
	
	private float definePreço() {
		System.out.println();
		System.out.print("Digite o preço: ");
		preço = lêOpção.nextInt();
		return preço;
	}
	
	public Motorização defineMotorização() {
		Motorização motorização = null;
		System.out.println();
		System.out.println("1 - 1.0  				   \n" + 
						   "2 - 1.3  				   \n" +
						   "3 - 1.4  				   \n" +
						   "4 - 1.5  				   \n" +
						   "5 - 1.6  				   \n" +
						   "6 - 1.8  				   \n" +
						   "7 - 2.0  				   \n" +
						   "-----------------------------");
    	System.out.print("Escolha a motorização: ");
		opção = lêOpção.nextInt();
			for (Motorização mo: Motorização.values()){
				if (mo.getOpção() == (opção - 1)){
					motorização = mo;
				}
			}
		return motorização;
	}
	
	private Câmbio defineCâmbio() {
		Câmbio câmbio = null;
		System.out.println();
		System.out.println("1 - Automático  	  \n" + 
						   "1 - Semi-Automático   \n" +
						   "1 - Manual  		  \n" +
						   "--------------------------");
		System.out.print("Escolha o câmbio: ");
		opção = lêOpção.nextInt();
		for (Câmbio câ: Câmbio.values()){
			if (câ.getOpção() == (opção - 1)){
				câmbio = câ;
			}
		}
		return câmbio;
	}
	
	private int defineCilindrada() {
		System.out.println();
		System.out.print("Digite a cilindrada: ");
		cilindrada = lêOpção.nextInt();
		return cilindrada;
	}
	
	private int defineCapacidadeDoTanque() {
		System.out.println();
		System.out.print("Digite a capacidade do tanque: ");
		capacidadeDoTanque = lêOpção.nextInt();
		return capacidadeDoTanque;
	}
	
	@Override
	public String toString() {
		if (mapa.containsValue(TipoVeículo.CARRO)){
			return " \n" + "=========================================================" + "\n" + "\t\t\t" +
				   " CARRO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Motorização: " + mapa.get("Motorização") + " | Câmbio: " + mapa.get("Câmbio") + " | Cor: " + mapa.get("Cor") + "\n" +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + "\n" +
				   "==========================================================";
		}
		else {
			return " \n" + "=========================================================" + "\n" + "\t\t\t" +
				   " MOTO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + "\n" +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + "\n" +
				   "==========================================================";
		}
	}
}