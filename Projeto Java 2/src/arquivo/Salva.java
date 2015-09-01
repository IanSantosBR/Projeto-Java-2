package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

import estoque.Veículo;

public class Salva {
    
    private static PrintWriter escritor;
    
    public static void gravar(Veículo veículo) throws IOException {

        File diretório = new File("src/cadastro");
        diretório.mkdir();
        File arquivo = new File(diretório, "Veículos.txt");
        escritor = new PrintWriter((new BufferedWriter(new FileWriter(arquivo, true))));
        escritor.printf(veículo.toString());
        escritor.close();
    }
}