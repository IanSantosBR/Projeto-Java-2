package IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import estoque.Ve�culo;
public class InputLoad {
	
	public static Ve�culo LoadStoque() throws IOException{
		
		
		String userHomeFolder=System.getProperty("user.home");
		userHomeFolder+="\\Desktop";
		File arquivo = new File(userHomeFolder,"Bilhete.txt");
		FileReader fr =new FileReader(arquivo);
		BufferedReader lendoArquivo=new BufferedReader(fr);
		//Salva at� o final
		int line=0;
		String[] array=new String[30];
		while(lendoArquivo.ready()){
			String linha=lendoArquivo.readLine();
			System.out.println(linha);
			array[line]=linha;
			line++;
			
		}
		String chassiSaved=array[0];
		String preco=array[1];
		String capacidadeTanque=array[2];
		String fabricante=array[3];
		String modelo=array[4];
		String estilo=array[5];
		String motorizacao=array[6];
		String cambio=array[7];
		String cor=array[8];
		String tipoVeiculo=array[9];
		
		//fecha o arquivo
		lendoArquivo.close();
		fr.close();
		/*Ve�culo salvaVeiculo=new Ve�culo(tipoVeiculo, fabricante, modelo, estilo, motorizacao, cambio, cor, chassiSaved);
	return salvaVeiculo;*/
		return null;

	}
}

