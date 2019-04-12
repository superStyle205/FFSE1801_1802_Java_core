package Lab4BaiTap;

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
		return (2 * diemJava + diemCss + diemHTMl) / 4;
	}
	public void xuat() {
		super.xuat();
		System.out.println("Điểm Java : " + diemJava);
		System.out.println("Điểm Css : " + diemCss);
		System.out.println("Điểm Html : " + diemHTMl);
	}
}
