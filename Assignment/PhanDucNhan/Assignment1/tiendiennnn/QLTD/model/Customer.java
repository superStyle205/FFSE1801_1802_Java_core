package QLTD.model;

public class Customer {
	protected String name;
	protected String adress;
	protected Receipt receipt_cs;
	
	public Customer(String name, String adress, Receipt receipt_cs) {
		super();
		this.name = name;
		this.adress = adress;
		this.receipt_cs = receipt_cs;
	}
	
	public Customer() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public Receipt getReceipt_cs() {
		return receipt_cs;
	}
	
	public void setReceipt_cs(Receipt receipt_cs) {
		this.receipt_cs = receipt_cs;
	}
	
	@Override
	public String toString() {
		return "Nam: " + this.name 
				+ "\tAdress: " + this.adress 
				+ "\tNumber new: " + receipt_cs.number_new 
				+ "\tNumber old: " + receipt_cs.number_old
				+ "\tSumPay: " + receipt_cs.sum();
	}
	
	
}
