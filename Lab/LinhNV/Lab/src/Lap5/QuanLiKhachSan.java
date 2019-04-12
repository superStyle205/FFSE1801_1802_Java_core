package Lap5;

import java.util.Scanner;
import java.util.ArrayList;
public class QuanLiKhachSan
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachSan> listKhachHang = new ArrayList<KhachSan>();
		int n;

		System.out.print("Số lượng khách trọ : ");
		n=sc.nextInt();

		listKhachHang = new ArrayList<KhachSan>(n);
		KhachSan b;
		for(int i=0; i<n; i++)
		{
			b = new KhachSan();
			b.nhapThongTin();
			listKhachHang.add(b);
		}
		System.out.println("Danh khách khách trọ : ");
		for(int i = 0; i < listKhachHang.size(); i++) {
			listKhachHang.get(i).hienThongTin();
		}
		System.out.print("Nhập CMND: ");
		String tim = sc.nextLine();
		for(int i = 0; i < listKhachHang.size(); i++) {
			if(listKhachHang.get(i).getKhach().getSoCMND().equals(tim))
				System.out.println("Tiền thanh toán : " + listKhachHang.get(i).thanhTien());
		}
	}
}

