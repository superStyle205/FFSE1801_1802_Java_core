package Lab4_Bai1;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public HinhChuNhat() {
		
	}
	
	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public int getChuVi() {
		return (chieuDai + chieuDai) * 2;
	}
	
	public int getDienTich() {
		return chieuDai * chieuRong;
	}
	
	public void xuat() {
		System.err.println("~~~~~ Hình chữ nhật ~~~~~");
		System.err.println("Chiều dài: " + chieuDai);
		System.err.println("Chiều rộng: " + chieuRong);
		System.err.println("Chu vi: " + getChuVi());
		System.err.println("Diện tích: " + getDienTich());
	}
}
