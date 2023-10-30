package in.com.iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class In_out_Streams {

	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("c://in_out.txt");
		f.write("Aisi job mil jaye.... koi kam wam naii");
		System.out.println("ok");
		//BufferedReader br = new BufferedReader(f);
		f.close();
		 
	}

}
