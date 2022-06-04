package Projeto_Social;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) throws IOException  {
		
		Path dir = Paths.get("C:", "teste");

		Path path = dir.resolve("AulaLP.doc");
		
		System.out.println(path);
		ManipuladorArquivo.escritor(path.toString(), null);
		

	}

}
