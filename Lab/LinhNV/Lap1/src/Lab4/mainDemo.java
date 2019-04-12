package Lab4;

public class mainDemo {
	public static void main(String[] asrg) {
		NhanVien nv1 = new NhanVien("B", 5000);
		nv1.xuat();
		
		TruongPhong tp1 = new TruongPhong("A", 5000, 1000);
		tp1.xuat();
		
		LaoCong lc1 = new LaoCong("c", 4000, 5);
		lc1.xuat();
	}
}
