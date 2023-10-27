package in.com.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\lokesh solanki\\Desktop\\iojava\\okk.txt");
		PrintWriter out = new PrintWriter(fw);
		out.println("i am thik hu ");
		out.println("kya sahi me !! ");
		System.out.println("sucessfully");
		fw.close();
		out.close();
	}

}
