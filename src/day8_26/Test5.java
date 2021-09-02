package day8_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		File file = new File("D:/myfiles/a.txt");

		Reader reader = new FileReader(file);

		// System.out.println(reader.read());

		char[] cbuf = new char[20];
		int num = reader.read(cbuf);
		for (char c : cbuf) {

			System.out.print(c);

		}
		System.out.println("");
		String str = new String(cbuf,0,num);

		System.out.println(new String(str));
		
		
		
		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
