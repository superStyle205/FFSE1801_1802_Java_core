package Lap5;
import java.util.Scanner;
import java.util.ArrayList;
public class Lap5Bai1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		boolean lapPt = true;
		do {
			System.out.println("Nhập người thứ " + (list.size() + 1));
			String j = sc1.nextLine();
			
			if (j.equals("100")) {
				lapPt = false;
				
			}else {
				list.add(j);
			}
		} while(lapPt);
		
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		if (list.size() != 0) {
			boolean lap = true;
			int soLap = sc.nextInt();
			do {
				switch (soLap) {
				case 1 : xuat(list);
					break;
				}
			} while (lap);
		}
	}
	
	public static void xuat(ArrayList<String> list) {
		for (int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	
}
