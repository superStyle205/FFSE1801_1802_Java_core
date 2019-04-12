package asm5;
abstract public class CanBo {

	private String hoTen;
	private int heSoLuong;
	public CanBo() {}
	public CanBo(String hoTen, int heSoLuong) {
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	/**
	 * 
	 * @param hoTen
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getHeSoLuong() {
		return this.heSoLuong;
	}

	/**
	 * 
	 * @param heSoLuong
	 */
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	/**
	 * 
	 * @param CanBo
	 */
	abstract public int tinhLuong();

}