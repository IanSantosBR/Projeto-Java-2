package estoque;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import �ndices.*;
import estoque.Loja;
import ajustes.SincronizaConsole;

@SuppressWarnings("rawtypes")
public class Ve�culo {
    private String chassi;
    private float pre�o;
    private int cilindrada;
    private int capacidadeDoTanque;
    public HashMap<String, Enum> mapa = new HashMap<String, Enum>();
    private static Scanner l�Op��o = new Scanner(System.in);

    public Ve�culo() {
        SincronizaConsole.fixConsole();
        mapa.put("TipoVe�culo", defineTipoVe�culo());
        mapa.put("Fabricante", defineFabricante());
        mapa.put("Modelo", defineModelo());
        mapa.put("Estilo", defineEstilo());
        if (mapa.containsValue(TipoVe�culo.CARRO)) {
            mapa.put("Motoriza��o", defineMotoriza��o());
            mapa.put("C�mbio", defineC�mbio());
        } else if (mapa.containsValue(TipoVe�culo.MOTO)) {
            cilindrada = defineCilindrada();
            capacidadeDoTanque = defineCapacidadeDoTanque();
            } else {
                mapa.put("Motoriza��o", defineMotoriza��o());
                mapa.put("C�mbio", defineC�mbio());
                cilindrada = defineCilindrada();
                capacidadeDoTanque = defineCapacidadeDoTanque();
            }
        mapa.put("Cor", defineCor());
        chassi = defineChassi();
        pre�o = definePre�o();
    }

