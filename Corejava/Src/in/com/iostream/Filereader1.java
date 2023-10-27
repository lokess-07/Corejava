package in.com.iostream;

import java.io.FileReader;
import java.io.IOException;

public class Filereader1 {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Boss.txt");
		int ch = reader.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch=reader.read();
		}
		reader.close();
	}
}
