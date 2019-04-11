package lab4model;

public class MyClass {
	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat(5, 2);
		ChuNhat cn2 = new ChuNhat(7,3);
		cn1.xuat();
		cn2.xuat();
		ChuNhat hv = new HinhVuong(5);
		hv.xuat();

	}
}
