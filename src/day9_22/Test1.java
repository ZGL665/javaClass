package day9_22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// ������ƻ�ȡ����

		Child1 cd1 = new Child1();

		Class c1 = cd1.getClass();
		System.out.println("=======�ֶ�=========");

		Field[] fs = c1.getFields();

		System.out.println(fs.length);

		System.out.println("=========��ǰ��ķ���===========");
		Method[] ms = c1.getDeclaredMethods(); // ��ǰ���������ķ���
		System.out.println(ms.length);

		for (Method method : ms) {

			System.out.println(method.getName());

		}

		System.out.println("=========���й����ķ���============");
		Method[] m2 = c1.getMethods();
		System.out.println(m2.length);

		for (Method method : m2) {

			System.out.println(method.getName());

		}

		System.out.println("=========���ݷ�������ȡ===========");

		Method m1 = c1.getMethod("show4");

		System.out.println(m1.getModifiers());
		System.out.println(m1.getParameterCount());
		System.out.println(m1.getReturnType());

		m1 = c1.getDeclaredMethod("show4", int.class);
		System.out.println(m1.getParameterCount());

		m1 = c1.getDeclaredMethod("show4", int.class, String.class);
		System.out.println(m1.getParameterCount());

		System.out.println("=========��̬���÷���===========");
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("�����뺯������");*/
		
		
		//m1 = c1.getDeclaredMethod(sc.nextLine());
		//m1.setAccessible(true);

		//Object rt = m1.invoke(cd1); // ���ѷ���
		//System.out.println(rt);
		
		
/*
		System.out.println("=========show4===========");
		m1 = c1.getDeclaredMethod("show4");
		rt = m1.invoke(cd1);   //�����൱�ڵ��÷���
		System.out.println(rt);*/

		System.out.println("==========��������==========");
		
		
		m1=c1.getDeclaredMethod("show4", int.class);
		
		Object rt =m1.invoke(cd1, 100);
		
		System.out.println(rt);
		System.out.println("��������");
		m1=c1.getDeclaredMethod("show4", int.class,String.class);
		rt=m1.invoke(cd1, 1200,"aaaaa");
		System.out.println(rt);
		
		
		
		System.out.println("=========���캯��=============");
		
		
	/*	Constructor[] cs=c1.getConstructors();
		
		System.out.println(cs.length);
		System.out.println(cs[0].getName());
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
