package lab4.bai2;

public class ChuNhat {
	private double chieuDai;
	private double chieuRong;

	public ChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public double getChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

	public double getDienTich() {
		return chieuDai * chieuRong;
	}

	public void xuat() {
		System.out.println("Hinh chu nhat:");
		System.out.println("Chieu dai : " + chieuDai);
		System.out.println("Chieu rong : " + chieuRong);
		System.out.println("Dien tich : " + getDienTich());
		System.out.println("chu vi : " + getChuVi());
	}
	
	public double getChieuDai() {
		return chieuDai;
	}
}
