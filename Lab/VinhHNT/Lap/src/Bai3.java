import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int canh, theTich;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Canh:");
		canh = scanner.nextInt();
		theTich = canh * canh * canh;
		System.out.print("the tich lap phuong : " + theTich);
	}
}
