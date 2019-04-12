package Lab4;

public class ConMeo extends DongVat {
	public void speak() {
		System.out.println("Meow Meow");
	}
	
	public static void main(String[] args) {
		DongVat conMeo = new ConMeo();
		conMeo.speak();
	}
}
