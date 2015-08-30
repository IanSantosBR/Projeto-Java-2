package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import índices.Cor;
import índices.Câmbio;
import índices.Estilo;
import índices.Fabricante;
import índices.Modelo;
import índices.Motorização;
import índices.TipoVeículo;

public class NovoVeículo {
	private static String chassi;
	private static float preço;
	private static int cilindrada; 
	private static int capacidadeDoTanque;
	static int opção;
	private static Scanner lêOpção = new Scanner(System.in);
	public static HashMap<String, Enum> mapa;
	static Veículo veiculo;
	public static Veículo NovosVeículo(){
		
		veiculo=new Veículo();
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
		veiculo.setMapa(mapa);
		veiculo.setChassi(defineChassi());
		veiculo.setPreço(definePreço());
		return veiculo;
	}

	static TipoVeículo defineTipoVeículo() {
		TipoVeículo veículo = null;
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println("1 - Carro  			       \n" + 
			       	           "2 - Moto   			       \n" +
			                   "-----------------------------");
			System.out.print("Escolha o tipo do veículo: ");
			
			try {
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineTipoVeículo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (TipoVeículo tv: TipoVeículo.values()){
				if (tv.getOpção() == (opção - 1)){
					veículo = tv;
					confirmacao=true;//Se a opcao foi encontrada entao libera para a proxima opcao
				}
			}
		}
		
		return veículo;
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
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineFabricante();//faz uma nova chada para a mesma classe
			}
			for (Fabricante fa: Fabricante.values()){
				if (fa.getOpção() == (opção - 1)){
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
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineModelo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Modelo mo: Modelo.values()){
				if(mo.getOpção() == (opção - 1)){
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
	        		   		   "3 - Sedã                   \n" +
	        		   		   "4 - Hatchback   		   \n" +
	        		   		   "5 - Trail                  \n" +
		                       "-----------------------------");
			System.out.print("Escolha o estilo: ");
			try {
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineEstilo();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Estilo es: Estilo.values()){
				if (es.getOpção() == (opção - 1)){
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
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineCor();//faz uma nova chada para o mesmo metodo da classe
			}
			for (Cor co: Cor.values()){
				if (co.getOpção() == (opção - 1)){
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
			System.out.print("Digite o número do chassi: ");
			chassi = lêOpção.next();
			confirmacao=true;
		}
		return chassi;
	}
	
	private static float definePreço() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite o preço: ");
			try {
				preço = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				definePreço();//faz uma nova chada para o mesmo metodo da classe
			}
			if(preço>0) confirmacao=true;
			else {
				System.out.println();
				System.out.print("Digite o preço: ");
			}
		}
		return preço;
	}
	
	private static Motorização defineMotorização() {
		Motorização motorização = null;
		System.out.println();
		System.out.println("1 - 1.0                    \n" + 
                           "2 - 1.3                    \n" +
                           "3 - 1.4                    \n" +
                           "4 - 1.5                    \n" +
                           "5 - 1.6                    \n" +
                           "6 - 1.8                    \n" +
                           "7 - 2.0                    \n" +
                           "-----------------------------");
    	System.out.print("Escolha a motorização: ");
		
		try {
			opção = lêOpção.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Somente números são permitidos neste campo. \n");
			lêOpção.nextLine();//Limpa a entrada
			
			defineMotorização();//faz uma nova chada para o mesmo metodo da classe
		}
			for (Motorização mo: Motorização.values()){
				if (mo.getOpção() == (opção - 1)){
					motorização = mo;
				}
			}
		return motorização;
	}
	
	private static Câmbio defineCâmbio() {
		
			Câmbio câmbio = null;
			boolean confirmacao=false;
			while(!confirmacao){
			System.out.println();
			System.out.println("1 - Automático        \n" + 
	                           "2 - Semi-Automático   \n" +
	                           "3 - Manual            \n" +
							   "--------------------------");
			System.out.print("Escolha o câmbio: ");
			opção = lêOpção.nextInt();
			try {
				opção = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
				defineCâmbio();//faz uma nova chamada para o mesmo metodo da classe
			}
			for (Câmbio câ: Câmbio.values()){
				if (câ.getOpção() == (opção - 1)){
					câmbio = câ;
					confirmacao=true;
				}
			}
		}
		return câmbio;
	}
	
	private static int defineCilindrada() {
		boolean confirmacao=false;
		while(!confirmacao){
			System.out.println();
			System.out.print("Digite a cilindrada: ");
			
			try {
				cilindrada = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
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
				capacidadeDoTanque = lêOpção.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos neste campo. \n");
				lêOpção.nextLine();//Limpa a entrada
				
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
