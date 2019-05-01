package assignment4;
import java.util.Scanner;
public class KhachHang extends BienLai{
	private String hoTen;
	private String soNha;
	private int maCongTo;

	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public int getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(int maCongTo) {
		this.maCongTo = maCongTo;
	}
	
	public KhachHang() {
	}
	
	public KhachHang(String hoTen, String soNha, int maCongTo, int chiSoCu, int chiSoMoi) {
		super(chiSoCu, chiSoMoi);
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}
	public void xuat() {
		System.out.println("Họ tên khách hàng : " + hoTen);
		System.out.println("Số nhà : " + soNha);
		System.out.println("Mã công tơ : " + maCongTo);
		super.xuat();
	}
}
