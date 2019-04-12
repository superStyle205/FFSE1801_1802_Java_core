package lab4.bai3;

public class SinhVienIT extends SinhVienFpt {
	private double diemJava;
	private double diemCss;
	private double diemHTMl;

	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHTMl) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHTMl = diemHTMl;
	}

	@Override
	public double getDiem() {
		return (diemJava * 2 + diemCss + diemHTMl) / 4;
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("diem java : " + diemJava);
		System.out.println("diem css : " + diemCss);
		System.out.println("diem HTML : " + diemHTMl);
	}
}
