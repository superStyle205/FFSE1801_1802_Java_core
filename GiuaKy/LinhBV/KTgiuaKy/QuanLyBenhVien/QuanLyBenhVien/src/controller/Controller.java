package controller;

import java.util.ArrayList;

import database.Database;
import model.BacSy;
import model.BenhNhan;
import views.PersonViews;

public class Controller {
	
		PersonViews personViews = new PersonViews();
		Database database = new Database();
		
		public void loadProgram() {
			ArrayList<BenhNhan> arrBenhNhan ;
			BenhNhan benhNhan;
			String find;
			ArrayList<BacSy> arrBacSy;
			BacSy bacSy;
			
			while(true) {
				int chose = personViews.menuViews();
				switch(chose) {
				case 1:
					benhNhan = personViews.addBenhNhanView();
					database.addBenhNhan(benhNhan);
					break;
				case 2:
					arrBenhNhan = database.getAllBenhNhan();
					personViews.displayListBenhNhan(arrBenhNhan);
					break;
				case 3:
					find = personViews.findBenhNhanFromMa();
					arrBenhNhan = database.findBenhNhanFromMa(find);
					personViews.displayListBenhNhan(arrBenhNhan);
					break;
				case 4:
					double total = database.totalMoneyBenhNhan();
					personViews.totalMoneyBenhNhanViews(total);
					break;
				case 5:
					benhNhan = database.findBenhNhanPayMoneyTheMost();
					personViews.displayBenhNhan(benhNhan);
					break;
				case 6:
					find = personViews.findBenhNhanFromBenh();
					arrBenhNhan = database.findBenhNhanFromBenh(find);
					personViews.displayListBenhNhan(arrBenhNhan);
					break;
				case 7:
					bacSy = personViews.addBacSyView();
					database.addBacSy(bacSy);
					break;
				case 8:
					arrBacSy = database.getAllBacSy();
					personViews.displayListBacSy(arrBacSy);
					break;
				case 9:
					find = personViews.findBacSyFromKhoa();
					arrBacSy = database.findBacSyFromKhoa(find);
					personViews.displayListBacSy(arrBacSy);
					break;
				case 10:
					find = personViews.findBacSyFromMa();
					boolean check = database.findMa(find);
					double phuCap = personViews.editBacSyViews(check);
					database.editPhuCapBacSyFromMa(find, phuCap, check);
					break;
				case 11:
					find =personViews.findBacSyFromMa();
					database.deleteBacSyFromMa(find);
					break;
				case 12:
					personViews.exit();
				default:
					personViews.mesage();
				}
			}
			
			
		}
}
