
public class BienLai {
	private double chiSoCu;
	private double chiSoMoi;
	
	public double getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(double chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public double getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(double chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	
	public double getSoTienPhaiTra() {
		return (chiSoMoi - chiSoCu) * 750;
	}
}
