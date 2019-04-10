package BenhVien;
import java.util.*;

public class Database{
	static private ArrayList<BenhNhan> dsBenhNhan=new ArrayList<>();
	static private ArrayList<BacSi> dsBacSi=new ArrayList<>();

	public ArrayList<BenhNhan> getDSBN(){
		return this.dsBenhNhan;
	}
	public ArrayList<BacSi> getDSBS(){
		return this.dsBacSi;
	}
	public void addBN(BenhNhan benhNhan){
		dsBenhNhan.add(benhNhan);	
	}
	public void addBS(BacSi bacSi){
		dsBacSi.add(bacSi);
	}
	public void hienThiBN(String maBN){
		for (BenhNhan benhNhan : dsBenhNhan){
			if(benhNhan.getID().equals(maBN)){
				benhNhan.hienThiHoSoBN();
				System.out.println();
				break;
			}    
		}
		System.out.println("Khong tim thay benh nhan");
	}
	
	public double tongTien(){
		int sum=0;
		for (BenhNhan benhNhan : dsBenhNhan){
			sum+=benhNhan.getTienTT();
		}
		return sum;
	}
	public BenhNhan bnTraNhieu(){
		BenhNhan max=null;
		int size=dsBenhNhan.size();
		for (int i =0;i<size;i++){
			for (int j=i+1;j<0;j++){
				if (dsBenhNhan.get(i).getTienTT()<dsBenhNhan.get(j).getTienTT()){
					max=dsBenhNhan.get(j);
				}
			}
		}
		return max;
	}
	public void bnBiBenh(String benh){
		ArrayList<BenhNhan> biBenh=new ArrayList<BenhNhan>();
		for (BenhNhan benhNhan : dsBenhNhan){
			if(benhNhan.getBenh().equals(benh)){
				biBenh.add(benhNhan);
			}
		}
		for (BenhNhan benhNhan : biBenh){
			benhNhan.hienThiHoSoBN();
			System.out.println();
		}
	}
	public void hienThiBSKhoa(String khoa){
		for (BacSi bacSi : dsBacSi){
			if(bacSi.getKhoa().equals(khoa)){
				bacSi.hienThiHoSoBS();
				System.out.println();
			}    
		}
		System.out.println("Khong tim thay bac si");
	}
	public BacSi hienThiBSID(String ID){
		for (BacSi bacSi : dsBacSi){
			if(bacSi.getID().equals(ID)){
				return bacSi;
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
		addBN(bn1);
		addBN(bn2);
		addBN(bn3);
		addBS(bs1);
		addBS(bs2);
		addBS(bs3);
	}

}