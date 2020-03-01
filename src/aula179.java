import java.io.File;
import java.util.Scanner;

public class aula179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);		
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS:");
		for (File file : folders) {
			System.out.println(file);
		}
		
		sc.close();
	}
}
