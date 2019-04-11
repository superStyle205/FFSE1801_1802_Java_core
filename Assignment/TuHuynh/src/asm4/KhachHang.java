package asm4;

public class KhachHang {
	private String hoTen;
	private int soNha;
	public KhachHang(String hoTen, int soNha, int code) {
//		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.code = code;
	}
	private int code;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
