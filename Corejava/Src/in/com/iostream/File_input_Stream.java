package in.com.iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class File_input_Stream {

	public static void main(String[] args) throws IOException {
		FileInputStream in  = new FileInputStream("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Boss.txt");
			int b = 0;
			while(in.read()!= -1) {
				System.out.println((char)b);
			}
		
		in.close();
	}


}