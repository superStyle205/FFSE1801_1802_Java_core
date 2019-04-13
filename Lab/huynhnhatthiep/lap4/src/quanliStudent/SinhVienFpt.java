package quanliStudent;

abstract public class SinhVienFpt {

	private String hoTen;
	private String nganh;
	abstract public double getDiem();

	public SinhVienFpt(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	

	public String getHocLuc() {
		double diemTb = getDiem();
		if (diemTb < 5) {
			return "yeu";
		} else if (diemTb >= 5 && diemTb < 6.5) {
			return "trung binh";
		} else if (diemTb >= 6.5 && diemTb < 7.5) {
			return "kha";
		} else if (diemTb >= 7.5 && diemTb < 9) {
			return "gioi";
		} else {
			return "xuat sac";
		}
	}

	public void xuat() {
		System.out.println("Sinh Vien : " + hoTen);
		System.out.println("Nganh : " + nganh);
		System.out.println("Diem trung binh : " + getDiem());
		System.out.println("Hoc luc : " + getHocLuc());
	}
}
