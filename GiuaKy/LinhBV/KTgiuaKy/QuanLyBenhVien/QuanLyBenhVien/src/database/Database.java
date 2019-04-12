package database;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.BacSy;
import model.BenhNhan;


public class Database {

	ArrayList<BenhNhan> arrBenhNhan = new ArrayList<BenhNhan>();
	ArrayList<BacSy> arrBacSy = new ArrayList<BacSy>();
	ArrayList<BenhNhan> arrTempBN;
	ArrayList<BacSy> arrTempBS;

	public void addBenhNhan(BenhNhan benhNhan) {
		this.arrBenhNhan.add(benhNhan);
	}
	
	public ArrayList<BenhNhan> getAllBenhNhan(){
		arrTempBN = new ArrayList<BenhNhan>();
		for(BenhNhan ds: arrBenhNhan) {
			arrTempBN.add(ds);
		}
		return arrTempBN;
	}
	
	public ArrayList<BenhNhan> findBenhNhanFromMa(String findMa) {
		arrTempBN = new ArrayList<BenhNhan>();
		for (int i = 0; i < arrBenhNhan.size(); i++) {
			if (arrBenhNhan.get(i).getMaBenhNhan().equals(findMa)) {
				arrTempBN.add(arrBenhNhan.get(i));
			}
		}
		return arrTempBN;
	}

	public ArrayList<BenhNhan> findBenhNhanFromBenh(String findBenh) {
		arrTempBN = new ArrayList<BenhNhan>();
		for (int i = 0; i < arrBenhNhan.size(); i++) {
			if (arrBenhNhan.get(i).getBenh().equals(findBenh)) {
				arrTempBN.add(arrBenhNhan.get(i));
			}
		}
		return arrTempBN;
	}
	
	public BenhNhan findBenhNhanPayMoneyTheMost(){
		BenhNhan benhNhan =null;
		if(arrBenhNhan.size()>0) {
			if(arrBenhNhan.size()>1) {
				Collections.sort(arrBenhNhan , new Comparator<BenhNhan>() {
					@Override
					public int compare(BenhNhan o1, BenhNhan o2) {
						if(o1.getTienThanhToan()>o2.getTienThanhToan()) {
							return 1;
						}else {
							if(o1.getTienThanhToan()<o2.getTienThanhToan()) {
								return -1;
							}else {
								return 0;
							}
						}
					}
				});
			}
			benhNhan= arrBenhNhan.get(arrBenhNhan.size()-1);
		}
		return benhNhan;
		
	}
	
	public double totalMoneyBenhNhan() {
		int total = 0;
		for(int i = 0; i < arrBenhNhan.size(); i++){
			total+= arrBenhNhan.get(i).getTienThanhToan();
		}
		return total;
	}
	
	/* bác sĩ */
	
	public void addBacSy(BacSy bacSy) {
		this.arrBacSy.add(bacSy);
	}
	
	public ArrayList<BacSy> getAllBacSy(){
		arrTempBS = new ArrayList<BacSy>();
		for(BacSy ds:arrBacSy) {
			arrTempBS.add(ds);
		}
		return arrTempBS;
	}
	
	public ArrayList<BacSy> findBacSyFromKhoa(String findKhoa){
		arrTempBS = new ArrayList<BacSy>();
		for(BacSy ds : arrBacSy) {
			if(ds.getKhoa().equals(findKhoa)) {
				arrTempBS.add(ds);
			}
		}
		return arrTempBS;
	}
	
	public BacSy findBacSyFromMa(String findMa) {
		BacSy bacSy=null;
		for(BacSy ds: arrBacSy) {
			if(ds.getMaBacSy().equals(findMa)) {
				bacSy = ds;
			}
		}
		return bacSy;
	}
	
	public boolean findMa(String findMa) {
		boolean check =false;
		for(int i=0;i<arrBacSy.size();i++) {
			if(arrBacSy.get(i).getMaBacSy().equals(findMa)) {
				check =true;
			}
		}
		return check;
	}
	
	public void editPhuCapBacSyFromMa(String findMa, double phuCap,boolean check) {
		if(check) {
			for(int i=0; i < arrBacSy.size();i++) {
				if(arrBacSy.get(i).getMaBacSy().equals(findMa)) {
					arrBacSy.get(i).setPhuCap(phuCap);;
				}
			}
		}
	}
	
	public void deleteBacSyFromMa(String findMa) {
		for(BacSy ds : arrBacSy) {
			if(ds.getMaBacSy().equals(findMa)) {
				arrBacSy.remove(ds);
			}
		}
	}
	
}
