package doi_so_thanh_chu;

import java.util.Scanner;

public class DoiSoThanhChu {
	static Scanner sc = new Scanner(System.in);
	String number;

	public static String inputNumber() {
		System.out.println("Nhập số: ");
		String number = sc.nextLine();
		if (number == null || number.trim().length() == 0) {
			System.out.println("So khong ton tai!");
		} else {
			int t, l = number.length();
			t = l - 1;//
			String[] dv = new String[] { "nghin", "trieu", "ty", "nghin ty", "trieu ty" };
			String[] tl = new String[] { "muoi", "tram" };
			StringBuffer bf = new StringBuffer();
			for (int i = 0; i < l; i++) {
				bf.append(number.charAt(i)).append(" ");
				int k = (t - 1) / 3;
				if (k >= 0 && t > 0) {
					if (t % 3 == 0) {
						bf.append(dv[k]).append(" ");
						--t;
					} else {
						bf.append(tl[(t % 3) - 1]).append(" ");
						--t;
					}
				}
			}
			number = bf.toString();
			number = number.replaceAll("1", "mot").replaceAll("2", "hai").replaceAll("3", "ba").replaceAll("4", "bon")
					.replaceAll("5", "nam").replaceAll("6", "sau").replaceAll("7", "bay").replaceAll("8", "tam")
					.replaceAll("9", "chin").replaceAll("0", "khong");
			number = number.replaceAll("muoi khong", "muoi").replaceAll("muoi nam", "muoi lam")
					.replaceAll("mot muoi", "muoi").replaceAll("khong muoi", "le").replaceAll("le lam", "le nam")
					.replaceAll("le bon", "le tu");
			System.out.println("Thanh chu: " + number);
		}
		return number;
	}

	public static void main(String[] args) {
		inputNumber();
	}

}
