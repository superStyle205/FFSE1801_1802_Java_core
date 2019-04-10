package BenhVien;
import java.util.*;

public class BacSi extends ConNguoi{	
	private String khoa;
	private double luong;
	private double phuCap;

	public String getKhoa(){
		return khoa;
	}
	public double getLuong(){
		return luong;
	}
	public double getPhuCap(){
		return phuCap;
	}
	public void setKhoa(){
		System.out.println("Nhap ten khoa");
		this.khoa=scanner.nextLine();
	}
	public void setLuong(){
		System.out.println("Nhap tien luong");
		this.luong=Double.parseDouble(scanner.nextLine());
	}
	public void setPhuCap(){
		System.out.println("Nhap tien phu cap");
		this.phuCap=Double.parseDouble(scanner.nextLine());
	}
	public BacSi(){
		super();
		setKhoa();
		setLuong();
		setPhuCap();
	}
	public BacSi(String ten, int tuoi, String ID, String khoa, double luong, double phuCap){
		super(ten, tuoi, ID);
		this.khoa=khoa;
		this.luong=luong;
		this.phuCap=phuCap;
	}
	public void hienThiHoSoBS(){
		System.out.println("Ten bac si: "+this.getTen());
		System.out.println("Tuoi benh nhan: "+this.getTuoi());
		System.out.println("Ma bac si: "+this.getID());
		System.out.println("Khoa lam viec: "+this.getKhoa());
		System.out.println("Tien luong: "+this.getLuong());
		System.out.println("Tien phu cap: "+this.getPhuCap());
	}
}