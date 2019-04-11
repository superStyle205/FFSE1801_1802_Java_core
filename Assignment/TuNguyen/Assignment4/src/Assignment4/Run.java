package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Run extends BienLai{
	
	ArrayList<BienLai> BL = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	public void NhapKH() {
		
		BienLai bl =new BienLai();
		
		System.out.println("Nhap ten:");
		String ten = scan.nextLine();
		System.out.println("Địa chỉ nhà:");
		String diaChi = scan.nextLine();
		System.out.println("Mã công tơ:");
		String ma = scan.nextLine();
		System.out.println("Chỉ số cũ:");
		int cu = Integer.parseInt(scan.nextLine());
		System.out.println("Chỉ số mới:");
		int moi = Integer.parseInt(scan.nextLine());
		
		bl.setTen(ten);
		bl.setSoNha(diaChi);
		bl.setMaCongTo(ma);
		bl.setChiSoCu(cu);
		bl.setChiSoMoi(moi);
		BL.add(bl);
		
	}
	
	public void in() {
		for (int i = 0; i < BL.size(); i++) {
			System.out.println(BL.get(i).toString());
		}
	}
}
