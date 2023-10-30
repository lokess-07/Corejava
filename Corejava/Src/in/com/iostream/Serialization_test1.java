package in.com.iostream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization_test1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream("C:\\Users\\lokesh solanki\\Desktop\\iojava\\Serialization.txt");
		ObjectOutputStream out = new ObjectOutputStream(in);
		Serization1 s1 = new Serization1();
		s1.c = 44;
		s1.java = 56;
		s1.name = "Lokesh Solanki";
		s1.python = 66;
		s1.id = 7;
		out.writeObject(s1);
		
		System.out.println("Successfully done");

	}

}
