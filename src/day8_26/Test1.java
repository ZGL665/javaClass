package day8_26;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		//������Ŀ�ĸ�·��
		System.out.println(System.getProperty("user.dir"));
		
		//�ֽ����Ŀ¼  bin
		System.out.println(Test1.class.getResource("/"));
		
		//��ǰ�ļ���Ŀ¼,���·��
		System.out.println(Test1.class.getResource(""));
		
		//Ĭ������Ŀ�ĸ�·��
		System.out.println("");
		
		System.out.println("================");
		File f=new File("a.txt");
		System.out.println(f.getPath()); //���·��
		System.out.println(f.getAbsolutePath());//����·��
		
		System.out.println(f.exists());
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
