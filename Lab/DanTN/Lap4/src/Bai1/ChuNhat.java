package Bai1;

import java.util.Scanner;

public class ChuNhat {
	public Scanner sc = new Scanner(System.in);
	protected double rong;
	protected double dai;

	public ChuNhat() {

	}

	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getDai() {
		return dai;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getRong() {
		return rong;
	}

	public double getChuVi() {
		return (this.dai + this.rong) * 2;
	}

	public double getDienTich() {
		return this.dai * this.rong;
	}

	public void nhap() {
		System.out.println("Nhập các cạnh của hình chữ nhật:");
		System.out.println("Nhập chiều dài:");
		dai = sc.nextDouble();
		System.out.println("Nhập chiều rộng:");
		rong = sc.nextDouble();
	}

	public void xuat() {
		System.out.printf("Hình chữ nhật kích thước %.1f x %.1f%nCó chu vi là %.1f%nVà diện tích là %.1f%n", dai, rong,
				getChuVi(), getDienTich());
	}
}
