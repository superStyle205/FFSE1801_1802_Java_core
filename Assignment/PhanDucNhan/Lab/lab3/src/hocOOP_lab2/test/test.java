package hocOOP_lab2.test;

import java.io.InputStream;
import java.util.Scanner;

import hocOOP_lab2.model.cuaHang;

public class test {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		cuaHang sp1 = new cuaHang();
		cuaHang sp2 = new cuaHang();
		
		nhap(sp1);
		nhap(sp2);
		
		/*cuaHang ch1 = new cuaHang("Coca",5000,0);
		cuaHang ch2 = new cuaHang("Pepsi",7000,0);
		cuaHang ch3 = new cuaHang("Vinamilk",5000,0);*/
		
		cuaHang.cre(sp1,sp2);
	}
	
	public static void nhap(cuaHang arr) {
		System.out.println("===============");
		System.out.println("Mời bạn nhập tên sản phẩm  ");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Mời bạn nhập giá sản phẩm   ");
		double gia = sc.nextDouble();
		System.out.println("Mời bạn nhập giảm giá sản phẩm  ");
		double giamGia = sc.nextDouble();
		arr.setTen(ten);
		arr.setGia(gia);
		arr.setGiamGia(giamGia);
		System.out.println("===============");
	}


}
