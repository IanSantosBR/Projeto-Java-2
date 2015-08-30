package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import �ndices.Cor;
import �ndices.C�mbio;
import �ndices.Estilo;
import �ndices.Fabricante;
import �ndices.Modelo;
import �ndices.Motoriza��o;
import �ndices.TipoVe�culo;

public class NovoVe�culo {
	private static String chassi;
	private static float pre�o;
	private static int cilindrada; 
	private static int capacidadeDoTanque;
	static int op��o;
	private static Scanner l�Op��o = new Scanner(System.in);
	public static HashMap<String, Enum> mapa;
	static Ve�culo veiculo;
	public static Ve�culo NovosVe�culo(){
		
		veiculo=new Ve�culo();
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
		veiculo.setMapa(mapa);
		veiculo.setChassi(defineChassi());
		veiculo.setPre�o(definePre�o());
		return veiculo;
	}

	static TipoVe�culo defineTipoVe�culo() {
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
				
				defineTipoVe�culo();//faz uma nova chada para o mesmo metodo da classe
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
	
	private static Fabricante defineFabricante() {
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
				
				defineFabricante();//faz uma nova chada para a mesma classe
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
	
	private static Modelo defineModelo() {
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
				
				defineModelo();//faz uma nova chada para o mesmo metodo da classe
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
	
	private static Estilo defineEstilo() {
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
				
				defineEstilo();//faz uma nova chada para o mesmo metodo da classe
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
	
	private static Cor defineCor() {
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
				
				defineCor();//faz uma nova chada para o mesmo metodo da classe
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
	
	private static String defineChassi() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite o n�mero do chassi: ");
			chassi = l�Op��o.next();
			confirmacao=true;
		}
		return chassi;
	}
	
	private static float definePre�o() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite o pre�o: ");
			try {
				pre�o = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				definePre�o();//faz uma nova chada para o mesmo metodo da classe
			}
			if(pre�o>0) confirmacao=true;
			else {
				System.out.println();
				System.out.print("Digite o pre�o: ");
			}
		}
		return pre�o;
	}
	
	private static Motoriza��o defineMotoriza��o() {
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
			
			defineMotoriza��o();//faz uma nova chada para o mesmo metodo da classe
		}
			for (Motoriza��o mo: Motoriza��o.values()){
				if (mo.getOp��o() == (op��o - 1)){
					motoriza��o = mo;
				}
			}
		return motoriza��o;
	}
	
	private static C�mbio defineC�mbio() {
		
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
				
				defineC�mbio();//faz uma nova chamada para o mesmo metodo da classe
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
	
	private static int defineCilindrada() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite a cilindrada: ");
			
			try {
				cilindrada = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				defineCilindrada();//faz uma nova chada para o mesmo metodo da classe
			}
			if(cilindrada>0) confirmacao=true;
			
		}
		return cilindrada;
		
	}
	
	private static int defineCapacidadeDoTanque() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite a capacidade do tanque: ");
			try {
				capacidadeDoTanque = l�Op��o.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente n�meros s�o permitidos neste campo. \n");
				l�Op��o.nextLine();//Limpa a entrada
				
				defineCapacidadeDoTanque();//faz uma nova chada para o mesmo metodo da classe
			}
			if(capacidadeDoTanque<0) {
				confirmacao=false;
				System.err.println("A capacidade do tanque precisa ser maior que zero. \n");
			}
			else confirmacao=true;
		}
		return capacidadeDoTanque;
	
	}
}
