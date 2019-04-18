package Bai2;

public class ChuNhat extends Hinh{
	
	public ChuNhat() {
		setTenHinh("HĂ¬nh chá»¯ nháº­t");
	}

	double getChuVi(){
		return (getDai() + getRong())*2;
	}
	
	double getDienTich(){
		return getDai() * getRong();
	}
	
	double getTheTich(){
		return getDai() * getRong() * getCao();
	}
	
	public void show() {
		super.showName();
		System.out.println("Chiá»�u dĂ i \t\t: " + getDai());
		System.out.println("Chiá»�u rá»™ng \t\t: " + getRong());
		System.out.println("Chiá»�u cao \t\t: " + getCao());
		super.show();
	}
}
