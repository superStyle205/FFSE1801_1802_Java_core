package Lab4;

public class SinhVienIT {
	public double diemJava;
	public double diemCss;
	
	public double getDiemTB() {
		return (diemJava * 2 + diemCss) / 3;
	}

	public SinhVienIT(double diemJava, double diemCss) {
		this.diemJava = diemJava;
		this.diemCss = diemCss;
	}
}
