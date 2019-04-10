package Lab3;

public class ChuNhat {
	int dai,rong,cao;

	ChuNhat(int dai,int rong) {
		this.dai = dai;
		this.rong = rong;
	}

	ChuNhat(int dai,int rong,int cao) {
		this.dai = dai;
		this.rong = rong;
		this.cao = cao;
	}
	int ChuVi(){
		return (dai + rong)*2;
	}
	int DienTich(){
		return (dai * rong);
	}
	int TheTich(){	
		return (dai * rong * cao);
	}
	int BanNhat(){
		return (dai * rong)*1/2;
	}

	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat(20,30);
		ChuNhat cn2 = new ChuNhat(80,25);
		ChuNhat cn3 = new ChuNhat(80,25,90);
		
		System.out.println(cn1.dai);
		System.out.println(cn2.rong);
		System.out.println(cn2.ChuVi());
		System.out.println(cn2.DienTich());
		System.out.println(cn3.TheTich());
		
		

	}
}
