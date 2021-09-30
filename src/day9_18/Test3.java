package day9_18;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class c1=User.class;//��̬��ȡclass��
		
		User u=new User();//��ͨ����ʵ��������
		System.out.println(u.name);
		System.out.println(u.age);
		//System.out.println(u.id);
		
	
		
		Properties pro=new Properties();
		
		pro.load(Test3.class.getResourceAsStream("obj.properties"));
		
		
		
		User user=(User) Class.forName(pro.getProperty("user")).newInstance();
		
		
		Field f1=c1.getDeclaredField("name"); //��ȡname�ֶ�
		
		System.out.println(f1.get(u));        //name�ֶ���u��
		System.out.println("=============");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ֵ����������");
		String fieldName="age";
		
		f1=c1.getDeclaredField(fieldName);
		
	/*	u.name="zhangsan";//��ͨ����
		System.out.println("��ͨ����"+f1.get(u));*/
		
		
		/*f1.set(u, "lisi");  //��������
		System.out.println("��������name"+f1.get(u));*/
	
		
		f1.set(u, 22);
		System.out.println("��������age"+f1.get(u));
		
		System.out.println("========˽�е�=========");
		
		//System.out.println(u.id);
		
	}

}
