package Day8_23;

import java.io.IOError;

public class Outer {
	private int a0 = 1;
	int b0 = 2;
	protected int c0 = 3;
	public int d0 = 4;
	public static int e0 = 5;

	// 非静态内部类/成员内部类
	public class Inner {

		private int a1 = 11;
		int b1 = 22;
		protected int c1 = 33;
		public int d1 = 44;

		public void show2() {

			System.out.println(a0);
			System.out.println(b0);
			System.out.println(c0);
			System.out.println(d0);
			System.out.println(e0);

		}

		// 非静态内部不能定义静态成员
		// public static int e=55;

	}

	public void show1() {
		// 外部类访问内部类

		Inner i = new Inner();
		i.show2();
		System.out.println(i.a1);
		System.out.println(i.b1);
		System.out.println(i.c1);
		System.out.println(i.d1);
		
		//外部类访问静态内部类
		
		inner1 i1=new inner1();
		
		System.out.println(i1.a2);
		System.out.println(i1.b2);
		System.out.println(i1.c2);
		System.out.println(i1.d2);
		i1.show3();
		

	}

	// 静态内部类
	
	public static class inner1 {

		private int a2 = 111;
		int b2 = 222;
		protected int c2 = 333;
		public int d2 = 444;

		public void show3() {
			System.out.println("===========");
			
			Outer o2=new Outer();
			
			System.out.println(o2.a0);
			System.out.println(o2.b0);
			System.out.println(o2.c0);
			System.out.println(o2.d0);
			System.out.println(e0);

		}

	}

}
