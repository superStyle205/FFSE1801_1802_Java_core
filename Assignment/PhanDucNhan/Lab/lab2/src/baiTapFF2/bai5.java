package baiTapFF2;

public class bai5 {
	
	public static void main(String[] args) {
		
		bangCuuChuongTatCa();
		
	}
	
	public static void bangCuuChuongTatCa() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("");
		}
	}
	
	public static void bangCuuChuong(int x) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}
}
