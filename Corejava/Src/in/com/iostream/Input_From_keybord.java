package in.com.iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Input_From_keybord {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		FileWriter write = new FileWriter("C:\\Users\\lokesh solanki\\Desktop\\iojava\\lokesh.txt");
		PrintWriter out = new PrintWriter(write);
		
		String line = in.readLine();
		while(!(line.equalsIgnoreCase("wrong"))){
			out.println(line);
		 	line = in.readLine();
		}
		System.out.println("you are wrong");
		isr.close();
		in.close();
		write.close();
		out.close();
	}
}
