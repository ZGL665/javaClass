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
		while ((i = in.read()) != -1) {   //1   ��ȡһ��

			// ����������֣���Ҫ׼�����ַ�
			System.out.print((char) i);

		}
		System.out.println("  ");
		
		System.out.println("==========2  ȫ����ȡ���ŵ�������===========");

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
		
		
		System.out.println("========�µ�=============");

		file = new File("D:\\myfiles/a.txt");
		in = new FileInputStream(file);

		byte[] b2=new byte[3]; 
		/*i=in.read(b);
		System.out.println(i);*/
		int i2=0;
		
		/*i2=in.read(b2, 0, 3);//��һ��
		System.out.print(new String(b2));
		System.out.println(i2);
		
		
		i2=in.read(b2, 0, 3);//�ڶ���
		System.out.print(new String(b2));
		System.out.println(i2);
		
		
		i2=in.read(b2, 0, 3);//������   i2ʵ�ʶ�ȡ���ĸ���
		System.out.print(new String(b2,0,i2));//ת��Ϊ�ַ���ʱ����ƫ�Ƽ���
		System.out.println(i2);*/
		
		
		while ((i2=in.read(b2))!=-1) {
			
			System.out.print(new String(b2,0,i2));
			System.out.println(i2);
		}
		
		
		
		
		System.out.println("");
		
		in.close();
	}

}
