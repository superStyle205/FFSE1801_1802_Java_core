
public class Person {
	private String ten;
	private double heSoLuong;
	private int id;

	public Person(String ten, double heSoLuong, int id) {
		super();
		this.ten = ten;
		this.heSoLuong = heSoLuong;
		this.id = id;
	}

	public double getPhuCap() {
		return 0;
	}

	public double getLuong() {
		return 0;
	}

	public Person() {
		super();
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

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void xuat() {
		System.out.println("Tên \t\t: " + getId());
		System.out.println("Tên \t\t: " + getTen());
		System.out.println("Hệ số lương \t: " + getHeSoLuong());
		System.out.println("Phụ cấp \t: " + getPhuCap());
	}
}
