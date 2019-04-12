package assignment4;

import java.util.Scanner;

public class BienLai{
	private int chiSoCu;
	private int chiSoMoi;
	
	public double tinhTienDien() {
		return (chiSoMoi - chiSoCu) * 750;
	}
	
	public BienLai() {
		
	}

	public BienLai(int chiSoCu, int chiSoMoi) {
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

	public void xuat() {
		System.out.println("Chỉ số cũ : " + chiSoCu);
		System.out.println("Chỉ số mới : " + chiSoMoi);
		System.out.println("Số tiền phải trả : " + tinhTienDien());
	}
}
