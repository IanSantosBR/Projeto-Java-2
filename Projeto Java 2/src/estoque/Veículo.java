package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import índices.*;
import estoque.Loja;
import ajustes.SincronizaConsole;

@SuppressWarnings("rawtypes")
public class Veículo {
    private String chassi;
    private float preço;
    private int cilindrada;
    private int capacidadeDoTanque;
    public HashMap<String, Enum> mapa = new HashMap<String, Enum>();
    private static Scanner lêOpção = new Scanner(System.in);

    public Veículo() {
        SincronizaConsole.fixConsole();
        mapa.put("TipoVeículo", defineTipoVeículo());
        mapa.put("Fabricante", defineFabricante());
        mapa.put("Modelo", defineModelo());
        mapa.put("Estilo", defineEstilo());
        if (mapa.containsValue(TipoVeículo.CARRO)) {
            mapa.put("Motorização", defineMotorização());
            mapa.put("Câmbio", defineCâmbio());
        } else if (mapa.containsValue(TipoVeículo.MOTO)) {
            cilindrada = defineCilindrada();
            capacidadeDoTanque = defineCapacidadeDoTanque();
            } else {
                mapa.put("Motorização", defineMotorização());
                mapa.put("Câmbio", defineCâmbio());
                cilindrada = defineCilindrada();
                capacidadeDoTanque = defineCapacidadeDoTanque();
            }
        mapa.put("Cor", defineCor());
        chassi = defineChassi();
        preço = definePreço();
    }

