package lap1;
import java.util.Scanner;
public class lap2 {
	public static void main(String[] args) {
		int dai,rong, chuVi ,dienTich,canhNN;
		Scanner scanner = new Scanner(System.in);
		System.out.print("chieu rong");
		rong = scanner.nextInt();
		System.out.print("chieu dai");
		dai = scanner.nextInt();
		chuVi = (dai + rong)*2;
		dienTich = dai*rong;
		canhNN = Math.min(dai, rong);
		System.out.printf("%d %d  %d" ,chuVi,dienTich ,canhNN);
	
	}
}
