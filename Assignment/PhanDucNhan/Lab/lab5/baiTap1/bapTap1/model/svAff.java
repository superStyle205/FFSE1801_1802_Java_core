package bapTap1.model;

import java.util.*;

public class svAff {
	private ArrayList<sv> sv;

	public ArrayList<sv> getSv() {
		return sv;
	}

	public void setSv(ArrayList<sv> sv) {
		this.sv = sv;
	}

	public svAff(ArrayList<bapTap1.model.sv> sv) {
		super();
		this.sv = sv;
	}

	public svAff() {
		super();
		sv = new ArrayList<>();
	}
	
	public void println_ranDom() {
		Random rand = new Random();
		int n = rand.nextInt(sv.size() - 1);
		System.out.println(sv.get(n));
	}
	
	public void add(sv e) {
		sv.add(e);
	}
	
	public void println_sv() {
		for(sv data : sv) {
			System.out.println(data);
		}
	}
	
	public void sort_ascending() {
		Collections.sort(sv, new Comparator<sv>() {
            @Override
            public int compare(sv sv1, sv sv2) {
                return (sv1.getTen().compareTo(sv2.getTen()));
            }
        });
	}
	
	public void look(String ten) {
		for (int i = 0; i < sv.size(); i++) {
			if(sv.get(i).getTen().equals(ten)) {
				sv.remove(i);
			}
		}
	}
	
	
	
}
