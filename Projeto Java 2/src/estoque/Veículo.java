package estoque;

import java.util.HashMap;
import java.util.Scanner;

import índices.*;
import estoque.Loja;

@SuppressWarnings("rawtypes")
public class Veículo {
	private String chassi;
	private float preço;
	private int cilindrada; 
	private int capacidadeDoTanque;
	public HashMap<String, Enum> mapa;
	private static Scanner lêOpção = new Scanner(System.in);
	int opção;
	
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
	    boolean existe = false;
	    TipoVeículo veículo = null;
		System.out.println("1 - Carro  			       \n" + 
		       	           "2 - Moto   			       \n" +
		                   "-----------------------------");
		System.out.print("Escolha o tipo do veículo: ");
		opção = lêOpção.nextInt();
		for (TipoVeículo tv: TipoVeículo.values()){
			if (tv.getOpção() == (opção - 1)){
				veículo = tv;
				existe = true;
			}
		}
    	while(!existe){
    	    System.err.println("\nOpção inválida. \n");
    	    return defineTipoVeículo();
		}
		return veículo;
	}
	
	private Fabricante defineFabricante() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Volkswagen             \n" + 
    	           		   "2 - Honda    			   \n" +
    	           		   "3 - Ford    			   \n" +
    	           		   "4 - Toyota    			   \n" +
    	           		   "5 - Hyundai    			   \n" +
		                   "-----------------------------");
		System.out.print("Escolha o fabricante: ");
		opção = lêOpção.nextInt();
		Fabricante fabricante = null;
		for (Fabricante fa: Fabricante.values()){
			if (fa.getOpção() == (opção - 1)){
				fabricante = fa;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOpção inválida.");
            return defineFabricante();
        }
		return fabricante;
	}
	
	private Modelo defineModelo() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Golf                   \n" + 
    	           		   "2 - HR-V    			   \n" +
    	           		   "3 - Focus    			   \n" +
    	           		   "4 - Corolla    			   \n" +
    	           		   "5 - HB20    			   \n" +
		                   "-----------------------------");
		System.out.print("Escolha o modelo: ");
		opção = lêOpção.nextInt();
		Modelo modelo = null;
		for (Modelo mo: Modelo.values()){
			if(mo.getOpção() == (opção - 1)){
				modelo = mo;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOpção inválida.");
            return defineModelo();
        }
		return modelo;
	}
	
	private Estilo defineEstilo() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Perua  		   		   \n" + 
        		   		   "2 - Esportivo    		   \n" +
        		   		   "3 - Sedã                   \n" +
        		   		   "4 - Hatchback   		   \n" +
        		   		   "5 - Trail                  \n" +
	                       "-----------------------------");
		System.out.print("Escolha o estilo: ");
		opção = lêOpção.nextInt();
		Estilo estilo = null;
		for (Estilo es: Estilo.values()){
			if (es.getOpção() == (opção - 1)){
				estilo = es;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOpção inválida.");
            return defineEstilo();
        }
		return estilo;
	}
	
	private Cor defineCor() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Preto  		   		   \n" + 
    	           		   "2 - Branco    			   \n" +
    	           		   "3 - Cinza    			   \n" +
    	           		   "4 - Vermelho               \n" +
    	           		   "5 - Amarelo    			   \n" +
                           "-----------------------------");
		System.out.print("Escolha a cor: ");
		opção = lêOpção.nextInt();
		Cor cor = null;
		for (Cor co: Cor.values()){
			if (co.getOpção() == (opção - 1)){
				cor = co;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOpção inválida.");
            return defineCor();
        }
		return cor;
	}
	
	private String defineChassi() {
	    boolean cadastrado = false;
		System.out.println();
		System.out.print("Digite o número do chassi: ");
		chassi = lêOpção.next();
		if(chassi.equals("0")){
		    System.err.println("\nO chassi não pode ser zero.");
		    return defineChassi();
		}
		for (Veículo ve: Loja.estoque){
            if (ve.getChassi().equals(chassi)){
                cadastrado = true;
            }
		}
        while(cadastrado){
            System.err.println("\nJá existe um veículo cadastrado com esse chassi.");
            return defineChassi();
        }
		return chassi;
	}
	
	private float definePreço() {
		System.out.println();
		System.out.print("Digite o preço: ");
		preço = lêOpção.nextInt();
		if(preço < 0){
		    System.err.println("\nO preço não pode ser negativo.");  
		    return definePreço();
		}
		return preço;
	}
	
	private Motorização defineMotorização() {
	    boolean existe = false;
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
		opção = lêOpção.nextInt();
		Motorização motorização = null;
			for (Motorização mo: Motorização.values()){
				if (mo.getOpção() == (opção - 1)){
					motorização = mo;
					existe = true;
				}
			}
		while(!existe){
		    System.err.println("\nOpção inválida.");
		    return defineMotorização();
	    }
		return motorização;
	}
	
	private Câmbio defineCâmbio() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Automático        \n" + 
                           "2 - Semi-Automático   \n" +
                           "3 - Manual            \n" +
						   "--------------------------");
		System.out.print("Escolha o câmbio: ");
		opção = lêOpção.nextInt();
		Câmbio câmbio = null;
		for (Câmbio câ: Câmbio.values()){
			if (câ.getOpção() == (opção - 1)){
				câmbio = câ;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOpção inválida.");
            return defineCâmbio();
        }
		return câmbio;
	}
	
	private int defineCilindrada() {
		System.out.println();
		System.out.print("Digite a cilindrada: ");
		cilindrada = lêOpção.nextInt();
		if(cilindrada <= 0){
            System.err.println("\nA cilindrada não pode ser menor que 1.");  
            return defineCilindrada();
        }
		return cilindrada;
	}
	
	private int defineCapacidadeDoTanque() {
		System.out.println();
		System.out.print("Digite a capacidade do tanque: ");
		capacidadeDoTanque = lêOpção.nextInt();
		if(capacidadeDoTanque < 0){
            System.err.println("\nA capacidade do tanque não pode ser negativa.");  
            return defineCapacidadeDoTanque();
        }
		return capacidadeDoTanque;
	}
	
	@Override
	public String toString() {
	    String novaLinha = System.getProperty("line.separator");
		if (mapa.containsValue(TipoVeículo.CARRO)){
			return novaLinha + "==========================================================" + novaLinha + "\t\t\t" +
				   " CARRO " + novaLinha +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha +
				   " Motorização: " + mapa.get("Motorização") + " | Câmbio: " + mapa.get("Câmbio") + " | Cor: " + mapa.get("Cor") + novaLinha +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + novaLinha +
				   "========================================================== " + novaLinha;
		}
		else {
			return novaLinha + "==========================================================" + novaLinha + "\t\t\t" +
				   " MOTO " + novaLinha +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + novaLinha +
				   " Nº. Chassi: " + chassi + " | Preço: " + preço + novaLinha +
				   "========================================================== " + novaLinha;
		}
	}
	
	public String getChassi() {
		return chassi;
	}

	public float getPreço() {
		return preço;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}
}