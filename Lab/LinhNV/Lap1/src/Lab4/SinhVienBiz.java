package Lab4;

public class SinhVienBiz {
	public double diemMarketting;
	public double diemKeToan;
	public double diemBanHang;
	
	public double getDiemTB() {
		return (diemMarketting + diemBanHang + diemKeToan) / 3;
	}

	public SinhVienBiz(double diemMarketting, double diemKeToan, double diemBanHang) {
		this.diemMarketting = diemMarketting;
		this.diemKeToan = diemKeToan;
		this.diemBanHang = diemBanHang;
	}
	
	
}
