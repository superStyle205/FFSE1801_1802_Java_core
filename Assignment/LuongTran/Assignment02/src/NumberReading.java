package Assignment02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class NumberReading {
	Scanner scanner;
	ArrayList<Integer> listNumber;
	ArrayList<String> listString;
	
	public NumberReading() {
		scanner = new Scanner(System.in);
		listNumber = new ArrayList<Integer>();
		listString = new ArrayList<String>();
	}

	public void numberSlit() {
		System.out.println("vui lòng nhập n");
		int number = scanner.nextInt();
		int n = 0;
		if(number >= 1000 && number <= 9999) {
			n = 4;
		} else {
			if(number >= 100 && number <= 999) {
				n = 3;
			} else {
				if(number >= 10 && number <= 99) {
					n = 2;
				} else {
					n = 1;
				}
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			int mp = number % 10;
				number = Math.floorDiv(number,10);
				listNumber.add(mp);
		}
		Collections.reverse(listNumber);

	}
	
	public String docTuKhongDenChin(int i) {
		String str = null;
		if(listNumber.get(i) == 1) {
			str = "một";
		}
		if(listNumber.get(i) == 2) {
			str = "hai";
		}
		if(listNumber.get(i) == 3) {
			str = "ba";
		}
		if(listNumber.get(i) == 4) {
			str = "bốn";
		}
		if(listNumber.get(i) == 5) {
			str = "năm";
		}
		if(listNumber.get(i) == 6) {
			str = "sáu";
		}
		if(listNumber.get(i) == 7) {
			str = "bảy";
		}
		if(listNumber.get(i) == 8) {
			str = "tám";
		}
		if(listNumber.get(i) == 9) {
			str = "chín";
		}
		if(listNumber.get(i) == 0) {
			str = "không";
		}
		return str;
	}
	
	public void readingNumber() {
		for(int i =0; i < listNumber.size();i++) {
			listString.add(docTuKhongDenChin(i));
		}

		switch(listNumber.size()) {
		case 1:
			System.out.println(listString.get(0));
			break;
		case 2:
			if(listString.get(0).equals("một")) {
				listString.set(0, "mười");
			}
			if(listString.get(1).equals("năm")) {
				listString.set(1, "lăm");
			}
			System.out.println(listString.get(0)+" "+listString.get(1));
			break;
		case 3:
			if(listString.get(2).equals("năm")) {
				listString.set(2, "lăm");
			}
			if(listString.get(1).equals("không")) {
				listString.set(1, "lẻ");
			}
			System.out.println(listString.get(0)+" trăm "+listString.get(1)+" "+listString.get(2));
			break;
		case 4:
			if(listString.get(2).equals("không")) {
				listString.set(2, "lẻ");
			}
			if(listString.get(3).equals("năm")) {
				listString.set(3, "lăm");
			}
			
			System.out.println(listString.get(0)+ " nghìn "+listString.get(1)+" trăm "+ listString.get(2)+" "+listString.get(3));
		}
	}

	public static void main(String[] args) {
		NumberReading n = new NumberReading();
		n.numberSlit();
		n.readingNumber();
	}
}
