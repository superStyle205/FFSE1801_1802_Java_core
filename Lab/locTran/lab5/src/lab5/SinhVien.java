package lab5;

public class SinhVien {
	private String ten;
	private int tuoi;
	private int id;
	private String DiaChi;
	private double diem;
	
	public SinhVien() {
		super();
	}

	public SinhVien(String ten, int tuoi, int id, String diaChi, double diem) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.id = id;
		DiaChi = diaChi;
		this.diem = diem;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	public void xuat() {
		System.out.println("id " + getId() + "\n" 
						 + "Tên " + getTen() + "\n"
						 + "Tuổi " + getTuoi() + "\n"
						 + "địa Chỉ " + getDiaChi() + "\n"
						 + "Điểm " + getDiem() + "\n");
	}
}
