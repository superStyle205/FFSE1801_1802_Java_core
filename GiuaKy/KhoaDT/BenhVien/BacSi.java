package BenhVien;
import java.util.*;

public class BacSi extends ConNguoi{	
	private String khoa;
	private double luong;
	private double phuCap;

	public String getKhoa(){
		return this.khoa;
	}

	public double getLuong(){
		return this.luong;
	}

	public double getPhuCap(){
		return this.phuCap;
	}

	public void setKhoa(String khoa){
		this.khoa=khoa;
	}

	public void setLuong(double luong){
		this.luong=luong;
	}

	public void setPhuCap(double phuCap){
		this.phuCap=phuCap;
	}

	public BacSi(String ten, int tuoi, String ID, String khoa, double luong, double phuCap){
		super(ten, tuoi, ID);
        setKhoa(khoa);
        setLuong(luong);
        setPhuCap(phuCap);
	}

}