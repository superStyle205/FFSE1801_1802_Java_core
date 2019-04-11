package Lab4;

public class ConCho extends DongVat {
	public void speak() {
		System.out.println("Gâu Gâu");
	}
	
	public static void main(String[] args) {
		DongVat conCho = new ConCho();
		conCho.speak();
	}
}
