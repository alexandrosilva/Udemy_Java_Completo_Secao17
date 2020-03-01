import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Forma simplificada em relação a aula 176
 */

public class aula177 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Alexandro\\Documents\\TREINAMENTO JAVA COMPLETO - UDEMY\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {		
			String line = br.readLine();
			while (line != null) {			
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
