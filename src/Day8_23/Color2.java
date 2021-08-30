package Day8_23;

public enum Color2 {

	RED("red"), GREEN("green"), BLUE("blue");
	private String desc;
	private Color2(String desc) {
		this.desc=desc;
		System.out.println("ππ‘Ï¡À£∫" + desc);

	}

	@Override
	public String toString() {
		
		return desc;
	}

}
