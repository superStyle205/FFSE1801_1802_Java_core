import java.util.*;
public class HamGoi {
	Scanner sc= new Scanner(System.in);
	ArrayList<GiangVien> gv= new ArrayList<GiangVien>();
	ArrayList<NhanVien> nv= new ArrayList<NhanVien>();
	public void giaoDien() {
		while (true) {
		System.out.println("Cac chung nang");
		System.out.println("1 Nhap giang vien");
		System.out.println(" 2 Nhap nhan vien hanh chinh");
		System.out.println("3 Xuat danh sach giang vien va nhan vien");
		System.out.println("4 Tong luong phai tra");
		System.out.println("5 sap xep can bo theo luong");
		int roll = sc.nextInt();
		switch (roll) {
		case 1:
			themGiangVien();
			break;
		case 2:
			themNhanVien();
			break;
		case 3:
			xuatDanhSach();
			break;
		case 4:
			tongLuong();
			break;
		case 5:
			sapXepCanBo();
			break;
	
		}
	}}
	public void themGiangVien() {
		GiangVien gvx = new GiangVien();
	System.out.print("nhap ten");
	String a;
	a= sc.nextLine();
	a= sc.nextLine();
	gvx.setHoTen(a);
	System.out.print("nhap khoa");
	
	a= sc.nextLine();
	gvx.setKhoa(a);
System.out.print("nhap trinh do");
	
	a= sc.nextLine();
	gvx.setTrinhDo(a);
switch(gvx.getTrinhDo()) {
case "cu nhan" :
	gvx.setPhuCap(300);
	break;
case "thac si" :
	gvx.setPhuCap(500);
	break;
case "tien si" :
	gvx.setPhuCap(500);
	break;
}

System.out.print("nhap so tiet day trong thang");
	int x;
	x= sc.nextInt();
	gvx.setSoTietDay(x);
	System.out.print("nhap he so luong");
	double  y;
	y= sc.nextDouble();
	gvx.setHeSoLuong(y);
	gv.add(gvx);
	}
	public void themNhanVien() {
		NhanVien nvx = new NhanVien();
	System.out.println("nhap ten");
	String a;
	a= sc.nextLine();
	a= sc.nextLine();
	nvx.setHoTen(a);
	System.out.println("nhap phong ban");
	
	a= sc.nextLine();
	nvx.setPhongBan(a);
System.out.println("nhap chuc vu");
	
	a= sc.nextLine();
	nvx.setChucVu(a);
switch(nvx.getChucVu()) {
case "truong phong" :
	nvx.setPhuCap(2000);
	break;
case "pho phong" :
	nvx.setPhuCap(1000);
	break;
case "nhan vien" :
	nvx.setPhuCap(500);
	break;
}

System.out.print("nhap so ngay cong");
	int x;
	x= sc.nextInt();
	nvx.setSoNgayCong(x);
	System.out.print("nhap he so luong");
	double  y;
	y= sc.nextDouble();
	nvx.setHeSoLuong(y);
	nv.add(nvx);
	}
	public void tongLuong() {
		double luong=0 ;
		for(int i =0; i<gv.size();i++) {
			luong= luong +gv.get(i).heSoLuong*730+gv.get(i).phuCap+gv.get(i).soTietDay*45;

		}
		for(int j =0; j<nv.size();j++) {
			luong= luong+ nv.get(j).heSoLuong*730+nv.get(j).getPhuCap()+nv.get(j).soNgayCong*30;

		}
		System.out.println("Tong luong la"+ luong);
	}


	public void sapXepCanBo() {

	gv.sort(new Comparator<GiangVien>() {
		@Override
		public int compare(GiangVien o1, GiangVien o2) {
			if (o1.getLuong() == o2.getLuong()) {
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
			return o1.getLuong() > o2.getLuong() ? 1 : -1;
		}

	
	});
	}

	public void xuatDanhSach() {
		System.out.println("danh sach giang vien");
		for(int i=0; i<gv.size();i++){
			System.out.println("Ho ten"+gv.get(i).hoTen);
			System.out.println("Khoa"+gv.get(i).khoa);
			System.out.println("Trinh do"+gv.get(i).trinhDo);
			System.out.println("So tiet day"+gv.get(i).soTietDay);
			System.out.println("He so luong"+gv.get(i).heSoLuong);
			}
		System.out.println("danh sach nhan vien");
		for(int j=0; j<nv.size();j++){
			System.out.println("Ho ten"+nv.get(j).hoTen);
			System.out.println("Phong Ban"+nv.get(j).phongBan);
			System.out.println("Chuc vu"+nv.get(j).chucVu);
			System.out.println("so ngay cong"+nv.get(j).soNgayCong);
			System.out.println("he so luong"+nv.get(j).heSoLuong);
			}
		}
	
}
