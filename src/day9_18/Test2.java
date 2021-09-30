package day9_18;

import java.io.File;
import java.lang.reflect.Field;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class u1=User.class;
		System.out.println(u1);
		
		User u=new User();
		
		Class u2=u.getClass();
		System.out.println(u2);
		
 		Class u3=Class.forName("day9_18.User");
 		System.out.println(u3);
		
		

 		System.out.println(u1==u2);
 		System.out.println(u1==u3);
 		System.out.println(u3==u2);
 		
 		System.out.println("======================");
 		
 		//Field [] f1= u1.getFields();
 		
 		Field [] f1=u1.getDeclaredFields();
 		
 		System.out.println("���Ը�����"+f1.length);
 		
 		System.out.println(f1[0].getName());
 		System.out.println("�������η� ��"+f1[0].getModifiers());    //�������η� 
 		System.out.println(f1[0].getType());		
 		
 		System.out.println(f1[1].getName());
 		System.out.println("�������η� ��"+f1[1].getModifiers());   //�������η� 
 		System.out.println(f1[1].getType());
 		
 		System.out.println(f1[2].getName());
 		System.out.println("�������η� ��"+f1[2].getModifiers());   //�������η� 
 		System.out.println(f1[2].getType());
 		
 		
 		
	}

}
