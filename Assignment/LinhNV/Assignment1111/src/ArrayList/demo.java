package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Collections;
public class demo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Nhập số phần tử : ");
//		int soPt = sc.nextInt();
//		for (int i = 0; i < soPt; i++) {
//			System.out.println("Nhập pt thứ " + (i + 1));
//			int j = sc.nextInt();
//			listPhanTu.add(j);
//		}
//		ArrayList<String> listPhanTu = new ArrayList<String>();
//		listPhanTu.add("a");
//		listPhanTu.add("b");
//		listPhanTu.add("c");
//		listPhanTu.add("d");
//		listPhanTu.add("e");
//		listPhanTu.add("f");
//		
//		for (String x : listPhanTu) {
//			System.out.print(x + " ");
//		}
//		String name = "Nguyễn Văn a";
//		System.out.println(name.contains("Nguyễn"));
//		System.out.println(name.contains("văn"));
//		System.out.println(name.contains("b"));
//		Collections.swap(listPhanTu, 3, 2);
//		
//		for (String x : listPhanTu) {
//			System.out.print(x + " ");
//		}
//		
//		Collections.shuffle(listPhanTu);
		HashMap<String, String> danhBa = new HashMap<String, String>();
		danhBa.put("123", "a");
		danhBa.put("234", "b");
		danhBa.put("345", "c");
		danhBa.put("456", "d");
		danhBa.put("567", "f");
		for (Entry entry : danhBa.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(danhBa.get("234"));
		danhBa.remove("234");
		for (Entry entry : danhBa.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(danhBa.size());
	}
}
