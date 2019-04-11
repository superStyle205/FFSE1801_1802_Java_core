package Lab3;
import java.util.Scanner;
public class NhapChuNhat {
	int dai,rong,cao;
	public void input() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập chiều dài");
		dai = nhap.nextInt();
		
		System.out.println("Nhập chiều rộng");
		rong = nhap.nextInt();
		
		System.out.println("Nhập chiều cao");
		cao = nhap.nextInt();
	}

	int ChuVi(){
		return (dai + rong)*2;
	}
	int DienTich(){
		return (dai * rong);
	}
	int TheTich(){
		return (dai * rong * cao);
	}
	int BanNhat(){
		return (dai * rong)*1/2;
	}

	public static void main(String[] args) {

		NhapChuNhat cn = new NhapChuNhat();
		cn.input();

		System.out.println("Chiều dài là " + cn.dai);
		System.out.println("Chiều rộng là " + cn.rong);
		System.out.println("Chiều cao là " + cn.cao);
		
		System.out.println("Chu vi là " + cn.ChuVi());
		System.out.println("Diện tích là " + cn.DienTich());
		
		System.out.println("Thể tích là " + cn.TheTich());
		System.out.println("Một diện tích một nữa là " + cn.BanNhat());

	}
}