    private TipoVe�culo defineTipoVe�culo() {
        TipoVe�culo ve�culo = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println("1 - Carro  		       \n" + 
                           "2 - Moto   		       \n" + 
                           "-----------------------------");
        System.out.print("Escolha o tipo do ve�culo: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo. \n");
            aux = 1;
        }
        if (op��o == 0){
            return ve�culo;
        }
            else {
                for (TipoVe�culo tv : TipoVe�culo.values()) {
                    if (tv.getOp��o() == op��o) {
                        ve�culo = tv;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineTipoVe�culo();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida. \n");
            l�Op��o.nextLine();
            return defineTipoVe�culo();
        }
        return ve�culo;
    }

    private Fabricante defineFabricante() {
        Fabricante fabricante = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println();
        System.out.println("1 - Volkswagen         \n" + 
                           "2 - Honda    	       \n" + 
                           "3 - Ford    	       \n" +
                           "4 - Toyota    	       \n" + 
                           "5 - Hyundai    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha o fabricante: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return fabricante;
        }
            else {
                for (Fabricante fa : Fabricante.values()) {
                    if (fa.getOp��o() == op��o) {
                        fabricante = fa;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineFabricante();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineFabricante();
        }
        return fabricante;
    }

    private Modelo defineModelo() {
        Modelo modelo = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println();
        System.out.println("1 - Golf               \n" +
                           "2 - HR-V    	       \n" + 
                           "3 - Focus    	       \n" +
                           "4 - Corolla    	       \n" + 
                           "5 - HB20    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha o modelo: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return modelo;
        }
            else {
                for (Modelo mo : Modelo.values()) {
                    if (mo.getOp��o() == op��o) {
                        modelo = mo;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineModelo();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineModelo();
        }
        return modelo;
    }

    private Estilo defineEstilo() {
        Estilo estilo = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println();
        System.out.println("1 - Perua  		           \n" +
                           "2 - Esportivo              \n" +
                           "3 - Sed�                   \n" +
                           "4 - Hatchback   	       \n" +
                           "5 - Trail                  \n" + 
                           "-----------------------------");
        System.out.print("Escolha o estilo: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return estilo;
        }
            else {
                for (Estilo es : Estilo.values()) {
                    if (es.getOp��o() == op��o) {
                        estilo = es;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineEstilo();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineEstilo();
        }
        return estilo;
    }

    private Cor defineCor() {
        Cor cor = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println();
        System.out.println("1 - Preto  		       \n" +
                           "2 - Branco    	       \n" +
                           "3 - Cinza    	       \n" +
                           "4 - Vermelho           \n" +
                           "5 - Amarelo    	       \n" +
                           "-----------------------------");
        System.out.print("Escolha a cor: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return cor;
        }
            else {
                for (Cor co : Cor.values()) {
                    if (co.getOp��o() == op��o) {
                        cor = co;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineCor();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineCor();
        }
        return cor;
    }

    private String defineChassi() {
        boolean cadastrado = false;
        System.out.println();
        System.out.print("Digite o n�mero do chassi: ");
        chassi = l�Op��o.next();
        if (chassi.equals("0")) {
            return null;
        }
            else {
                for (Ve�culo ve : Loja.estoque) {
                    if (ve.getChassi().equals(chassi)) {
                        cadastrado = true;
                    }
                }
            }
        while (cadastrado) {
            System.err.println("\nJ� existe um ve�culo cadastrado com esse chassi. \n*Digite 0 caso esteja pesquisando.");
            return defineChassi();
        }
        return chassi;
    }

    private float definePre�o() {
        int aux = 0;
        pre�o = -1;
        System.out.println();
        System.out.print("Digite o pre�o: ");
        try {
            pre�o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (pre�o == 0){
            return 0;
        }
        if (aux == 1) {
            l�Op��o.nextLine();
            return definePre�o();
        }
        else if (pre�o < 0) {
            System.err.println("\nO pre�o n�o pode ser negativo.");
            l�Op��o.nextLine();
            return definePre�o();
        }
        return pre�o;
    }
    
    private Motoriza��o defineMotoriza��o() {
        Motoriza��o motoriza��o = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return motoriza��o;
        }
            else {
                for (Motoriza��o mo : Motoriza��o.values()) {
                    if (mo.getOp��o() == op��o) {
                        motoriza��o = mo;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineMotoriza��o();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineMotoriza��o();
        }
        return motoriza��o;
    }

    private C�mbio defineC�mbio() {
        C�mbio c�mbio = null;
        boolean existe = false;
        int aux = 0;
        int op��o = -1;
        System.out.println();
        System.out.println("1 - Autom�tico          \n" +
                           "2 - Semi-Autom�tico     \n" +
                           "3 - Manual              \n" +
                           "--------------------------");
        System.out.print("Escolha o c�mbio: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (op��o == 0){
            return c�mbio;
        }
            else {
                for (C�mbio c� : C�mbio.values()) {
                    if (c�.getOp��o() == op��o) {
                        c�mbio = c�;
                        existe = true;
                    }
                }
            }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineC�mbio();
        } else if (!existe) {
            System.err.println("\nOp��o inv�lida.");
            l�Op��o.nextLine();
            return defineC�mbio();
        }
        return c�mbio;
    }

    private int defineCilindrada() {
        int aux = 0;
        cilindrada = -1;
        System.out.println();
        System.out.print("Digite a cilindrada: ");
        try {
            cilindrada = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (cilindrada == 0){
            return 0;
        }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineCilindrada();
        }
        else if (cilindrada < 0) {
            System.err.println("\nA cilindrada n�o pode ser menor que 1.");
            l�Op��o.nextLine();
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
            capacidadeDoTanque = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            aux = 1;
        }
        if (capacidadeDoTanque == 0){
            return 0;
        }
        if (aux == 1) {
            l�Op��o.nextLine();
            return defineCapacidadeDoTanque();
        }
        else if (capacidadeDoTanque < 0) {
            System.err.println("\nA capacidade do tanque n�o pode ser negativa.");
            l�Op��o.nextLine();
            return defineCapacidadeDoTanque();
        }
        return capacidadeDoTanque;
    }

    @Override
    public String toString() {
        String novaLinha = System.getProperty("line.separator");
        if (mapa.containsValue(TipoVe�culo.CARRO)) {
            return novaLinha + "==========================================================" + novaLinha + "\t\t\t"
                    + " CARRO " + novaLinha + " Fabricante: " + mapa.get("Fabricante") + " | Modelo: "
                    + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha + " Motoriza��o: "
                    + mapa.get("Motoriza��o") + " | C�mbio: " + mapa.get("C�mbio") + " | Cor: " + mapa.get("Cor")
                    + novaLinha + " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + novaLinha
                    + "========================================================== " + novaLinha;
        } else {
            return novaLinha + "==========================================================" + novaLinha + "\t\t\t"
                    + " MOTO " + novaLinha + " Fabricante: " + mapa.get("Fabricante") + " | Modelo: "
                    + mapa.get("Modelo") + " | Estilo: " + mapa.get("Estilo") + novaLinha + " Cilindrada: " + cilindrada
                    + " | Cap. do Tanque: " + capacidadeDoTanque + " | Cor: " + mapa.get("Cor") + novaLinha
                    + " N�. Chassi: " + chassi + " | Pre�o: " + pre�o + novaLinha
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
		result = prime * result + Float.floatToIntBits(pre�o);
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
        Ve�culo other = (Ve�culo) obj;
        if (this.mapa.get("TipoVe�culo") != (other.mapa.get("TipoVe�culo")) && (other.mapa.get("TipoVe�culo")) != null){
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
        
       //if (!this.mapa.get("Motoriza��o").equals(other.mapa.get("Motoriza��o")) && (other.mapa.get("Motoriza��o")) != null){
            //return false;
        //}     ERRO PQ RETORNA STRING
        
        if (this.mapa.get("C�mbio") != (other.mapa.get("C�mbio")) && (other.mapa.get("C�mbio")) != null){
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
        if ((this.pre�o != other.pre�o) && other.pre�o != 0){
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

    public static Scanner getL�Op��o() {
        return l�Op��o;
    }

    public static void setL�Op��o(Scanner l�Op��o) {
        Ve�culo.l�Op��o = l�Op��o;
    }
}