import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aula178 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Ola", "beleza", "Tudo certo"};
		
		String path = "C:\\Users\\Alexandro\\Documents\\TREINAMENTO JAVA COMPLETO - UDEMY\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
