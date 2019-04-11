package Lap4;

public class SV {

	private int id;
	private String ten;
	private int tuoi;
	private String diaChi;
	private double diem;
	
	public SV() {
		
	}

	public SV(int id, String ten, int tuoi, String diaChi, double diem) {
		
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.diem = diem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	public String toString() {
		return "id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", diem=" + diem;
		
	}
	

	

}
