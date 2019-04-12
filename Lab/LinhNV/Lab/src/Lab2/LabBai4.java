package Lab2;

import java.util.Scanner;

public class LabBai4 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------------------+");
		System.out.println("1.  Giải phương trình bậc nhất");
		System.out.println("2.  Giải phương trình bậc 2");
		System.out.println("3.  Tính tiền điện");
		System.out.println("4.  Kết thúc");
		System.out.println("+---------------------------------------------------+");


		System.out.println("Nhập giá trị bất kì từ 1 đến 4");
		Scanner scanner = new Scanner(System.in);
		int nhap = scanner.nextInt();
		switch (nhap) {
		case 1 : 
			
			System.out.println("Nhap he so a");
			double heSoA = scanner.nextDouble();
			System.out.println("Nhap he so b");
			double heSoB = scanner.nextDouble();
			if (heSoA  == 0) {
				if (heSoB == 0) {
					System.out.println("phương trình có vô sô nghiệm");
				} else {
					System.out.println("phương trình vô nghiệm");
				}
			} else {
				double x = (- heSoB) / heSoA;
				System.out.print("Phương trình có nghiệm là : x = " + x);
				
			}
			break ;
		case 2 : 
			
			System.out.println("Nhap he so a");
			double heSoAA = scanner.nextDouble();
			System.out.println("Nhap he so b");
			double heSoBB = scanner.nextDouble();
			System.out.println("Nhap he so c");
			double heSoCC = scanner.nextDouble();
			
			if (heSoAA == 0) {
				if (heSoBB  == 0) {
					if (heSoCC == 0) {
						System.out.println("phương trình có vô sô nghiệm");
					} else {
						System.out.println("phương trình vô nghiệm");
					}
				} else {
					double x = (- heSoCC) / heSoBB;
					System.out.print("Phương trình có nghiệm là : x = " + x);
					
				}
			} else {
				double Delta = (Math.pow(heSoBB,2)) - 4 * heSoAA * heSoCC;
				if (Delta < 0) {
					System.out.println("pt vô nghiệm");
				} else if (Delta == 0) {
					System.out.println("pt có nghiệm kép : " + (-heSoBB) / (2 * heSoAA));
				} else {
					System.out.println("pt có 2 nghiệm phân biệt : ");
					System.out.println("nghiệm x1 = " + (-heSoBB + Math.sqrt(Delta) / (2 * heSoAA)));
					System.out.println("nghiệm x2 = " + (-heSoBB - Math.sqrt(Delta) / (2 * heSoAA)));
				}
			}
			break ;
		case 3 : 
			
			System.out.print("Nhập giá điện đã sử tháng qua : ");
			int soDien =  scanner.nextInt();
			
			if (soDien < 50) {
				System.out.println("Số tiền điện phải trả tháng qua là : " + (soDien * 1000));
			} else {
				System.out.println("Số tiền điện phải trả tháng qua là : " + ((50 * 1000) + (soDien -50) * 1000));
			}
			break ;
		case 4 : System.exit(0); break ;
		default : System.out.println("Số vừa nhập không có trong danh sách");
		}	
	}
}
