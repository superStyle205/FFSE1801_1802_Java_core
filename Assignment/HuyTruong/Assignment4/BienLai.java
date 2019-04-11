package Assignment4;

public class BienLai {
	private double chiSoCu;
	private double chiSoMoi;
	private double cost;
	
	public BienLai() {
		//
	}
	
	public BienLai(double chiSoCu, double chiSoMoi, double cost) {
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
