package Lab4BaiTap;

abstract public class SinhVienFpt {
	abstract public double getDiem();
	private String hoTen;
	private String nganh;
	public SinhVienFpt() {
	}
	public SinhVienFpt(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public String getHocLuc() {
		if (getDiem() <= 10 && getDiem() >= 0) {
			if (getDiem() < 5) {
				return "Yếu";
			} else if (getDiem() < 6.5) {
				return "Trung Bình";
			} else if (getDiem() < 7.5) {
				return "Khá";
			} else if (getDiem() < 9) {
				return "Giỏi";
			} else {
				return "Xuất sắc";
			}
		} else {
			System.out.println("Điểm không hợp lệ");
		}
		return null;
	}
	public void xuat() {
		System.out.println("Tên " + hoTen);
		System.out.println("Ngành : " + nganh);
		System.out.println("Điểm TB " + getDiem());
		System.out.println("Học lực " + getHocLuc());
	}
}
