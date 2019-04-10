package Lab3;

import java.util.Scanner;
public class NhanVien {
	public String Name;
	public double Salary;
	private Scanner hihi;
	
	public void input() {
		hihi = new Scanner(System.in);
		System.out.println("Nhập tên nhân viên");
		Name =	hihi.nextLine();

		System.out.println("Nhập lương nhân viên");
		Salary =hihi.nextDouble();		
	}
	public void output() {
		System.out.println("Tên nhân viên là : " + Name);
		System.out.println("Lương nhân viên là : " + Salary);
	}
	
	

	public void setInfo(String Name,double Salary) {
		this.Name = Name;
		this.Salary = Salary;
	}
	public double incomeTax() {
		if(Salary <= 5000000) {
			return 0;
		}else {
			return(Salary - 5000000) * 10 / 100;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		nv1.input();
		nv1.output();
		nv1.Name = "Long chim cho";
		nv1.Salary = 12;
		nv1.output();
		nv1.setInfo("Nguyễn Viết Long", 40000000);
		System.out.println("Thuế của nhân viên " + nv1.Name + " có thuế là " + nv1.incomeTax());
		NhanVien nv2 = new NhanVien();
		nv2.input();
		nv2.output();
	}
}
