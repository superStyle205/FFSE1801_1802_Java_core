package bapTap1.test;

import bapTap1.model.svAff;
import bapTap1.model.sv;

public class test {
	public static void main(String[] args) {
		svAff sv = new svAff();
		
		sv.add(new sv("c", "Phan"));
		sv.add(new sv("b", "Cong"));
		sv.add(new sv("a", "Tran"));
		
		sv.sort_ascending();
		//sv.println_ranDom();
		sv.look("b");
		sv.println_sv();
		
	}
}
