package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {

	private static InputStream in;

	public static void main(String[] args) throws InterruptedException, IOException {

		File file = new File("D:/myfiles/a2.txt");

		OutputStream out = new FileOutputStream(file);

		/*
		 * out.write(97); out.write(98); out.write(99); out.write(100);
		 */

		byte[] data = { 'h', 'e', 'l', 'l', 'o' };

		out.write(data);

		String str = "hello bwf";

		out.write(str.getBytes());
		System.out.println("========================");
		
		long start=System.currentTimeMillis();
		//��ȡ�ļ�
		file = new File("D:\\CloudMusic\\MV/a.mp4");
		in = new FileInputStream(file);
		//д�ļ�
		File file2=new File("D:\\CloudMusic\\MV/a2.mp4");
	    out= new FileOutputStream(file2);
		
		
		byte[] buff=new byte[10];
		int i=0;
		while((i=in.read(buff))!=-1) {
			out.write(buff);
			out.flush();
			
		}
		
		long end=System.currentTimeMillis();
		System.out.println("����ʱ�䣺"+(end-start)/1000+"��");

	}

}
