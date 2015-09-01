package estoque;

import java.util.HashMap;
import java.util.Scanner;

import �ndices.*;
import estoque.Loja;

@SuppressWarnings("rawtypes")
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
	    boolean existe = false;
	    TipoVe�culo ve�culo = null;
		System.out.println("1 - Carro  			       \n" + 
		       	           "2 - Moto   			       \n" +
		                   "-----------------------------");
		System.out.print("Escolha o tipo do ve�culo: ");
		op��o = l�Op��o.nextInt();
		for (TipoVe�culo tv: TipoVe�culo.values()){
			if (tv.getOp��o() == (op��o - 1)){
				ve�culo = tv;
				existe = true;
			}
		}
    	while(!existe){
    	    System.err.println("\nOp��o inv�lida. \n");
    	    return defineTipoVe�culo();
		}
		return ve�culo;
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
		op��o = l�Op��o.nextInt();
		Fabricante fabricante = null;
		for (Fabricante fa: Fabricante.values()){
			if (fa.getOp��o() == (op��o - 1)){
				fabricante = fa;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOp��o inv�lida.");
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
		op��o = l�Op��o.nextInt();
		Modelo modelo = null;
		for (Modelo mo: Modelo.values()){
			if(mo.getOp��o() == (op��o - 1)){
				modelo = mo;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOp��o inv�lida.");
            return defineModelo();
        }
		return modelo;
	}
	
	private Estilo defineEstilo() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Perua  		   		   \n" + 
        		   		   "2 - Esportivo    		   \n" +
        		   		   "3 - Sed�                   \n" +
        		   		   "4 - Hatchback   		   \n" +
        		   		   "5 - Trail                  \n" +
	                       "-----------------------------");
		System.out.print("Escolha o estilo: ");
		op��o = l�Op��o.nextInt();
		Estilo estilo = null;
		for (Estilo es: Estilo.values()){
			if (es.getOp��o() == (op��o - 1)){
				estilo = es;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOp��o inv�lida.");
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
		op��o = l�Op��o.nextInt();
		Cor cor = null;
		for (Cor co: Cor.values()){
			if (co.getOp��o() == (op��o - 1)){
				cor = co;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOp��o inv�lida.");
            return defineCor();
        }
		return cor;
	}
	
	private String defineChassi() {
	    boolean cadastrado = false;
		System.out.println();
		System.out.print("Digite o n�mero do chassi: ");
		chassi = l�Op��o.next();
		if(chassi.equals("0")){
		    System.err.println("\nO chassi n�o pode ser zero.");
		    return defineChassi();
		}
		for (Ve�culo ve: Loja.estoque){
            if (ve.getChassi().equals(chassi)){
                cadastrado = true;
            }
		}
        while(cadastrado){
            System.err.println("\nJ� existe um ve�culo cadastrado com esse chassi.");
            return defineChassi();
        }
		return chassi;
	}
	
	private float definePre�o() {
		System.out.println();
		System.out.print("Digite o pre�o: ");
		pre�o = l�Op��o.nextInt();
		if(pre�o < 0){
		    System.err.println("\nO pre�o n�o pode ser negativo.");  
		    return definePre�o();
		}
		return pre�o;
	}
	
	private Motoriza��o defineMotoriza��o() {
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
    	System.out.print("Escolha a motoriza��o: ");
		op��o = l�Op��o.nextInt();
		Motoriza��o motoriza��o = null;
			for (Motoriza��o mo: Motoriza��o.values()){
				if (mo.getOp��o() == (op��o - 1)){
					motoriza��o = mo;
					existe = true;
				}
			}
		while(!existe){
		    System.err.println("\nOp��o inv�lida.");
		    return defineMotoriza��o();
	    }
		return motoriza��o;
	}
	
	private C�mbio defineC�mbio() {
	    boolean existe = false;
		System.out.println();
		System.out.println("1 - Autom�tico        \n" + 
                           "2 - Semi-Autom�tico   \n" +
                           "3 - Manual            \n" +
						   "--------------------------");
		System.out.print("Escolha o c�mbio: ");
		op��o = l�Op��o.nextInt();
		C�mbio c�mbio = null;
		for (C�mbio c�: C�mbio.values()){
			if (c�.getOp��o() == (op��o - 1)){
				c�mbio = c�;
				existe = true;
			}
		}
		while(!existe){
            System.err.println("\nOp��o inv�lida.");
            return defineC�mbio();
        }
		return c�mbio;
	}
	
	private int defineCilindrada() {
		System.out.println();
		System.out.print("Digite a cilindrada: ");
		cilindrada = l�Op��o.nextInt();
		if(cilindrada <= 0){
            System.err.println("\nA cilindrada n�o pode ser menor que 1.");  
            return defineCilindrada();
        }
		return cilindrada;
	}
	
	private int defineCapacidadeDoTanque() {
		System.out.println();
		System.out.print("Digite a capacidade do tanque: ");
		capacidadeDoTanque = l�Op��o.nextInt();
		if(capacidadeDoTanque < 0){
            System.err.println("\nA capacidade do tanque n�o pode ser negativa.");  
            return defineCapacidadeDoTanque();
        }
		return capacidadeDoTanque;
	}
	
	@Override
	public String toString() {
	    String novaLinha = System.getProperty("line.separator");
		if (mapa.containsValue(TipoVe�culo.CARRO)){
			return novaLinha + "==========================================================" + novaLinha + "\t\t\t" +
				   " CARRO " + novaLinha +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha +
				   " Motoriza��o: " + mapa.get("Motoriza��o") + " | C�mbio: " + mapa.get("C�mbio") + " | Cor: " + mapa.get("Cor") + novaLinha +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + novaLinha +
				   "========================================================== " + novaLinha;
		}
		else {
			return novaLinha + "==========================================================" + novaLinha + "\t\t\t" +
				   " MOTO " + novaLinha +
				   " Fabricante: " + mapa.get("Fabricante") + " | Modelo: " + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha +
				   " Cilindrada: " + cilindrada + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + novaLinha +
				   " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + novaLinha +
				   "========================================================== " + novaLinha;
		}
	}
	
	public String getChassi() {
		return chassi;
	}

	public float getPre�o() {
		return pre�o;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}
}