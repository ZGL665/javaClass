package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test10 {

	public static void main(String[] args) throws Exception {

		File file=new File("D:/myfiles/a.txt");

		InputStream in=new FileInputStream(file);
		
		
		//字符转换流，字节流转为字符流
		Reader reader=new InputStreamReader(in, "utf-8");
		
		char [] cbuf=new char[20];
		System.out.println(reader.read(cbuf));
		System.out.println(new String(cbuf));
		
		
		
		

	}

}
