package day8_26;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		//整个项目的根路径
		System.out.println(System.getProperty("user.dir"));
		
		//字节码根目录  bin
		System.out.println(Test1.class.getResource("/"));
		
		//当前文件的目录,相对路径
		System.out.println(Test1.class.getResource(""));
		
		//默认是项目的根路径
		System.out.println("");
		
		System.out.println("================");
		File f=new File("a.txt");
		System.out.println(f.getPath()); //相对路径
		System.out.println(f.getAbsolutePath());//绝对路径
		
		System.out.println(f.exists());
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
