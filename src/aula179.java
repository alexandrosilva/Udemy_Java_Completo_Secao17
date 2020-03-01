import java.io.File;
import java.util.Scanner;

public class aula179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);		
		File[] folders = path.listFiles(File::isDirectory);

		// Verificar as subpastas da pasta
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Verificar os arquivos da pasta
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("ARQUIVOS:");
		for (File file : files) {
			System.out.println(file);
		}
	
		// Criar subpasta	
		boolean sucess = new File(strPath + "\\teste").mkdir();
		System.out.println("Arquivo criado com sucesso??? " + sucess);
		
		folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		sc.close();
	}
}
