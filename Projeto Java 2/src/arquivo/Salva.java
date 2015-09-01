package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

import estoque.Ve�culo;

public class Salva {
    
    private static PrintWriter escritor;
    
    public static void gravar(Ve�culo ve�culo) throws IOException {

        File diret�rio = new File("src/cadastro");
        diret�rio.mkdir();
        File arquivo = new File(diret�rio, "Ve�culos.txt");
        escritor = new PrintWriter((new BufferedWriter(new FileWriter(arquivo, true))));
        escritor.printf(ve�culo.toString());
        escritor.close();
    }
}