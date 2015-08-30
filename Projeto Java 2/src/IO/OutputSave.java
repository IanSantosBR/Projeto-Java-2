package IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import estoque.Ve�culo;
public class OutputSave {
	static public void SaveToFIle(ArrayList<Ve�culo> estoque) throws IOException{
		
	
		String userHomeFolder=System.getProperty("user.home");
		userHomeFolder+="\\Desktop";
		File arquivo = new File(userHomeFolder,"Bilhete.txt");
		PrintWriter pw = new PrintWriter(new FileOutputStream(arquivo,true));

		
		for(Ve�culo ItemEstoque: estoque){
			pw.println(ItemEstoque.getChassi());
			pw.println(ItemEstoque.getPre�o());
			pw.println(ItemEstoque.getCapacidadeDoTanque());
			pw.println(ItemEstoque.getFabricante());
			pw.println(ItemEstoque.getModelo());
			pw.println(ItemEstoque.getEstilo());
			pw.println(ItemEstoque.getMotoriza��o());
			pw.println(ItemEstoque.getC�mbio());
			pw.println(ItemEstoque.getCor());
			pw.println(ItemEstoque.getTipoVeiculo());
			pw.println();
		}
		pw.close();

	}
}
