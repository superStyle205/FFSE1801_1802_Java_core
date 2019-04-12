package Bai2;

abstract public class SinhVienFpt {
	private String hoTen;
	private String nganh;
	public SinhVienFpt(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	abstract public double getDiem(); 	
	
	public String getHocLuc() {
		if (0.0 < getDiem() && getDiem() <= 10.0) {
			if (getDiem() < 5) {
				return "Yeu";
			} else if (5 <= getDiem() && getDiem() <= 6.5) {
				return "Trau bo";
			} else if (6.5 <= getDiem() && getDiem() <= 7.5) {
				return "Kha";
			} else if (7.5 <= getDiem() && getDiem() <= 9) {
				return "Gioi";
			} else {
				return"Xuat sac";
			}
		} else {
			return "diem ban nhap ko co";
		}
	}
	public void xuat() {
		System.out.println("SV :" + hoTen);
		System.out.println("Nganh :" + nganh);
		System.out.println("diem :" + getDiem());
		System.out.println("hoc luc :" + getHocLuc());
	}
}
