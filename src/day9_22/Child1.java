package day9_22;

public class Child1 extends Base {

	private int c;
	public String d;

	public Child1() {

		System.out.println("无参的构造函数");

	}

	public Child1(int a) {

		System.out.println("1个参数的构造函数" );

	}

	public Child1(int a, String b) {

		System.out.println("2个参数的构造函数" + a + b);

	}

	/*private Child1(int a) {

		System.out.println("有参的私有的构造函数");

	}*/

	private void show3() {

		System.out.println("child1中公共的show3");

	}

	public String show4() {

		System.out.println("child1中的 show4");

		return "51tetsing";

	}

	public String show4(int a) {

		System.out.println("child1中的 show4重载了int a " + a);

		return "51tetsing";

	}

	public String show4(int a, String b) {

		System.out.println("child1中的 show4  重载了int a和String b" + a + b);

		return "51tetsing";

	}

}
