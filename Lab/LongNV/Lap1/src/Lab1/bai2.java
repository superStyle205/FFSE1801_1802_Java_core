package Lab1;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		
		System.out.println("Nhập cạnh thứ nhất hình chữ nhật");
		int canh1 = so.nextInt();
		
		System.out.println("Nhập cạnh thứ hai hình chữ nhật");
		int canh2 = so.nextInt();
		
		int cv = (canh1 + canh2)*2;
		int dt = canh1 * canh2;
		int cDai,cRong;
		if (canh1 > canh2) {
			cDai = canh1;
			cRong = canh2;
		}else {
			cDai = canh2;
			cRong = canh1;
		}
		
		int canhNhoNhat = Math.min(canh1, canh2);
		System.out.println("Chiều dài hình chữ nhật là : " + cDai);
		System.out.println("Chiều rộng hình chữ nhật là  : " + cRong);
		System.out.println("Chu vi của hình chữ nhật là : " + cv);
		System.out.println("Diện tích của hình chữ nhật là : " + dt);
		System.out.println("Cảnh nhỏ nhất  là : " + canhNhoNhat);
	}
}
