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
	private static Scanner l�Op��o = new Scanner(System.in);
	int op��o;
	
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
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println("1 - Carro  			       \n" + 
			       	           "2 - Moto   			       \n" +
			                   "-----------------------------");
			System.out.print("Escolha o tipo do ve�culo: ");
			
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineTipoVe�culo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (TipoVe�culo tv: TipoVe�culo.values()){
				if (tv.getOp��o() == (op��o - 1)){
					ve�culo = tv;
					confirmacao=true;//Se a opcao foi encontrada entao libera para a proxima opcao
				}
			}
		}
		return ve�culo;
	}
	
	private Fabricante defineFabricante() {
		Fabricante fabricante = null;
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.println("1 - Volkswagen             \n" + 
	    	           		   "2 - Honda    			   \n" +
	    	           		   "3 - Ford    			   \n" +
	    	           		   "4 - Toyota    			   \n" +
	    	           		   "5 - Hyundai    			   \n" +
			                   "-----------------------------");
			System.out.print("Escolha o fabricante: ");
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineFabricante();//faz uma nova chada para a mesma classe
			}
			for (Fabricante fa: Fabricante.values()){
				if (fa.getOp��o() == (op��o - 1)){
					fabricante = fa;
					confirmacao=true;
				}
			}
		}
		return fabricante;
	}
	
	private Modelo defineModelo() {
		Modelo modelo = null;
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.println("1 - Golf                   \n" + 
	    	           		   "2 - HR-V    			   \n" +
	    	           		   "3 - Focus    			   \n" +
	    	           		   "4 - Corolla    			   \n" +
	    	           		   "5 - HB20    			   \n" +
			                   "-----------------------------");
			System.out.print("Escolha o modelo: ");
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineModelo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Modelo mo: Modelo.values()){
				if(mo.getOp��o() == (op��o - 1)){
					modelo = mo;
					confirmacao=true;
				}
			}
		}
		return modelo;
	}
	
	private Estilo defineEstilo() {
		Estilo estilo = null;
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.println("1 - Perua  		   		   \n" + 
	        		   		   "2 - Esportivo    		   \n" +
	        		   		   "3 - Sed�                   \n" +
	        		   		   "4 - Hatchback   		   \n" +
	        		   		   "5 - Trail                  \n" +
		                       "-----------------------------");
			System.out.print("Escolha o estilo: ");
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineEstilo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Estilo es: Estilo.values()){
				if (es.getOp��o() == (op��o - 1)){
					estilo = es;
					confirmacao=true;
				}
			}
		}
		return estilo;
	}
	
	private Cor defineCor() {
		Cor cor = null;
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.println("1 - Preto  		   		   \n" + 
	    	           		   "2 - Branco    			   \n" +
	    	           		   "3 - Cinza    			   \n" +
	    	           		   "4 - Vermelho               \n" +
	    	           		   "5 - Amarelo    			   \n" +
	                           "-----------------------------");
			System.out.print("Escolha a cor: ");
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineCor();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Cor co: Cor.values()){
				if (co.getOp��o() == (op��o - 1)){
					cor = co;
					confirmacao=true;
				}
			}
		}
		return cor;
	}
	
	private String defineChassi() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite o n�mero do chassi: ");
			chassi = l�Op��o.next();
			confirmacao=true;
		}
		return chassi;
	}
	
	private float definePre�o() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite o pre�o: ");
			try {
				pre�o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.definePre�o();//faz uma nova chada para o mesmo metodo da classe
			}
			if(pre�o>0) confirmacao=true;
			else {
				System.out.println();
				System.out.print("Digite o pre�o: ");
			}
		}
		return pre�o;
	}
	
	private Motoriza��o defineMotoriza��o() {
		Motoriza��o motoriza��o = null;
		System.out.println();
		System.out.println("1 - 1.0                    \n" + 
                           "2 - 1.3                    \n" +
                           "3 - 1.4                    \n" +
                           "4 - 1.5                    \n" +
                           "5 - 1.6                    \n" +
                           "6 - 1.8                    \n" +
                           "7 - 2.0                    \n" +
                           "-----------------------------");
    	System.out.print("Escolha a motoriza��o: ");
		
		try {
			op��o = l�Op��o.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Somente n�meros s�o permitidos neste campo. \n");
			l�Op��o.nextLine();//Limpa a entrada
			
			this.defineMotoriza��o();//faz uma nova chada para o mesmo metodo da classe
		}
			for (Motoriza��o mo: Motoriza��o.values()){
				if (mo.getOp��o() == (op��o - 1)){
					motoriza��o = mo;
				}
			}
		return motoriza��o;
	}
	
	private C�mbio defineC�mbio() {
		
			C�mbio c�mbio = null;
			boolean confirmacao=false;
			while(!confirmacao){
			System.out.println();
			System.out.println("1 - Autom�tico        \n" + 
	                           "2 - Semi-Autom�tico   \n" +
	                           "3 - Manual            \n" +
							   "--------------------------");
			System.out.print("Escolha o c�mbio: ");
			op��o = l�Op��o.nextInt();
			try {
				op��o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineC�mbio();//faz uma nova chada para o mesmo metodo da classe
			}
			for (C�mbio c�: C�mbio.values()){
				if (c�.getOp��o() == (op��o - 1)){
					c�mbio = c�;
					confirmacao=true;
				}
			}
		}
		return c�mbio;
	}
	
	private int defineCilindrada() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite a cilindrada: ");
			
			try {
				cilindrada = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineCilindrada();//faz uma nova chada para o mesmo metodo da classe
			}
			if(cilindrada>0) confirmacao=true;
			
		}
		return cilindrada;
		
	}
	
	private int defineCapacidadeDoTanque() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite a capacidade do tanque: ");
			try {
				capacidadeDoTanque = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				this.defineCapacidadeDoTanque();//faz uma nova chada para o mesmo metodo da classe
			}
			if(capacidadeDoTanque<0) {
				confirmacao=false;
				System.err.println("A capacidade do tanque precisa ser maior que zero. \n");
			}
			else confirmacao=true;
		}
		return capacidadeDoTanque;
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
}