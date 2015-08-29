package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.ArrayList;

import estoque.Loja;
//import estoque.Ve�culo;

public class Menu {

	private static Scanner l�Op��o;
	static String chassi = null;

	public static void main(String[] args) {
		
		int op��o = 236541789; 
		l�Op��o = new Scanner(System.in);
		
		System.out.println("\t ----------------"   );
		System.out.println("\t LOJA DE VE�CULOS"   );
		System.out.println("\t ---------------- \n");
		System.out.println("1 - Adicionar ve�culo  \n" + 
				       	   "2 - Remover ve�culo    \n" +
				       	   "3 - Buscar por chassi  \n" +
				           "4 - Pesquisar ve�culo  \n" +
				           "5 - Exibir estoque     \n" +
				           "0 - Sair 			   \n" +
				           "---------------------    ");
		System.out.print("Escolha uma op��o: ");
		try {
			op��o = l�Op��o.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Somente n�meros s�o permitidos neste campo. \n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
			main(args);
		}
		
		switch (op��o) {
		case 1:
			System.out.println();
			System.out.println("\t ----------------------------   ");
			System.out.println("\t LOJA DE VE�CULOS - ADICIONAR   ");
			System.out.println("\t ---------------------------- \n");
			Loja.adicionar();
			main(args);
			break;
			
		case 2: 
			System.out.println();
			System.out.println("\t ---------------------------- ");
			System.out.println("\t LOJA DE VE�CULOS - REMOVER ");
			System.out.println("\t ---------------------------- \n");
			System.out.print("Digite o chassi para remover: ");
			chassi = l�Op��o.next();
			Loja.remover(chassi);
			main(args);
			break;
			
		/*case 3:
			System.out.println();
			System.out.println("\t ---------------------------------- ");
			System.out.println("\t LOJA DE VE�CULOS - BUSCAR CHASSI ");
			System.out.println("\t ---------------------------------- \n");
			System.out.print("Digite o chassi para buscar: ");
			chassi = l�Op��o.next();
			Ve�culo ve�culo = Loja.buscarChassi(chassi);
			try {
				System.out.println(ve�culo.toString());
				Thread.sleep(1500);
			} catch (NullPointerException ex){
				main(args);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
			main(args);
			break;
			
		case 4:
			System.out.println();
			System.out.println("\t ---------------------------- ");
			System.out.println("\t LOJA DE VE�CULOS - PESQUISAR ");
			System.out.println("\t ---------------------------- \n");
			ArrayList<Ve�culo> ve�culos = new ArrayList<>(Loja.pesquisar());
			if (ve�culos.isEmpty()){
				System.out.println("N�o existem ve�culos cadastrados.");
			}
			else {
				for (Ve�culo ve: ve�culos){
				System.out.println(ve.toString());
				}
			}
			break;*/
			
		case 5:
			System.out.println("\t ----------------------------- ");
			System.out.println("\t LOJA DE VE�CULOS - LISTAR ");
			System.out.println("\t ----------------------------- ");
			Loja.listar();
			main(args);
			break;
			
		case 236541789:
			System.exit(0);
			
		case 0:
			System.out.print("Fechando o programa... ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			  }
			System.out.println("Terminou.");
			break;
			
		default:
			System.err.println("A op��o escolhida � inv�lida, tente novamente. \n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			  } 
			main(args);
		}
	}
}	
	
