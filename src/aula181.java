import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class aula181 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = "C:\\Users\\Alexandro\\Documents\\TREINAMENTO JAVA COMPLETO - UDEMY";
		String arquivo = strPath + "\\Exercicio aula 181.csv";
		System.out.println(arquivo);
		
		System.out.println("LENDO O ARQUIVO .CSV:");
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {			
			String line = br.readLine();
			
			while (line != null) {
				String[] produtoSeparado = line.split(",");
				
				String nome = produtoSeparado[0];
				double preco = Double.parseDouble(produtoSeparado[1]);
				int qtde = Integer.parseInt(produtoSeparado[2]);
				
				produto180 p = new produto180(nome, preco, qtde);
				double valorTotal = p.valorTotal();
			
				line = br.readLine();
				
				//criar subpasta
				boolean sucess = new File(strPath + "\\out").mkdir();
				
				// Escrever no novo arquivo
				String path = strPath + "\\out\\summary.csv";
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
						bw.write(p.getNome() + "," + p.valorTotal());
						bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
