
	
public class bienLai {
	 String maCongTo;
     double chiSoCu;
     double chiSoMoi;
	public String getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(String maCongTo) {
		this.maCongTo = maCongTo;
	}
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
	   double getTienDienTra() {
	         return (chiSoMoi - chiSoCu) * 750;
	     }
}