package QLTD.model;

public class Receipt {
	protected double number_new;
	protected double number_old;
	
	public Receipt(double number_new, double number_old) {
		super();
		this.number_new = number_new;
		this.number_old = number_old;
	}
	
	public Receipt() {
		super();
	}
	
	public double getNumber_new() {
		return number_new;
	}
	
	public void setNumber_new(double number_new) {
		this.number_new = number_new;
	}
	
	public double getNumber_old() {
		return number_old;
	}
	
	public void setNumber_old(double number_old) {
		this.number_old = number_old;
	}
	
	public double sum() {
		return (this.number_new - this.number_old) * 750;
	}
	
	@Override
	public String toString() {
		return "\tNumber new: " + this.number_new + "\t Number old: " + this.number_old;
	}
}
