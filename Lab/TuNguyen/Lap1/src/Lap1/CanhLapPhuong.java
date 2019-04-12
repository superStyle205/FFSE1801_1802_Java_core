package Lap1;
import java.util.Scanner;

public class CanhLapPhuong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Canh la:");
		int canh = scan.nextInt();
		System.out.println("The tich lap phuong la" + (canh * canh * canh) + "hoac" + (Math.pow(canh, 3)));
	}
}
