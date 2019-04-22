package asm6;

public class ConNguoi {
	
	private int id;
	private String name;
	private double heSoLuong;
	
	public double getPhuCap() {
		return 0;
		
	}
	public double getLuong() {
		return 0 ;
	}
	
	
	public ConNguoi() {
		
	}
	public ConNguoi(int id, String name, double heSoLuong) {
		super();
		this.id = id;
		this.name = name;
		this.heSoLuong = heSoLuong;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public void xuat() {
		System.out.println(" id : "+ id);
		System.out.println(" name : "+ name);
		System.out.println(" heSoLuong : "+ heSoLuong);
		
	}
	
	
}

	