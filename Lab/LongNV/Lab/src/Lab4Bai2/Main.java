package Lab4Bai2;

public class Main {
	public static void main(String[] args) {
		Vuong vuong1 = new Vuong();
		vuong1.setCanh(5);
		
		Vuong vuong2 = new Vuong();
		vuong2.setCanh(90);
		
		ChuNhat chuNhat1 = new ChuNhat();
		chuNhat1.setDai(10);
		chuNhat1.setRong(20);
		chuNhat1.setCao(40);
		
		ChuNhat chuNhat2 = new ChuNhat();
		chuNhat2.setDai(24);
		chuNhat2.setRong(12);
		chuNhat2.setCao(32);
		
		HinhTron hinhTron1 = new HinhTron();
		hinhTron1.setBanKinh(10);
		HinhTron hinhTron2 = new HinhTron();
		hinhTron2.setBanKinh(5);
		
		
		vuong1.show();
		vuong2.show();
		
		chuNhat1.show();
		chuNhat2.show();
		
		hinhTron1.show();
		hinhTron2.show();
		
	}
}
