package Lab3;
import java.util.Scanner;
public class NhapChuNhat {
	int dai,rong,cao;
	public void input() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập chi�?u dài");
		dai = nhap.nextInt();
		
		System.out.println("Nhập chi�?u rộng");
		rong = nhap.nextInt();
		
		System.out.println("Nhập chi�?u cao");
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

		System.out.println("Chi�?u dài là " + cn.dai);
		System.out.println("Chi�?u rộng là " + cn.rong);
		System.out.println("Chi�?u cao là " + cn.cao);
		
		System.out.println("Chu vi là " + cn.ChuVi());
		System.out.println("Diện tích là " + cn.DienTich());
		
		System.out.println("Thể tích là " + cn.TheTich());
		System.out.println("Một diện tích một nữa là " + cn.BanNhat());

	}
}
