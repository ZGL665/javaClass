package day9_22;

public class Child1 extends Base {

	private int c;
	public String d;

	public Child1() {

		System.out.println("�޲εĹ��캯��");

	}

	public Child1(int a) {

		System.out.println("1�������Ĺ��캯��" );

	}

	public Child1(int a, String b) {

		System.out.println("2�������Ĺ��캯��" + a + b);

	}

	/*private Child1(int a) {

		System.out.println("�вε�˽�еĹ��캯��");

	}*/

	private void show3() {

		System.out.println("child1�й�����show3");

	}

	public String show4() {

		System.out.println("child1�е� show4");

		return "51tetsing";

	}

	public String show4(int a) {

		System.out.println("child1�е� show4������int a " + a);

		return "51tetsing";

	}

	public String show4(int a, String b) {

		System.out.println("child1�е� show4  ������int a��String b" + a + b);

		return "51tetsing";

	}

}
