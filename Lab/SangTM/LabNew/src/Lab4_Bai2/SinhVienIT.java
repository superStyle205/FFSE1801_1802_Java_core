package Lab4_Bai2;

public class SinhVienIT extends SinhVienFpt{
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}

	@Override
	public double getDiem() {
		return (2 * diemJava + diemCss + diemHtml) / 4;
	}
	
	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.err.println("Điểm Java: " + diemJava);
		System.err.println("Điểm Css: " + diemCss);
		System.err.println("Điểm Html: " + diemHtml);
		super.show();
	}
}