import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int rong, dai, chuVi, dienTich, canhNN;
		Scanner scanner = new Scanner(System.in);
		System.out.print("chieu rong:");
		rong = scanner.nextInt();
		System.out.print("chieu dai:");
		dai = scanner.nextInt();
		chuVi = (dai + rong) * 2;
		dienTich = (dai * rong);
		canhNN = Math.min(dai, rong);
		System.out.println("chu vi =" + chuVi);
		System.out.println("dien tich =" + dienTich);
		System.out.print("canh nho nhat =" + canhNN);
	}
}
