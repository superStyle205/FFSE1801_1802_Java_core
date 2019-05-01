package asignment6;

public class CanBo {
	private String ten;
	private double heSoLuong;
	private String id;

	public double getPhuCap() {
		return 0;
	}

	public double getLuong() {
		return 0;
	}

	public CanBo() {
		super();
	}

	public CanBo(String ten, double heSoLuong, String id) {
		super();
		this.ten = ten;
		this.heSoLuong = heSoLuong;
		this.id = id;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void xuat() {
		System.out.println("Tên \t: " + getTen());
		System.out.println("hệ số lương \t: " + getHeSoLuong());
		System.out.println("Phụ cấp \t: " + getPhuCap());
	}
}
