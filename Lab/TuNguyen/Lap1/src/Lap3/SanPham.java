package Lap3;
import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	private double thue;
	
	public SanPham() {}
	
	public SanPham(String tenSP, double donGia, double giamGia, double thue) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia =giamGia;
		this.thue = thue;
	}
	
	public String toString() {
		String sp = "San Pham:" + tenSP + "\n" + "Don Gia:" + donGia + "\n" + "Giam Gia:" + giamGia + "\n" + "Thue:" + thue;
		return sp;
	}
	
		public void setSP(String tenSP) {
			this.tenSP = tenSP;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}
		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}
		public void setThue(double thue) {
			this.thue = thue;
		}
		
		public String getSP() {
			return this.tenSP;
		}
		public double getDonGia() {
			return this.donGia;
		}
		public double getGiamGia() {
			return this.giamGia;
		}
		public double getthue() {
			return this.thue;
		}
		
		Scanner scan = new Scanner(System.in);
		
		
	}
