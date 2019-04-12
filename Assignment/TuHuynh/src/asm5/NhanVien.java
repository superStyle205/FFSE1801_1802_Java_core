package asm5;
public class NhanVien extends CanBo {

	private String phongBan;
	private int soNgayCong;
	private String chucVu;

	public NhanVien(String hoTen, int heSoLuong, String phongBan, int soNgayCong, String chucVu) {
		super(hoTen, heSoLuong);
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public String getPhongBan() {
		return this.phongBan;
	}

	/**
	 * 
	 * @param phongBan
	 */
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public int getSoNgayCong() {
		return this.soNgayCong;
	}

	/**
	 * 
	 * @param soNgayCong
	 */
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public String getChucVu() {
		return this.chucVu;
	}

	/**
	 * 
	 * @param chucVu
	 */
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public int tinhLuong() {
		int a;
		if (this.chucVu.equals("trưởng phòng")) {
			a = 2000;
		} else if (this.chucVu.equals("phó phòng")) {
			a = 1000;
		} else {
			a = 500;
		}

		return (this.getHeSoLuong() * 730 + a + this.soNgayCong * 30);
	}

}