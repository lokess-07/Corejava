package in.com.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadImage1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\lokesh solanki\\Desktop\\iojava\\nature-3289812_1280.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Nature.jpg");
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();
		System.out.println("Chaloo ho gya!!");
	} 

}
