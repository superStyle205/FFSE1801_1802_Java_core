package lap1;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		Scanner so = new Scanner(System.in);
		Scanner chu = new Scanner(System.in);
		
		System.out.println("Nháº­p cáº¡nh thá»© nháº¥t hĂ¬nh chá»¯ nháº­t");
		int canh1 = so.nextInt();
		
		System.out.println("Nháº­p cáº¡nh thá»© hai hĂ¬nh chá»¯ nháº­t");
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
		System.out.println("Chiá»�u dĂ i hĂ¬nh chá»¯ nháº­t lĂ  : " + cDai);
		System.out.println("Chiá»�u rá»™ng hĂ¬nh chá»¯ nháº­t lĂ   : " + cRong);
		System.out.println("Chu vi cá»§a hĂ¬nh chá»¯ nháº­t lĂ  : " + cv);
		System.out.println("Diá»‡n tĂ­ch cá»§a hĂ¬nh chá»¯ nháº­t lĂ  : " + dt);
		System.out.println("Cáº£nh nhá»� nháº¥t  lĂ  : " + canhNhoNhat);
	}
}
