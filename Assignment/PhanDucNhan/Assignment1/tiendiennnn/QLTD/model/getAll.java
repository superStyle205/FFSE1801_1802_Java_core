package QLTD.model;

import java.util.ArrayList;

public class getAll {
	private ArrayList<Customer> KH = new ArrayList<>();
	
	public getAll() {
		super();
	}

	public getAll(ArrayList<Customer> kH) {
		super();
		KH = kH;
	}

	public ArrayList<Customer> getKH() {
		return KH;
	}

	public void setKH(ArrayList<Customer> kH) {
		KH = kH;
	}

	public void addd(Customer data) {
		KH.add(data);
	}
	
	public void out() {
		for(Customer ds : KH) {
			System.out.println(ds);
		}
	}
}
