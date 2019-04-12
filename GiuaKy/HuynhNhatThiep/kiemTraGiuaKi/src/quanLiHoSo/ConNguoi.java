package quanLiHoSo;

public class ConNguoi {
 private String id;
 private String name;
 private int cmnd;
 private int age;
 private String gioiTinh;
	public ConNguoi() {
		
	}
	public ConNguoi(String id, String name, int cmnd, int age, String gioiTinh) {
		super();
		this.id = id;
		this.name = name;
		this.cmnd = cmnd;
		this.age = age;
		this.gioiTinh = gioiTinh;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void xuat() {
		System.out.println("id :"+id);
		System.out.println("tên :"+name);
		System.out.println("tuổi :"+age);
		System.out.println("cmnd :"+cmnd);
		System.out.println("giới tính :"+gioiTinh);
		
		
		
		
		
		
		
	}

}
