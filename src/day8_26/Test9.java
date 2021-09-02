package day8_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test9 {

	public static void main(String[] args) throws Exception {
		System.out.println("====×Ö·ûÁ÷====");
		File file = new File("D:/myfiles/a.txt");

		Reader reader = new FileReader(file);

		char[] cbuf = new char[20];

		int num = reader.read(cbuf);

		for (char c : cbuf) {

			System.out.print(c);

		}
		// System.out.println(new String(cbuf));

		System.out.println("");

		String str = new String(cbuf, 0, num);
		System.out.println(str);
		
	
		byte[] b=str.getBytes("utf-8");
		str=new String(b,"utf-8");
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
