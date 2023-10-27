package in.com.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class Write_file1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c://okk.txt");
		char [] str = {'l','s'};
		fw.write(str);
		fw.write("lokesh");
		System.out.println("sucessfully");
		fw.close();
	}
}