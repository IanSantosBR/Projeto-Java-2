package IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import estoque.Veículo;
public class OutputSave {
	static public void SaveToFIle(ArrayList<Veículo> estoque) throws IOException{
		
	
		String userHomeFolder=System.getProperty("user.home");
		userHomeFolder+="\\Desktop";
		File arquivo = new File(userHomeFolder,"Bilhete.txt");
		PrintWriter pw = new PrintWriter(new FileOutputStream(arquivo,true));

		
		for(Veículo ItemEstoque: estoque){
			pw.println(ItemEstoque.getChassi());
			pw.println(ItemEstoque.getPreço());
			pw.println(ItemEstoque.getFabricante());
			pw.println(ItemEstoque.getModelo());
			pw.println(ItemEstoque.getEstilo());
			if(ItemEstoque.getTipoVeiculo().equals("Carro")){
				pw.println(ItemEstoque.getMotorização());
				pw.println(ItemEstoque.getCâmbio());
			}
			else{
				pw.println(ItemEstoque.getCilindrada());
				pw.println(ItemEstoque.getCapacidadeDoTanque());
			}
			pw.println(ItemEstoque.getCor());
			pw.println(ItemEstoque.getTipoVeiculo());
			pw.println();
		}
		pw.close();

	}
}
