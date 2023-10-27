package in.com.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) throws IOException {
		FileReader read = new FileReader("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Boss.txt");
		Scanner sc = new Scanner(read);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
