package Lab4Bai1;

abstract public class DongVat {
	abstract public void speak();
	public static void main(String[] args) {
		DongVat cho = new Cho();
		DongVat meo= new Meo(); 
		DongVat vit = new Vit();
		cho.speak();
		meo.speak();
		vit.speak();
	}
}
