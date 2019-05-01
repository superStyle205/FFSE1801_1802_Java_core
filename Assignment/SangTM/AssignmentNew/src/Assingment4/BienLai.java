package Assingment4;

public class BienLai {
	private int chiSoCu;
	private int chiSoMoi;
	private double tienPhaiTra;

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

	public double getTienPhaiTra() {
		return (chiSoMoi - chiSoCu) * 750;
	}

	public void setTienPhaiTra(double tienPhaiTra) {
		this.tienPhaiTra = tienPhaiTra;
	}	
}
