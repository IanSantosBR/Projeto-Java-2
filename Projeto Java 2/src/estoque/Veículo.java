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
        } else {
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
        int cont = 0;
        int opção = -1;
        System.out.println("1 - Carro  			       \n" + 
                           "2 - Moto   			       \n" + 
                           "-----------------------------");
        System.out.print("Escolha o tipo do veículo: ");
        try {
            opção = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo. \n");
            cont = 1;
        }
        if (opção == 0){
            return veículo;
        }
            else {
                for (TipoVeículo tv : TipoVeículo.values()) {
                    if (tv.getOpção() == (opção - 1)) {
                        veículo = tv;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int opção = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (opção == 0){
            return fabricante;
        }
            else {
                for (Fabricante fa : Fabricante.values()) {
                    if (fa.getOpção() == (opção - 1)) {
                        fabricante = fa;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int opção = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (opção == 0){
            return modelo;
        }
            else {
                for (Modelo mo : Modelo.values()) {
                    if (mo.getOpção() == (opção - 1)) {
                        modelo = mo;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int opção = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (opção == 0){
            return estilo;
        }
            else {
                for (Estilo es : Estilo.values()) {
                    if (es.getOpção() == (opção - 1)) {
                        estilo = es;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int opção = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (opção == 0){
            return cor;
        }
            else {
                for (Cor co : Cor.values()) {
                    if (co.getOpção() == (opção - 1)) {
                        cor = co;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
            return chassi;
        }
            else {
                for (Veículo ve : Loja.estoque) {
                    if (ve.getChassi().equals(chassi)) {
                        cadastrado = true;
                    }
                }
            }
        while (cadastrado) {
            System.err.println("\nJá existe um veículo cadastrado com esse chassi.");
            return defineChassi();
        }
        return chassi;
    }

    private float definePreço() {
        int cont = 0;
        preço = -1;
        System.out.println();
        System.out.print("Digite o preço: ");
        try {
            preço = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (preço == 0){
            return preço;
        }
        if (cont == 1) {
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
        int cont = 0;
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
            cont = 1;
        }
        if (opção == 0){
            return motorização;
        }
            else {
                for (Motorização mo : Motorização.values()) {
                    if (mo.getOpção() == (opção - 1)) {
                        motorização = mo;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
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
            cont = 1;
        }
        if (opção == 0){
            return câmbio;
        }
            else {
                for (Câmbio câ : Câmbio.values()) {
                    if (câ.getOpção() == (opção - 1)) {
                        câmbio = câ;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        cilindrada = -1;
        System.out.println();
        System.out.print("Digite a cilindrada: ");
        try {
            cilindrada = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (cilindrada == 0){
            return cilindrada;
        }
        if (cont == 1) {
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
        int cont = 0;
        capacidadeDoTanque = -1;
        System.out.println();
        System.out.print("Digite a capacidade do tanque: ");
        try {
            capacidadeDoTanque = lêOpção.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente números são permitidos neste campo.");
            cont = 1;
        }
        if (capacidadeDoTanque == 0){
            return capacidadeDoTanque;
        }
        if (cont == 1) {
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