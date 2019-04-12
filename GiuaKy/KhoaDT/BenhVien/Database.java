package BenhVien;
import java.util.*;

public class Database{
	private ArrayList<ConNguoi> dsBenhNhan=new ArrayList<>();
	private ArrayList<ConNguoi> dsBacSi=new ArrayList<>();
	Scanner scanner=new Scanner(System.in);

	public ArrayList<ConNguoi> getDSBN(){
        return this.dsBenhNhan;
	}

	public ArrayList<ConNguoi> getDSBS(){
		return this.dsBacSi;
	}

	public void addBN(){
        System.out.println("Nhap ten");
        String ten=scanner.nextLine();
        System.out.println("Nhap tuoi");
        int tuoi=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ID");
        String ID=scanner.nextLine();
        System.out.println("Nhap ngay nhap vien");
        String ngayNhap=scanner.nextLine();
        System.out.println("Nhap ten benh");
        String benh=scanner.nextLine();
        System.out.println("Nhap tien vien phi");
        double tienTT=Double.parseDouble(scanner.nextLine());
        BenhNhan benhNhan=new BenhNhan(ten,tuoi,ID,ngayNhap,benh,tienTT);
		dsBenhNhan.add(benhNhan);	
	}

	public void addBS(){
        System.out.println("Nhap ten");
        String ten=scanner.nextLine();
        System.out.println("Nhap tuoi");
        int tuoi=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ID");
        String ID=scanner.nextLine();
        System.out.println("Nhap ten khoa");
        String khoa=scanner.nextLine();
        System.out.println("Nhap tien luong");
        Double luong=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap tien phu cap");
        Double phuCap=Double.parseDouble(scanner.nextLine());
        BacSi bacSi=new BacSi(ten,tuoi,ID,khoa,luong,phuCap);
		dsBacSi.add(bacSi);
	}

    public void hienThiHoSoBN(ConNguoi benhNhan){
        System.out.println("Ten benh nhan: "+benhNhan.getTen());
        System.out.println("Tuoi benh nhan: "+benhNhan.getTuoi());
        System.out.println("Ma benh nhan: "+benhNhan.getID());
        System.out.println("Ngay nhap vien: "+((BenhNhan)benhNhan).getNgayNhap());
        System.out.println("Bi benh: "+((BenhNhan)benhNhan).getBenh());
        System.out.println("Tien vien phi: "+((BenhNhan)benhNhan).getTienTT());
        System.out.println();
    }

	public void hienThiBN(String maBN){
		for (ConNguoi benhNhan : dsBenhNhan){
			if(benhNhan.getID().equals(maBN)){
				hienThiHoSoBN(benhNhan);
				System.out.println();
				break;
			}    
		}
		System.out.println("Khong tim thay benh nhan");
	}

	public double tongTien(){
		int sum=0;
		for (ConNguoi benhNhan : dsBenhNhan){
			sum+=((BenhNhan)benhNhan).getTienTT();
		}
		return sum;
	}

	public BenhNhan bnTraNhieu(){
		BenhNhan max=(BenhNhan)dsBenhNhan.get(0);
		int size=dsBenhNhan.size();
		for (int i =0;i<size;i++){
			for (int j=i+1;j<0;j++){
				if (((BenhNhan)dsBenhNhan.get(i)).getTienTT()<((BenhNhan)dsBenhNhan.get(j)).getTienTT()){
					max=((BenhNhan)dsBenhNhan.get(j));
				}
			}
		}
		return max;
	}

	public void bnBiBenh(String benh){
		ArrayList<ConNguoi> biBenh = new ArrayList<>();
		for (ConNguoi benhNhan : dsBenhNhan){
			if(((BenhNhan)benhNhan).getBenh().equals(benh)){
				biBenh.add(benhNhan);
			}
		}
		for (ConNguoi benhNhan : biBenh){
			hienThiHoSoBN(benhNhan);
			System.out.println();
		}
	}

    public void hienThiHoSoBS(ConNguoi bacSi){
        System.out.println("Ten bac si: "+bacSi.getTen());
        System.out.println("Tuoi benh nhan: "+bacSi.getTuoi());
        System.out.println("Ma bac si: "+bacSi.getID());
        System.out.println("Khoa lam viec: "+((BacSi)bacSi).getKhoa());
        System.out.println("Tien luong: "+((BacSi)bacSi).getLuong());
        System.out.println("Tien phu cap: "+((BacSi)bacSi).getPhuCap());
    }

