package Lab2;

/*Viết chương trình xuất ra màn hình bảng cửu chương*/

public class Bai5 {
	public static void main(String[] args) {
		/*int x = 8;
		System.err.println("Bảng cửu chương 8");
		for (int i = 0; i <= 10; i++) {
			System.err.printf("%d * %d = %d\n",x, i, x * i);
		}*/
		
		for (int i = 1; i <= 9; i++) {
			System.err.println("Bảng cửu chương " +i);
			for (int j = 0; j <= 10; j++) {
				System.err.printf("   %d * %d = %d\n",i, j, i * j);
			}
		}
	}
}
