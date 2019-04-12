import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Moi ban nhap chieu dai : ");
		int dai = sc.nextInt();

		System.out.print("Moi ban nhap chieu rong :");
		int rong = sc.nextInt();
		double CV = (dai + rong) * 2;
		double DT = dai * rong;
		System.out.printf("Chu vi la:" + CV + "Dien tich la" + DT);
	}
}
