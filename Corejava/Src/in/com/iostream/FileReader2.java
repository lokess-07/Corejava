package in.com.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
	public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Boss.txt");
	BufferedReader buf  = new BufferedReader(reader);
	String ch = buf.readLine();
	while(ch != null) {
		System.out.println(ch);
		ch = buf.readLine();
		}
	buf.close();
	reader.close();
	}	
}

