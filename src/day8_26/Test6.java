package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test6 {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		File file = new File("D:\\myfiles/a.txt");

		InputStream in = new FileInputStream(file);

		/*
		 * System.out.print((char)in.read()); System.out.print((char)in.read());
		 * System.out.print((char)in.read()); System.out.print((char)in.read());
		 * System.out.println((char)in.read());
		 * 
		 * System.out.println(in.read());
		 */

		int i = 0;
		while ((i = in.read()) != -1) {   //1   读取一个

			// 本来输出数字，需要准换成字符
			System.out.print((char) i);

		}
		System.out.println("  ");
		
		System.out.println("==========2  全部读取，放到数组中===========");

		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);

		byte[] b=new byte[2]; 
		/*i=in.read(b);
		System.out.println(i);*/
		i=0;
		StringBuffer sb=new StringBuffer();
		
		while((i=in.read(b))!=-1) {
			
			for (byte c : b) {
				sb.append((char)c);
			}
			
		}
		System.out.println(sb.toString());
		
		
		System.out.println("");
		
		
		System.out.println("========新的=============");

		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);

		byte[] b2=new byte[3]; 
		/*i=in.read(b);
		System.out.println(i);*/
		int i2=0;
		
		/*i2=in.read(b2, 0, 3);//第一次
		System.out.print(new String(b2));
		System.out.println(i2);
		
		
		i2=in.read(b2, 0, 3);//第二次
		System.out.print(new String(b2));
		System.out.println(i2);
		
		
		i2=in.read(b2, 0, 3);//第三次   i2实际读取到的个数
		System.out.print(new String(b2,0,i2));//转化为字符串时进行偏移计算
		System.out.println(i2);*/
		
		
		while ((i2=in.read(b2))!=-1) {
			
			System.out.print(new String(b2,0,i2));
			System.out.println(i2);
		}
		
		
		
		
		System.out.println("");
		
		in.close();
	}

}
