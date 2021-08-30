package day8_25;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		Test1 t1=new Test1();
		System.out.println(t1);
		//整数
		System.out.println(t1.hashCode());
		//十六进制
		System.out.println(Integer.toHexString(t1.hashCode()));
		
		Test1 t2=new Test1();
		
		System.out.println(t2);
		
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		System.out.println("====================");
		
		String s1=new String("bwf");
		
		System.out.println(s1);
		
		String s2="tom";
		System.out.println(s2);
		
		
		String s3="t";
		String s4=s3+"om";
		
		System.out.println(s2==s4);
		System.out.println(Charset.defaultCharset());
		
		String str="123abc中国";
				
		char[] s5=str.toCharArray();
		System.out.println(s5);
		
				for (char c : s5) {
					
					System.out.println(c);
					                                     
				}
				
				
		String str1="a1中";
		byte [] b1=str1.getBytes("utf-8");
		System.out.println(b1);
		
			String str8="bwf";
			System.out.println(str8.hashCode());
			str8=str8.concat("51testing");
			
			System.out.println(str8);	
			System.out.println(str8.hashCode());
			
			String str9="bwf";
			System.out.println(str9.substring(0, 2));
			
			StringBuffer sb=new StringBuffer();
			System.out.println(sb);
			
			sb.append('a');
			sb.append(true);
			sb.append(55);
			System.out.println(sb.hashCode());
			System.out.println(sb.capacity());
			for (int i = 0; i < 20; i++) {
				
				
				sb.append(i);
			}
			
			System.out.println(sb.capacity());
			
			System.out.println(sb);
			
			sb=sb.reverse();
			System.out.println(sb);
			
			
			
			
			
	}

	

}
