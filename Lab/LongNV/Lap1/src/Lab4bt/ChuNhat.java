package Lab4bt;

public class ChuNhat extends Hinh{
	
	public ChuNhat() {
		setTenHinh("Hình chữ nhật");
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
		System.out.println("Chiều dài \t\t: " + getDai());
		System.out.println("Chiều rộng \t\t: " + getRong());
		System.out.println("Chiều cao \t\t: " + getCao());
		super.show();
	}
}
