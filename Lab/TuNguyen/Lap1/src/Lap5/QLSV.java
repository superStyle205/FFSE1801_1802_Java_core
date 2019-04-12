package Lap5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class QLSV extends SV{


	public QLSV() {

	}

	//	public QLSV(int id, String ten, int tuoi, String diaChi, double diem) {
	//		super(id, ten, tuoi, diaChi, diem);
	//	}
	//	
	//	public int size = 0;
	//	public QLSV a[] = new QLSV[100];

	ArrayList<SV> List = new ArrayList();
	Scanner scan = new Scanner(System.in);

	//// Nhap danh sach sinh vien:

	public void nhapSV() {
		SV sv =new SV();

		System.out.println("Nhap Id: ");
		int id = Integer.parseInt(scan.nextLine());

		System.out.println("Nhap ten:");
		String ten = new Scanner(System.in).nextLine();

		System.out.println("Nhap tuoi:");
		int tuoi = Integer.parseInt(scan.nextLine());

		System.out.println("Nhap dia chi:");
		String diaChi = new Scanner(System.in).nextLine();

		System.out.println("Nhap diem:");
		double diem = Double.parseDouble(scan.nextLine());
		
		sv.setId(id);
		sv.setTen(ten);
		sv.setTuoi(tuoi);
		sv.setDiaChi(diaChi);
		sv.setDiem(diem);
		List.add(sv);
	}

	//// xuat thong tin danh sach sinh vien:

	public void xuatSV() {

		for(int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).toString());
		}
	}

	/// Xuat danh sach sinh vien co hoc luc gioi

	public void xuatSVG() {
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getDiem() > 8) {
				System.out.println(List.get(i).toString());

			} 
		}
	}

	/// sap xep danh sach sinh vien theo diem:

	public void sapXepSVV() {
		SV sv;
		for (int i = 0; i < List.size() - 1; i++) {
			for (int j = 0; j < List.size() - 1 - i; j++) {
				if (List.get(j).getDiem() > List.get(j + 1).getDiem()) {
				sv = List.get(j);
				List.set(j, List.get(j + 1));
				List.set(j + 1, sv);
				}
			}
		}
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).toString());
		}
	}
}
