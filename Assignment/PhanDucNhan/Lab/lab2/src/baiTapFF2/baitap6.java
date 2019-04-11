package baiTapFF2;

import java.util.Scanner;

public class baitap6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float diem[] = new float[2];
		String ten[] = new String[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap nguoi thu "+i);
			System.out.print("Moi ban nhap ten");
			String t = new Scanner(System.in).nextLine();
			ten[i] = t;
			System.out.print("Moi ban nhap diem");
			float d = sc.nextInt();
			diem[i] = d;
		}
		/*float max = diem[0];
		for (int i = 0; i < 2 - 1; i++) {
			for (int j = i+1; j <= 2 - 1; j++) {
				if (diem[j] < diem[i]) {
					max = diem[i];
					diem[i] = diem[j];
					diem[j] = max;
				}
			}
		}*/

		for (int i = 0; i < diem.length; i++) {
			if (diem[i] >= 0.0 && diem[i] <= 10.0) {
				System.err.println("Họ tên sinh viên : " + ten[i] );
				System.err.println("Điểm của sinh viên : " + diem[i] );
				if (diem[i] < 5.0) {
					String hocLuc = "Trung Binh";
					System.err.println("Xếp loại : " + hocLuc );
				} else if (diem[i] <= 6.5) {
					String hocLuc = "Con người";
					System.err.println("Xếp loại : " + hocLuc );
				} else if (diem[i] <= 7.5) {
					String hocLuc = "Thần đồng";
					System.err.println("Xếp loại : " + hocLuc );
				} else if (diem[i] <= 9.0) {
					String hocLuc = "Phật tổ như lai";
					System.err.println("Xếp loại : " + hocLuc );
				} else {
					String hocLuc = "Người ngoài hành tinh -- Về với hành tinh của người ";
					System.err.println("Xếp loại : " + hocLuc );
				}
			} else {
				System.err.println("Vui lòng nhập lại!" );
			}

		}
		/*for (int i = 0; i < diem.length; i++) {
			System.out.println("SV"+i+" TEN: "+ten[i]+" DIEM:"+diem[i]);
		}*/
		//System.out.println("SV"+i+" TEN: "+ten[i]+" DIEM:"+diem[i]);
	}

}
