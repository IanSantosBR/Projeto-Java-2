package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private static Scanner lêOpção;

	public static void main(String[] args) {
		
		int opção = 236541789; //Não pode ser 0, printava outras partes do main ao chamar excessões; 
		lêOpção = new Scanner(System.in);
		
		System.out.println("\t ----------------"   );
		System.out.println("\t LOJA DE VEÍCULOS"   );
		System.out.println("\t ---------------- \n");
		System.out.println("1 - Adicionar veículo  \n" + 
				       	   "2 - Remover veículo    \n" +
				       	   "3 - Buscar por chassi  \n" +
				           "4 - Pesquisar veículo  \n" +
				           "5 - Exibir estoque     \n" +
				           "0 - Sair 			   \n" +
				           "---------------------    ");
		System.out.print("Escolha uma opção: ");
		try {
			opção = lêOpção.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Somente números são permitidos nesse campo. \n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
			main(args);
		}
		
		switch (opção) {
		case 1:
			System.out.println("1");
			break;
			
		case 2: 
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 4:
			System.out.println("4");
			break;
			
		case 5:
			System.out.println("5");
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
			System.err.println("A opção escolhida é inválida, tente novamente. \n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			  } 
			main(args);
		}
	}
}	
