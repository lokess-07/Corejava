package in.com.iostream;

import java.io.File;

public class Show_files1 {

	public static void main(String[] args) {
		File f = new File("C:\\Rays Software\\Workspace\\Corejava\\Corejava\\Apna Collage\\in\\com\\array");
		int count = 0;
		String [] s= f.list();
		for(String s1:s) {
			File f1 = new File(f,s1);
			if(f1.isFile()){
			count++;
			System.out.println(s1);
		}
		//System.out.println("total number of count is "+count);
			
	}
		System.out.println("Total files are "+count+" in this Directory ");

	}
}