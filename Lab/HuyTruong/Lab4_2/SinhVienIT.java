package assignment42;

public class SinhVienIT extends SinhVienFPT{
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	
	public SinhVienIT() {
		
	}
	public SinhVienIT(double diemJava, double diemCss, double diemHtml) {
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	public double getDiemJava() {
		return diemJava;
	}
	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}
	public double getDiemCss() {
		return diemCss;
	}
	public void setDiemCss(double diemCss) {
		this.diemCss = diemCss;
	}
	public double getDiemHtml() {
		return diemHtml;
	}
	public void setDiemHtml(double diemHtml) {
		this.diemHtml = diemHtml;
	}
	@Override
	public double getDiem() {
		return (2*diemJava + diemHtml + diemCss) / 4;
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Điểm Java: " +getDiemJava());
		System.out.println("Điểm Css: " + getDiemCss());
		System.out.println("Điểm HTML: " + getDiemHtml());
		System.out.println("Xếp loại: " + getDiem());
	}
	
}
