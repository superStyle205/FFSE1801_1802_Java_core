package BenhVien;

public class ConNguoi{	
	private String ten;
	private int tuoi;
	private String ID;

	public String getTen(){
		return this.ten;
	}
	public int getTuoi(){
		return this.tuoi;
	}
	public String getID(){
		return this.ID;
	}

	public void setTen(String ten){
		this.ten=ten;
	}

	public void setTuoi(int tuoi){
		this.tuoi=tuoi;
	}

	public void setID(String ID){
		this.ID=ID;
	}

	public ConNguoi(String ten, int tuoi, String ID){
        setTen(ten);
        setTuoi(tuoi);
        setID(ID);
	}
}

