import java.util.Scanner;

public class Bai4 {
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- GIẢI PHƯƠNG TRÌNH BẬC 1 ---");
		System.out.println("Nhập hệ số a:");
		double heSoA = scanner.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB = scanner.nextDouble();
		System.out.printf("Ta có phương trình bậc nhất %.2fx + %.2f = 0 là:%n",heSoA,heSoB);
		if(heSoA == 0) {
			if(heSoB == 0) {
				System.out.println("Phương trình vô số nghiệm!");
			}else {
				System.out.println("Phương trình vô nghiệm!");
			}
		}else {
			double nghiem = (-heSoB)/heSoA;
			System.out.printf("Phương trình có nghiệm x = %.2f%n",nghiem);
		}
	}
	public static void giaiPTB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- GIẢI PHƯƠNG TRÌNH BẬC 2 ---");
		System.out.println("Nhập hệ số a:");
		double heSoA = scanner.nextDouble();
		System.out.println("Nhập hệ số b:");
		double heSoB = scanner.nextDouble();
		System.out.println("Nhập hệ số c:");
		double heSoC = scanner.nextDouble();
		if(heSoA == 0) {
			if(heSoA == 0) {
				if(heSoB == 0) {
					System.out.println("Phương trình vô số nghiệm!");
				}else {
					System.out.println("Phương trình vô nghiệm!");
				}
			}else {
				double nghiem = (-heSoB)/heSoA;
				System.out.printf("Phương trình có nghiệm x = %.2f",nghiem);
			}
		}else {
			double delta = Math.pow(heSoB,2)-4*heSoA*heSoC;
			if(delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			}else if(delta == 0) {
				double nghiem = (-heSoB)/(2*heSoA);
				System.out.printf("Phương trình có 1 nghiệm kép x = %.2f",nghiem);
			}else {
				double nghiem1 = (-heSoB + Math.sqrt(delta))/(2*heSoA);
				double nghiem2 = (-heSoB - Math.sqrt(delta))/(2*heSoA);
				System.out.printf("Phương trình có 2 nghiệm phân biệt%nNghiệm x1 = %.2f%nNghiệm x2 = %.2f%n",nghiem1,nghiem2);
			}
		}
	}
	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- TÍNH TIỀN ĐIỆN ---");
		System.out.println("Nhập số điện sử dụng:");
		int soDien = scanner.nextInt();
		int tien;
		if(soDien <= 50) {
			tien = soDien * 1000;
		}else {
			tien = 50 * 1000 + (soDien - 50)*1200;
		}
		System.out.println("Số tiền điện dùng tháng này là: "+tien+"đ");
	}
	public static void chucNang() {
		System.out.println("+-------------------------------+\n" + 
				"| 1.Giải phương trình bậc nhất  |\n" +  
				"| 2.Giải phương trình bậc 2     |\n" + 
				"| 3.Tính tiền điện              |\n" + 
				"| 4.Kết thúc                    |\n" + 
				"+-------------------------------+\n" +
				"Chọn chức năng:");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		chucNang();
		int soNhap;
		while(true) {
			soNhap = scanner.nextInt();
			while(soNhap < 1 || soNhap > 4) {
				System.out.println("Lỗi! Vui lòng chọn lại chức năng:");
				soNhap = scanner.nextInt();
			}
			if(soNhap == 4) {
				break;
			}else {
				switch(soNhap) {
				case 1:
					giaiPTB1();
					System.out.println();
					chucNang();
					break;
				case 2:
					giaiPTB2();
					System.out.println();
					chucNang();
					break;
				case 3:
					tinhTienDien();
					System.out.println();
					chucNang();
					break;
				default:
					break;
				}
			}
		}
	}
}
