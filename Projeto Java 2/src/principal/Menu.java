package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private static Scanner l�Op��o;

	public static void main(String[] args) {
		
		int op��o = 236541789; //N�o pode ser 0, printava outras partes do main ao chamar excess�es; 
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
			System.err.println("Somente n�meros s�o permitidos nesse campo. \n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			  }
			main(args);
		}
		
		switch (op��o) {
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
