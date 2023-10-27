package in.com.iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterdemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c://xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("its me");
		bw.newLine();
		//bw.flush();
		bw.close();
		System.out.println("ho gya");
	}
}
