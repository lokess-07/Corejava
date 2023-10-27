package in.com.iostream;

import java.io.File;
import java.io.IOException;

public class Make_dir {

	public static void main(String[] args) throws IOException {
		File f = new File ("Lokess_07");
		f.mkdir();
		File f1 = new File(f,"xyx.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
	}

}
