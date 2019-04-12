package quanLiTienDien.copy;
import java.util.Scanner;
public class BienLai extends KhachHang {
	private int chiSoCu;
	private int chiSoMoi;
	public BienLai(String hoTen, String soNha, String maSoCongToDien,int chiSoCu ,int chiSoMoi) {
		super(hoTen,soNha, maSoCongToDien );
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	
	public int getChiSoCu() {
		return chiSoCu;
	}

	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}

	public int getChiSoMoi() {
		return chiSoMoi;
	}

	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}

	public double thanhToan() {
	return (chiSoMoi - chiSoCu) * 750;
	}
	@Override
	public void xuat() {
		double tien = thanhToan();
		super.xuat();
		System.out.println("chỉ số củ:  "+chiSoCu);
		System.out.println("chỉ số mới: "+chiSoMoi);
		System.out.println("S�? TIỀN CẦN THANH TO�?N:  "+ tien);
		System.out.println("-----------------------------");
	}
}