	public void hienThiBSKhoa(String khoa){
		for (ConNguoi bacSi : dsBacSi){
			if(((BacSi)bacSi).getKhoa().equals(khoa)){
                hienThiHoSoBS(bacSi);
				System.out.println();
			}    
		}
		System.out.println("Khong tim thay bac si");
	}

	public BacSi hienThiBSID(String ID){
		for (ConNguoi bacSi : dsBacSi){
			if(bacSi.getID().equals(ID)){
				return ((BacSi)bacSi);
			}    
		}
		return null;
	}

	public Database(){
		BenhNhan bn1=new BenhNhan("Khoa",23,"12B","12/3/2019","tieu duong",12000);
		BenhNhan bn2=new BenhNhan("Viet",27,"169","13/02/1997","tim mach",7000);
		BenhNhan bn3=new BenhNhan("Luong",19,"12C","12/3/2019","hen suyen",5500);
		BacSi bs1=new BacSi("An",35,"ABC","Noi",25000,500);
		BacSi bs2=new BacSi("Quan",25,"DEF","Ngoai",18000,800);
		BacSi bs3=new BacSi("Dan",44,"GHK","Tim mach",37000,400);
        dsBenhNhan.add(bn1);
        dsBenhNhan.add(bn2);
        dsBenhNhan.add(bn3);
        dsBacSi.add(bs1);
        dsBacSi.add(bs2);
        dsBacSi.add(bs3);
	}

	public void menu(){
		System.out.println("Chon hanh dong tu menu:");
		System.out.println("1/ Them moi ho so benh nhan");
		System.out.println("2/ Hien thi thong tin tat ca benh nhan");
		System.out.println("3/ Hien thi ho so cua benh nhan voi ma benh nhan nhap tu ban phim");
		System.out.println("4/ Tinh tong cac so tien cua tat ca benh nhan");
		System.out.println("5/ Tim benh nhan co tien tra nhieu nhat");
		System.out.println("6/ Tim cac benh nhan co benh tuong ung nhap tu ban phim");
		System.out.println("7/ Them moi nhan vien");
		System.out.println("8/ Hien thi tat ca bac sy");
		System.out.println("9/ Hien thi bac sy voi khoa tuong ung nhap tu ban phim");
		System.out.println("10/ Sua phu cap cho bac sy tuong ung voi ma bac sy nhap tu ban phim");
		System.out.println("11/ Xoa bac sy voi ma tuong ung");
		System.out.println("12/ Thoat chuong trinh");
		while (true){
			switch(scanner.nextLine()){
				case "1":
					addBN();
					break;
				case "2":
					for (ConNguoi bn2 : dsBenhNhan){
						hienThiHoSoBN(bn2);
					}
					break;
				case "3":
					System.out.println("Nhap ma benh nhan can tim: ");
					hienThiBN(scanner.nextLine());
					break;
				case "4":
					System.out.println("Tong tien cac benh nhan: "+tongTien());
					break;
				case "5":
					if (bnTraNhieu()!=null){
						hienThiHoSoBN(bnTraNhieu());
					} else{
					    System.out.println("Khong co benh nhan nao trong database");
					}

					break;
				case "6":
					System.out.println("Nhap benh can tim: ");
					bnBiBenh(scanner.nextLine());
					break;
				case "7":
					addBS();
					break;
				case "8":
					for (ConNguoi bs2 : dsBacSi){
						hienThiHoSoBS(bs2);
					}
					break;
				case "9":
					System.out.println("Nhap khoa can tim: ");
					hienThiBSKhoa(scanner.nextLine());
					break;
				case "10":
					System.out.println("Nhap ma BS can tim: ");
					String id=scanner.nextLine();
                    System.out.println("Nhap phu cap moi: ");
					hienThiBSID(id).setPhuCap(Double.parseDouble(scanner.nextLine()));
					break;
				case "11":
					dsBacSi.remove(hienThiBSID(scanner.nextLine()));
					break;
				case "12":
					System.out.println("Thoat chuong trinh...");
					System.exit(0);
				default:
					System.out.println("Vui long chon hanh dong tu menu ");
			}
			System.out.println("Chon hanh dong tiep theo:... ");
		}
	}

}