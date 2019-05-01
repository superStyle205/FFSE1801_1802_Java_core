package Lap5;

import java.util.Scanner;
import java.util.Date;

public class KhachSan {
	private int soNgayTro;
	private String loaiPhong;
	private double giaPhong;
	ConNguoi conNguoi;
	private Scanner sc = new Scanner(System.in);
	
	public int getSoNgayTro() {
		return soNgayTro;
	}

	public void setSoNgayTro(int soNgaytro) {
		this.soNgayTro = soNgayTro;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public double getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}

	public ConNguoi getconNguoi() {
		return conNguoi;
	}

	public void setConNguoi(ConNguoi conconNguoi) {
		this.conNguoi = conNguoi;
	}

	public KhachSan() {

	}

	public KhachSan(int soNgaytro, String loaiPhong, double giaPhong, ConNguoi conNguoi) {
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.conNguoi = conNguoi;
	}

	public void nhapThongTin() {
		conNguoi = new ConNguoi();
		this.conNguoi.nhapThongTin();
		System.out.print("Nhập số ngày trọ ");
		setSoNgayTro(sc.nextInt());
		System.out.print("Nhập loại phòng : ");
		setLoaiPhong(sc.nextLine());
		System.out.print("Nhập giá phòng : ");
		setGiaPhong(sc.nextDouble());
	}

	public void hienThongTin() {
		conNguoi.hienThiThongTin();
		System.out.println("Số ngày trọ " + getSoNgayTro());
		System.out.println("Loại phòng : " + getLoaiPhong());
		System.out.println("Gía phòng " + getGiaPhong());
	}

	public double thanhTien() {
		return getSoNgayTro() * getGiaPhong();
	}

	public ConNguoi getKhach() {
		return this.conNguoi;
	}

	public void xoa() {
		this.conNguoi = new ConNguoi();// xoa thong tin ve conNguoi
		this.soNgayTro = 0;
		this.loaiPhong = null;
		this.giaPhong = 0;
	}

}
