package lap1;
import java.util.Scanner;
public class lap3 {
	public static void main(String[] args) {
		int canh1,canh2,canh3,lapphuong;
		Scanner scanner =new Scanner(System.in);
		System.out.print("canh1");
		canh1 = scanner.nextInt();
		System.out.print("canh2");
		canh2 = scanner.nextInt();
		System.out.print("canh3");
		canh3 = scanner.nextInt();
		lapphuong = canh1*canh2*canh3;
		System.out.printf("%d",lapphuong);
		
		
	}
}

