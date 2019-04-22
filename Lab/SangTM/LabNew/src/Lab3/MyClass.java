package Lab3;

public class MyClass {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham("Thuốc", 10000, 10);
		sp1.nhap();
		sp1.xuat();
		
		SanPham sp2 = new SanPham("Gạo", 20000, 5);
		sp2.nhap();
		sp2.xuat();	
	}
}
