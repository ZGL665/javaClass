package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Test2 {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\myfiles/a.txt");
		// �ļ��ֽ���FileInputStream��InputStream������
		InputStream in = new FileInputStream(file);
		System.out.println(in);

		// ��ȡ�ļ�����
		// System.out.println((char)in.read());

		int c;
		while ((c = in.read()) != -1) {

			System.out.print((char) c);

		}
		

		
		System.out.println();
		
		
		System.out.println("==========��ȡһ������==========");

		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);

		byte[] b = new byte[2];
		int i = 0;
		/*
		 * i=in.read(b); //��һ�ζ�ȡ System.out.println(i);
		 */
		StringBuffer sb = new StringBuffer();

		while ((i = in.read(b)) != -1) {

			for (byte d : b) {

				System.out.print((char) d);

			}

		}

		
		System.out.println("");
		
		System.out.println("===================");
		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);

		byte[] b2 = new byte[3];
		int i2 = 0;
		
	    while((i2=in.read(b2))!=-1) {
	    	
	    	System.out.print(new String(b2,0,i2));
	    	
	    }
		
		System.out.println("=======����=========");
		
		
		
	    in.close();
	}

}
