package BenhVien;
import java.util.*;

public class BenhNhan extends ConNguoi{	
	private String ngayNhap;
	private String benh;
	private double tienTT;

	public String getNgayNhap(){
		return ngayNhap;
	}
	public String getBenh(){
		return benh;
	}
	public double getTienTT(){
		return tienTT;
	}
	public void setNgayNhap(){
		System.out.println("Nhap ngay nhap vien");
		this.ngayNhap=scanner.nextLine();
	}
	public void setBenh(){
		System.out.println("Nhap ten benh");
		this.benh=scanner.nextLine();
	}
	public void setTienTT(){
		System.out.println("Nhap tien vien phi");
		this.tienTT=Double.parseDouble(scanner.nextLine());
	}
	public BenhNhan(){
		super();
		setNgayNhap();
		setBenh();
		setTienTT();
	}
	public BenhNhan(String ten, int tuoi, String ID, String ngayNhap, String benh, double tienTT){
		super(ten, tuoi, ID);
		this.ngayNhap=ngayNhap;
		this.benh=benh;
		this.tienTT=tienTT;
	}
	public void hienThiHoSoBN(){
		System.out.println("Ten benh nhan: "+this.getTen());
		System.out.println("Tuoi benh nhan: "+this.getTuoi());
		System.out.println("Ma benh nhan: "+this.getID());
		System.out.println("Ngay nhap vien: "+this.getNgayNhap());
		System.out.println("Bi benh: "+this.getBenh());
		System.out.println("Tien vien phi: "+this.getTienTT());
		System.out.println();
	}
}