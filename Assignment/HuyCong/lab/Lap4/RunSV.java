package Lap4;
import java.util.ArrayList;
import java.util.Scanner;



public class RunSV {
	
	// Bai 2:
	public static void main(String[] args) {
		
		ArrayList SV = new ArrayList();
		
		DiemSV sv = new DiemSV();
		
		System.out.println("Nhap ten:");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Nhap nganh:");
		String nganh = new Scanner(System.in).nextLine();
		System.out.println("Nhap Diem:");
		double diem = new Scanner(System.in).nextDouble();
		
		sv.setHoTen(name);
		sv.setNganh(nganh);
		sv.setDiem(diem);
		
		SV.add(sv);
		sv.xuat();
	
		
	// Bai 3:
		
		SVJava svjv = new SVJava();
		
		System.out.println("Nhap ten:");
		String nameIT = new Scanner(System.in).nextLine();
		System.out.println("Diem Java:");
		double java = new Scanner(System.in).nextDouble();
		System.out.println("Diem html:");
		double html = new Scanner(System.in).nextDouble();
		System.out.println("Diem css:");
		double css = new Scanner(System.in).nextDouble();
		
		svjv.setHoTen(nameIT);
		svjv.setJava(java);
		svjv.setHtml(html);
		svjv.setCss(css);
		
		SV.add(svjv);
		svjv.xuat1();
		
		
		
		SVBiz svb = new SVBiz();
		
		System.out.println("Nhap ten:");
		String nameBiz = new Scanner(System.in).nextLine();
		System.out.println("Diem Marketting:");
		double mkt = new Scanner(System.in).nextDouble();
		System.out.println("Diem Sales:");
		double sl = new Scanner(System.in).nextDouble();
		
		svb.setHoTen(nameBiz);
		svb.setMarketting(mkt);
		svb.setSales(sl);
		SV.add(svb);
		svb.xuat1();
	}
	
	
	
	
	

//	public int size = 0;
//	public RunSV a[] = new RunSV[100];
//	Scanner scan = new Scanner(System.in);
//	public void menu() {
//		while (true) {
//			System.out.println(""
//					+ "/// BAI 2: \n"
//					+ "1. Diem Sinh Vien \n"
//					+ "/// BAI 3: \n"
//					+ "2. Diem Sinh Vien Java \n"
//					+ "3. Diem Sinh Vien Biz \n"
//					+ "4. Thoat.");
//			int n = Integer.parseInt(scan.nextLine());
//			switch (n) {
//				case 1:
//					SV();
//					break;
//				case 2:
//					SVJV();
//					break;
//				case 3:
//					SVB();
//					break;
//				case 4:
//					System.err.println("THANKS");
//					System.exit(0);
//					break;
//		
//				default:
//					break;
//			}
//		}
//}
//	
//	
//	// Bai 2:
//	
//		public void SV() {
//		System.out.println("Nhap ten:");
//		String name = new Scanner(System.in).nextLine();
//		System.out.println("Nhap nganh:");
//		String nganh = new Scanner(System.in).nextLine();
//		System.out.println("Nhap Diem:");
//		double diem = new Scanner(System.in).nextDouble();
//		SVFPT SV = new DiemSV(name, nganh, diem);
//		SV.xuat();
//		}
//	
//		
//	// Bai 3:
//		
//		public void SVJV() {
//		System.out.println("Nhap ten:");
//		String nameIT = new Scanner(System.in).nextLine();
//		System.out.println("Diem Java:");
//		double java = new Scanner(System.in).nextDouble();
//		System.out.println("Diem html:");
//		double html = new Scanner(System.in).nextDouble();
//		System.out.println("Diem css:");
//		double css = new Scanner(System.in).nextDouble();
//		SVJava SVJV = new SVJava(nameIT, "", java, html, css);
//		SVJV.xuat();
//		}
//		
//		public void SVB() {
//		System.out.println("Nhap ten:");
//		String nameBiz = new Scanner(System.in).nextLine();
//		System.out.println("Diem Marketting:");
//		double mkt = new Scanner(System.in).nextDouble();
//		System.out.println("Diem Sales:");
//		double sl = new Scanner(System.in).nextDouble();
//		SVBiz SVB = new SVBiz(nameBiz, "", mkt, sl);
//		SVB.xuat();
//		}
//		
//		public static void main(String[] args) {
//			RunSV run = new RunSV();
//			run.menu();
//		}
	
}
