package Day8_23;

public enum Color2 {

	RED("red"), GREEN("green"), BLUE("blue");
	private String desc;
	private Color2(String desc) {
		this.desc=desc;
		System.out.println("�����ˣ�" + desc);

	}

	@Override
	public String toString() {
		
		return desc;
	}

}
