package Lab4_Bai2;

abstract public class SinhVienFpt {
	private String hoTen;
	private String nganh;	
	
	public SinhVienFpt(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	abstract public double getDiem();
	
	public String getHocLuc() {
		if (getDiem() >=0 && getDiem() <= 10) {
			if (getDiem() < 5.0) {
				return "Yếu";
			} else if (getDiem() < 6.5) {
				return "Trung bình";
			} else if (getDiem() < 7.5) {
				return "Khá";
			} else if (getDiem() < 9) {
				return "Giỏi";
			} else {
				return "Xuất sắc";
			}
		} else {
			return "Nhập lại điểm!";
		}
	}
	
	public void xuat() {
		System.err.println("Họ tên: " + hoTen);
		System.err.println("Ngành: " + nganh);
	}
	
	public void show() {
		System.err.println("Điểm trung bình: " + getDiem());
		System.err.println("Học lực: "+ getHocLuc());
	}
}
