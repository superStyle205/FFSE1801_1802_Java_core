package Lab4;

public class ConChuot extends DongVat {
	public void speak() {
		System.out.println("Chít Chít");
	}
	
	public static void main(String[] args) {
		DongVat conChuot = new ConChuot();
		conChuot.speak();
	}
}
