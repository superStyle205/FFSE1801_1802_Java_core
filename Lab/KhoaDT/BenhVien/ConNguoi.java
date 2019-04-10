package BenhVien;
import java.util.*;

public class ConNguoi{	
	private String ten;
	private int tuoi;
	private String ID;
	static Scanner scanner= new Scanner(System.in);
	

	public String getTen(){
		return this.ten;
	}
	public int getTuoi(){
		return this.tuoi;
	}
	public String getID(){
		return this.ID;
	}

	public void setTen(){
		System.out.println("Nhap ten");
		this.ten=scanner.nextLine();
	}
	public void setTuoi(){
		System.out.println("Nhap tuoi");
		this.tuoi=Integer.parseInt(scanner.nextLine());
	}
	public void setID(){
		System.out.println("Nhap ID");
		this.ID=scanner.nextLine();
	}
	public ConNguoi(){
		setTen();
		setTuoi();
		setID();
	}
	public ConNguoi(String ten, int tuoi, String ID){
		this.ten=ten;
		this.tuoi=tuoi;
		this.ID=ID;
	}
}

