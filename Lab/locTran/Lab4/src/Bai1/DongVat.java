package Bai1;

public abstract class DongVat {
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
