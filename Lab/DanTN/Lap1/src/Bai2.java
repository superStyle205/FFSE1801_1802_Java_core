
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài hình chữ nhật:");
		int chDai = scanner.nextInt();
		System.out.println("Nhập chiều rộng hình chữ nhật:");
		int chRong = scanner.nextInt();
		System.out.printf("Ta được hình chữ nhật:%nCó chiều dài là %d và chiều rộng là %d%n",chDai,chRong);
		System.out.println("Có chu vi bằng "+((chDai+chRong)*2));
		System.out.println("Có diện tích bằng "+(chDai*chRong));
		int min = Math.min(chDai, chRong);
		System.out.print("Cạnh nhỏ nhất trong hình chữ nhật là "+min);
	}
}
