package asm5;
public class GiangVien extends CanBo {

	private String khoa;
	private String trinhDo;
	private int soTietDay;
	public GiangVien() {}
	public GiangVien(String hoTen, int heSoLuong, String khoa, int soTietDay, String trinhDo) {
		super(hoTen, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}

	public String getKhoa() {
		return this.khoa;
	}

	/**
	 * 
	 * @param khoa
	 */
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return this.trinhDo;
	}

	/**
	 * 
	 * @param trinhDo
	 */
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getSoTietDay() {
		return this.soTietDay;
	}

	/**
	 * 
	 * @param soTietDay
	 */
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	@Override
	public int tinhLuong() {
		int a;
		if (this.trinhDo.equals("cử nhân")) {
			a = 300;
		} else if (this.trinhDo.equals("thạc sĩ")) {
			a = 500;
		} else {
			a = 700;
		}

		return (this.getHeSoLuong() * 730 + a + this.soTietDay * 45);
	}

}