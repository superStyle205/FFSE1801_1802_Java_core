package Bai3va4;
 
public class SinhVienIT extends SinhVienFpt{
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	@Override
	public double getDiem() {
		return(2 * diemJava + diemCss + diemHtml) / 4;
	}
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	
}