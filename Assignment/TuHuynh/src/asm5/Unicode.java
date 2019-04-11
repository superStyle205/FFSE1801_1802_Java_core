package asm5;
import java.util.HashMap;

public class Unicode {
	HashMap<Character, Integer> codeVN = new HashMap<>();
	
	public void VN() {
		codeVN.put('a',0);
		codeVN.put('á',1);
		codeVN.put('à',2);
		codeVN.put('ả',3);
		codeVN.put('ã',4);
		codeVN.put('ạ',5);
		codeVN.put('ă',6);
		codeVN.put('ắ',7);
		codeVN.put('ằ',8);
		codeVN.put('ẳ',9);
		codeVN.put('ẵ',10);
		codeVN.put('ặ',11);
		codeVN.put('â',12);
		codeVN.put('ấ',13);
		codeVN.put('ầ',14);
		codeVN.put('ẩ',15);
		codeVN.put('ẫ',16);
		codeVN.put('ậ',17);
		codeVN.put('b',18);
		codeVN.put('c',19);
		codeVN.put('d',20);
		codeVN.put('đ',21);
		codeVN.put('e',22);
		codeVN.put('é',23);
		codeVN.put('è',24);
		codeVN.put('ẻ',25);
		codeVN.put('ẽ',26);
		codeVN.put('ẹ',27);
		codeVN.put('ê',28);
		codeVN.put('ế',29);
		codeVN.put('ề',30);
		codeVN.put('ể',31);
		codeVN.put('ễ',32);
		codeVN.put('ệ',33);
		codeVN.put('f',34);
		codeVN.put('g',35);
		codeVN.put('h',36);
		codeVN.put('i',37);
		codeVN.put('í',38);
		codeVN.put('ì',39);
		codeVN.put('ỉ',40);
		codeVN.put('ĩ',41);
		codeVN.put('ị',42);
		codeVN.put('j',43);
		codeVN.put('k',44);
		codeVN.put('l',45);
		codeVN.put('m',46);
		codeVN.put('n',47);
		codeVN.put('o',48);
		codeVN.put('ó',49);
		codeVN.put('ò',50);
		codeVN.put('ỏ',51);
		codeVN.put('õ',52);
		codeVN.put('ọ',53);
		codeVN.put('ô',54);
		codeVN.put('ố',55);
		codeVN.put('ồ',56);
		codeVN.put('ổ',57);
		codeVN.put('ỗ',58);
		codeVN.put('ộ',59);
		codeVN.put('ơ',60);
		codeVN.put('ớ',61);
		codeVN.put('ờ',62);
		codeVN.put('ở',63);
		codeVN.put('ỡ',64);
		codeVN.put('ợ',65);
		codeVN.put('p',66);
		codeVN.put('q',67);
		codeVN.put('r',68);
		codeVN.put('s',69);
		codeVN.put('t',70);
		codeVN.put('u',71);
		codeVN.put('ú',72);
		codeVN.put('ù',73);
		codeVN.put('ủ',74);
		codeVN.put('ũ',75);
		codeVN.put('ụ',76);
		codeVN.put('ư',77);
		codeVN.put('ứ',78);
		codeVN.put('ừ',79);
		codeVN.put('ử',80);
		codeVN.put('ữ',81);
		codeVN.put('ự',82);
		codeVN.put('v',83);
		codeVN.put('x',84);
		codeVN.put('y',85);
		codeVN.put('z',86);
	}
	public boolean compare(String input, String input2){
		char[] a = input.toLowerCase().toCharArray();
		char[] b = input2.toLowerCase().toCharArray();
		int size = (int)Math.min(input.length(), input2.length());
		for(int i = 0; i< size; i++) {
			if(codeVN.get(a[i]) < codeVN.get(b[i])) {
				return true;
			}else if(codeVN.get(a[i]) > codeVN.get(b[i])){
				return false;
			}else {
				continue;
			}
		}
		if(input.length() <  input2.length()) {
			return true;
		}else {
			return false;
		}
    }
}
