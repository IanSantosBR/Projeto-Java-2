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
        } else {
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
        int cont = 0;
        int op��o = -1;
        System.out.println("1 - Carro  			       \n" + 
                           "2 - Moto   			       \n" + 
                           "-----------------------------");
        System.out.print("Escolha o tipo do ve�culo: ");
        try {
            op��o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo. \n");
            cont = 1;
        }
        if (op��o == 0){
            return ve�culo;
        }
            else {
                for (TipoVe�culo tv : TipoVe�culo.values()) {
                    if (tv.getOp��o() == (op��o - 1)) {
                        ve�culo = tv;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int op��o = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (op��o == 0){
            return fabricante;
        }
            else {
                for (Fabricante fa : Fabricante.values()) {
                    if (fa.getOp��o() == (op��o - 1)) {
                        fabricante = fa;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int op��o = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (op��o == 0){
            return modelo;
        }
            else {
                for (Modelo mo : Modelo.values()) {
                    if (mo.getOp��o() == (op��o - 1)) {
                        modelo = mo;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int op��o = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (op��o == 0){
            return estilo;
        }
            else {
                for (Estilo es : Estilo.values()) {
                    if (es.getOp��o() == (op��o - 1)) {
                        estilo = es;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        int op��o = -1;
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
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (op��o == 0){
            return cor;
        }
            else {
                for (Cor co : Cor.values()) {
                    if (co.getOp��o() == (op��o - 1)) {
                        cor = co;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
            return chassi;
        }
            else {
                for (Ve�culo ve : Loja.estoque) {
                    if (ve.getChassi().equals(chassi)) {
                        cadastrado = true;
                    }
                }
            }
        while (cadastrado) {
            System.err.println("\nJ� existe um ve�culo cadastrado com esse chassi.");
            return defineChassi();
        }
        return chassi;
    }

    private float definePre�o() {
        int cont = 0;
        pre�o = -1;
        System.out.println();
        System.out.print("Digite o pre�o: ");
        try {
            pre�o = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (pre�o == 0){
            return pre�o;
        }
        if (cont == 1) {
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
        int cont = 0;
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
            cont = 1;
        }
        if (op��o == 0){
            return motoriza��o;
        }
            else {
                for (Motoriza��o mo : Motoriza��o.values()) {
                    if (mo.getOp��o() == (op��o - 1)) {
                        motoriza��o = mo;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
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
            cont = 1;
        }
        if (op��o == 0){
            return c�mbio;
        }
            else {
                for (C�mbio c� : C�mbio.values()) {
                    if (c�.getOp��o() == (op��o - 1)) {
                        c�mbio = c�;
                        existe = true;
                    }
                }
            }
        if (cont == 1) {
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
        int cont = 0;
        cilindrada = -1;
        System.out.println();
        System.out.print("Digite a cilindrada: ");
        try {
            cilindrada = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (cilindrada == 0){
            return cilindrada;
        }
        if (cont == 1) {
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
        int cont = 0;
        capacidadeDoTanque = -1;
        System.out.println();
        System.out.print("Digite a capacidade do tanque: ");
        try {
            capacidadeDoTanque = l�Op��o.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("\nSomente n�meros s�o permitidos neste campo.");
            cont = 1;
        }
        if (capacidadeDoTanque == 0){
            return capacidadeDoTanque;
        }
        if (cont == 1) {
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