package Day8_23;

public class Test1 {

	public static void main(String[] args) {

		Color red = Color.BLACK;
		System.out.println(red);
		Color green = Color.GREEN;
		System.out.println(green);

		Color2 color2 = Color2.BLUE;

		System.out.println(color2);

		Color2 c2 = Color2.GREEN;
		System.out.println(c2);

		Color2 red2 = Color2.RED;

		System.out.println(red2);

		System.out.println(red2.name());
		System.out.println(red2.values());

		for (Color2 c : red2.values()) {

			System.out.println(c.name());

		}
		
		for (Color2 c : Color2.values()) {

			System.out.println(c.name());

		}
	

	}

}
