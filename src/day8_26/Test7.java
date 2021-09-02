package day8_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test7 {

	public static void main(String[] args) throws Exception {

		File file = new File("D:/myfiles/a2.txt");

		OutputStream out = new FileOutputStream(file);
		
		out.write(97);
		out.write(98);
		out.write(99);
		out.write(100);
		out.write(101);
		
		
		System.out.println("");
		byte [] data= {'h','e','l','l','o'};
		//out.write(data);
		
		String str="hellobwf";
		out.write(str.getBytes());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
