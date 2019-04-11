package Lab2;

public class bai5 {
	public static void main(String[] args) {
		System.err.println("+-------------BẢNG CỬU CHƯƠNG-------------+");

		for(int i = 1; i <= 10; i++ ){
			System.err.println("Bảng cửu chương " + i);
			for(int j = 1; j <= 10; j++ ){
				System.out.printf(" %d x %d = %d \n",i,j,j*i );
			}
		}

	}
}
