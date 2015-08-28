package estoque;

import java.util.HashMap;
import java.util.Scanner;

import �ndices.*;


public class Ve�culo {
	private String chassi;
	private float pre�o;
	private int cilindrada; 
	private int capacidadeDoTanque;
	public HashMap<String, Enum> mapa;
	private static Scanner l�Op��o = new Scanner(System.in);
	int op��o;
	
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
	
	public Ve�culo() {
		mapa = new HashMap <String, Enum>();
		mapa.put("TipoVe�culo", defineTipoVe�culo());
		mapa.put("Fabricante", defineFabricante());
		mapa.put("Modelo", defineModelo());
		mapa.put("Estilo", defineEstilo());
			if (mapa.containsValue(TipoVe�culo.CARRO)){
				mapa.put("Motoriza��o", defineMotoriza��o());
				mapa.put("C�mbio", defineC�mbio());
			}
				else {
					cilindrada = defineCilindrada();
					capacidadeDoTanque = defineCapacidadeDoTanque();
				}
		mapa.put("Cor", defineCor());
		chassi = defineChassi();
		pre�o = definePre�o();
	}

	private TipoVe�culo defineTipoVe�culo() {
		TipoVe�culo ve�culo = null;
		System.out.println("1 - Carro  			       \n" + 
		       	           "2 - Moto   			       \n" +
						   "-----------------------------");
		System.out.print("Escolha o tipo do ve�culo: ");
		op��o = l�Op��o.nextInt();
		for (TipoVe�culo tv: TipoVe�culo.values()){
			if (tv.getOp��o() == (op��o - 1)){
				ve�culo = tv;
			}
		}
		return ve�culo;
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
		op��o = l�Op��o.nextInt();
		for (Fabricante fa: Fabricante.values()){
			if (fa.getOp��o() == (op��o - 1)){
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
		op��o = l�Op��o.nextInt();
		for (Modelo mo: Modelo.values()){
			if(mo.getOp��o() == (op��o - 1)){
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
        		   		   "3 - Sed�    			   \n" +
        		   		   "4 - Hatchback   		   \n" +
        		   		   "5 - Trail    			   \n" +
				   		   "-----------------------------");
		System.out.print("Escolha o estilo: ");
		op��o = l�Op��o.nextInt();
		for (Estilo es: Estilo.values()){
			if (es.getOp��o() == (op��o - 1)){
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
		op��o = l�Op��o.nextInt();
		for (Cor co: Cor.values()){
			if (co.getOp��o() == (op��o - 1)){
				cor = co;
			}
		}
		return cor;
	}
	
	private String defineChassi() {
		System.out.println();
		System.out.print("Digite o n�mero do chassi: ");
		chassi = l�Op��o.next();
		return chassi;
	}
	
	private float definePre�o() {
		System.out.println();
		System.out.print("Digite o pre�o: ");
		pre�o = l�Op��o.nextInt();
		return pre�o;
	}
	
	public Motoriza��o defineMotoriza��o() {
		Motoriza��o motoriza��o = null;
		System.out.println();
		System.out.println("1 - 1.0  				   \n" + 
						   "2 - 1.3  				   \n" +
						   "3 - 1.4  				   \n" +
						   "4 - 1.5  				   \n" +
						   "5 - 1.6  				   \n" +
						   "6 - 1.8  				   \n" +
						   "7 - 2.0  				   \n" +
						   "-----------------------------");
    	System.out.print("Escolha a motoriza��o: ");
		op��o = l�Op��o.nextInt();
			for (Motoriza��o mo: Motoriza��o.values()){
				if (mo.getOp��o() == (op��o - 1)){
					motoriza��o = mo;
				}
			}
		return motoriza��o;
	}
	
	private C�mbio defineC�mbio() {
		C�mbio c�mbio = null;
		System.out.println();
		System.out.println("1 - Autom�tico  	  \n" + 
						   "1 - Semi-Autom�tico   \n" +
						   "1 - Manual  		  \n" +
						   "--------------------------");
		System.out.print("Escolha o c�mbio: ");
		op��o = l�Op��o.nextInt();
		for (C�mbio c�: C�mbio.values()){
			if (c�.getOp��o() == (op��o - 1)){
				c�mbio = c�;
			}
		}
		return c�mbio;
	}
	
	private int defineCilindrada() {
		System.out.println();
		System.out.print("Digite a cilindrada: ");
		cilindrada = l�Op��o.nextInt();
		return cilindrada;
	}
	
	private int defineCapacidadeDoTanque() {
		System.out.println();
		System.out.print("Digite a capacidade do tanque: ");
		capacidadeDoTanque = l�Op��o.nextInt();
		return capacidadeDoTanque;
	}
	
	@Override
	public String toString() {
		if (mapa.containsValue(TipoVe�culo.CARRO)){
			return " \n" + "=========================================================" + "\n" + "\t\t\t" +
				   " CARRO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Motoriza��o: " + mapa.get("Motoriza��o") + " | C�mbio: " + mapa.get("C�mbio") + " | Cor: " + mapa.get("Cor") + "\n" +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + "\n" +
				   "==========================================================";
		}
		else {
			return " \n" + "=========================================================" + "\n" + "\t\t\t" +
				   " MOTO " + "\n" +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + "\n" +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + "\n" +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + "\n" +
				   "==========================================================";
		}
	}
}