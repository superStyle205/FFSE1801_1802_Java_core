package Bai2_3;

public abstract class SinhVienFpt {
	private String hoTen;
	private String nganh;

	public SinhVienFpt() {

	}

	public SinhVienFpt(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public abstract double getDiem();

	public String getHocLuc(double diem) {
		if (diem < 5) {
			return "Yếu";
		} else if (diem >= 5 && diem < 6.5) {
			return "Trung Bình";
		} else if (diem >= 6.5 && diem < 7.5) {
			return "Khá";
		} else if (diem >= 7.5 && diem < 9) {
			return "Giỏi";
		} else {
			return "Xuất sắc";
		}
	}

	public void xuat() {
		System.out.print("Họ tên: ");
		System.out.println(hoTen);
		System.out.print("Ngành: ");
		System.out.println(nganh);
		System.out.print("Điểm: ");
		System.out.println(getDiem());
		System.out.print("Học lực: ");
		System.out.println(getHocLuc(getDiem()));
	}
}