    private TipoVeículo defineTipoVeículo() {
        TipoVeículo veículo = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println("1 - Carro  		       \n" + 
                           "2 - Moto   		       \n" + 
                           "-----------------------------");
        System.out.print("Escolha o tipo do veículo: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo. \n");
            aux = 1;
        }
        if (opção == 0){
            return veículo;
        }
            else {
                for (TipoVeículo tv : TipoVeículo.values()) {
                    if (tv.getOpção() == opção) {
                        veículo = tv;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineTipoVeículo();
        } else if (!existe) {
            System.err.println("\nOpção inválida. \n");
            lêOpção.nextLine();
            return defineTipoVeículo();
        }
        return veículo;
    }

    private Fabricante defineFabricante() {
        Fabricante fabricante = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println();
        System.out.println("1 - Volkswagen         \n" + 
                           "2 - Honda    	       \n" + 
                           "3 - Ford    	       \n" +
                           "4 - Toyota    	       \n" + 
                           "5 - Hyundai    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha o fabricante: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return fabricante;
        }
            else {
                for (Fabricante fa : Fabricante.values()) {
                    if (fa.getOpção() == opção) {
                        fabricante = fa;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineFabricante();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineFabricante();
        }
        return fabricante;
    }

    private Modelo defineModelo() {
        Modelo modelo = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println();
        System.out.println("1 - Golf               \n" +
                           "2 - HR-V    	       \n" + 
                           "3 - Focus    	       \n" +
                           "4 - Corolla    	       \n" + 
                           "5 - HB20    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha o modelo: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return modelo;
        }
            else {
                for (Modelo mo : Modelo.values()) {
                    if (mo.getOpção() == opção) {
                        modelo = mo;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineModelo();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineModelo();
        }
        return modelo;
    }

    private Estilo defineEstilo() {
        Estilo estilo = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println();
        System.out.println("1 - Perua  		           \n" +
                           "2 - Esportivo              \n" +
                           "3 - Sedã                   \n" +
                           "4 - Hatchback   	       \n" +
                           "5 - Trail                  \n" + 
                           "-----------------------------");
        System.out.print("Escolha o estilo: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return estilo;
        }
            else {
                for (Estilo es : Estilo.values()) {
                    if (es.getOpção() == opção) {
                        estilo = es;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineEstilo();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineEstilo();
        }
        return estilo;
    }

    private Cor defineCor() {
        Cor cor = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println();
        System.out.println("1 - Preto  		       \n" +
                           "2 - Branco    	       \n" +
                           "3 - Cinza    	       \n" +
                           "4 - Vermelho           \n" +
                           "5 - Amarelo    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha a cor: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return cor;
        }
            else {
                for (Cor co : Cor.values()) {
                    if (co.getOpção() == opção) {
                        cor = co;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineCor();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineCor();
        }
        return cor;
    }

    private String defineChassi() {
        boolean cadastrado = false;
        System.out.println();
        System.out.print("Digite o número do chassi: ");
        chassi = lêOpção.next();
        if (chassi.equals("0")) {
            return null;
        }
            else {
                for (Veículo ve : Loja.estoque) {
                    if (ve.getChassi().equals(chassi)) {
                        cadastrado = true;
                    }
                }
            }
        while (cadastrado) {
            System.err.println("\nJá existe um veículo cadastrado com esse chassi. \n*Digite 0 caso esteja pesquisando.");
            return defineChassi();
        }
        return chassi;
    }

    private float definePreço() {
        int aux = 0;
        preço = -1;
        System.out.println();
        System.out.print("Digite o preço: ");
        try {
            preço = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (preço == 0){
            return 0;
        }
        if (aux == 1) {
            lêOpção.nextLine();
            return definePreço();
        }
        else if (preço < 0) {
            System.err.println("\nO preço não pode ser negativo.");
            lêOpção.nextLine();
            return definePreço();
        }
        return preço;
    }
    
    private Motorização defineMotorização() {
        Motorização motorização = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return motorização;
        }
            else {
                for (Motorização mo : Motorização.values()) {
                    if (mo.getOpção() == opção) {
                        motorização = mo;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineMotorização();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineMotorização();
        }
        return motorização;
    }

    private Câmbio defineCâmbio() {
        Câmbio câmbio = null;
        boolean existe = false;
        int aux = 0;
        int opção = -1;
        System.out.println();
        System.out.println("1 - Automático          \n" +
                           "2 - Semi-Automático     \n" +
                           "3 - Manual              \n" +
                           "--------------------------");
        System.out.print("Escolha o câmbio: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (opção == 0){
            return câmbio;
        }
            else {
                for (Câmbio câ : Câmbio.values()) {
                    if (câ.getOpção() == opção) {
                        câmbio = câ;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineCâmbio();
        } else if (!existe) {
            System.err.println("\nOpção inválida.");
            lêOpção.nextLine();
            return defineCâmbio();
        }
        return câmbio;
    }

    private int defineCilindrada() {
        int aux = 0;
        cilindrada = -1;
        System.out.println();
        System.out.print("Digite a cilindrada: ");
        try {
            cilindrada = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (cilindrada == 0){
            return 0;
        }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineCilindrada();
        }
        else if (cilindrada < 0) {
            System.err.println("\nA cilindrada não pode ser menor que 1.");
            lêOpção.nextLine();
            return defineCilindrada();
        }
        return cilindrada;
    }

    private int defineCapacidadeDoTanque() {
        int aux = 0;
        capacidadeDoTanque = -1;
        System.out.println();
        System.out.print("Digite a capacidade do tanque: ");
        try {
            capacidadeDoTanque = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            aux = 1;
        }
        if (capacidadeDoTanque == 0){
            return 0;
        }
        if (aux == 1) {
            lêOpção.nextLine();
            return defineCapacidadeDoTanque();
        }
        else if (capacidadeDoTanque < 0) {
            System.err.println("\nA capacidade do tanque não pode ser negativa.");
            lêOpção.nextLine();
            return defineCapacidadeDoTanque();
        }
        return capacidadeDoTanque;
    }

    @Override
    public String toString() {
        String novaLinha = System.getProperty("line.separator");
        if (mapa.containsValue(TipoVeículo.CARRO)) {
            return novaLinha + "==========================================================" + novaLinha + "\t\t\t"
                    + " CARRO " + novaLinha + " Fabricante: " + mapa.get("Fabricante") + " | Modelo: "
                    + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha + " Motorização: "
                    + mapa.get("Motorização") + " | Câmbio: " + mapa.get("Câmbio") + " | Cor: " + mapa.get("Cor")
                    + novaLinha + " Nº. Chassi: " + chassi + " | Preço: " + preço + novaLinha
                    + "========================================================== " + novaLinha;
        } else {
            return novaLinha + "==========================================================" + novaLinha + "\t\t\t"
                    + " MOTO " + novaLinha + " Fabricante: " + mapa.get("Fabricante") + " | Modelo: "
                    + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha + " Cilindrada: " + cilindrada
                    + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + novaLinha
                    + " Nº. Chassi: " + chassi + " | Preço: " + preço + novaLinha
                    + "========================================================== " + novaLinha;
        }
    }

    /*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadeDoTanque;
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result + cilindrada;
		result = prime * result + ((mapa == null) ? 0 : mapa.hashCode());
		result = prime * result + Float.floatToIntBits(preço);
		return result;
	}*/

	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Veículo other = (Veículo) obj;
        if (this.mapa.get("TipoVeículo") != (other.mapa.get("TipoVeículo")) && (other.mapa.get("TipoVeículo")) != null){
            return false; 
        } 
        if (this.mapa.get("Fabricante") != (other.mapa.get("Fabricante")) && (other.mapa.get("Fabricante")) != null){
            return false;
        }
        if (this.mapa.get("Modelo") != (other.mapa.get("Modelo")) && (other.mapa.get("Modelo")) != null){
            return false;
        }
        if (this.mapa.get("Estilo") != (other.mapa.get("Estilo")) && (other.mapa.get("Modelo")) != null){
            return false;
        }
        
       //if (!this.mapa.get("Motorização").equals(other.mapa.get("Motorização")) && (other.mapa.get("Motorização")) != null){
            //return false;
        //}     ERRO PQ RETORNA STRING
        
        if (this.mapa.get("Câmbio") != (other.mapa.get("Câmbio")) && (other.mapa.get("Câmbio")) != null){
            return false;
        }
        if ((this.cilindrada != other.cilindrada) && (other.cilindrada) != 0) {
            return false;
        }
        if ((this.capacidadeDoTanque != other.capacidadeDoTanque) && (other.capacidadeDoTanque)!= 0) {
            return false;
        }
        if (this.mapa.get("Cor") != (other.mapa.get("Cor")) && (other.mapa.get("Cor")) != null){
            return false;
        }
        if ((this.preço != other.preço) && other.preço != 0){
        	return false;
        }
       return true;
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

    public static Scanner getLêOpção() {
        return lêOpção;
    }

    public static void setLêOpção(Scanner lêOpção) {
        Veículo.lêOpção = lêOpção;
    }
}