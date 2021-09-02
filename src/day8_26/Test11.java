package day8_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Test11 {

	public static void main(String[] args) throws Exception {

		File file = new File("D:/myfiles/a.txt");
		//缓冲流需要的是字符流
		Reader reader = new FileReader(file);

		BufferedReader br = new BufferedReader(reader);
		
		/*System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		System.out.println(br.readLine());*/
		
		String str="";
		
		while((str=br.readLine())!=null) {
			
			
			System.out.println(str);
			
		}
		
		System.out.println("========写=======");
		
		file=new File("D:/myfiles/a3.txt");
		
		Writer writer=new FileWriter(file);//从字符输入流中读取文本
		
		BufferedWriter bw =new BufferedWriter(writer);
		
		bw.write("hello");
		bw.write("bwf");
		bw.write("51testing");
		
		bw.flush();//清空缓冲流
		reader.close();
		writer.close();
		br.close();

		
	
	
	
	}

}
