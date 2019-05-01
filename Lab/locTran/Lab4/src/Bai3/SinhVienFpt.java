package Bai3;

public abstract class SinhVienFpt {
	private String name;
	private String job;
	abstract double getDiem();
	abstract String getHocLuc();
	
	public SinhVienFpt() {
		this.name = "no name";
		this.job = "no nganh";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String nganh) {
		this.job = nganh;
	}
	
	public void show() {
		System.out.println("   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   ");
		System.out.println("Name \t\t: " + getName());
		System.out.println("Job \t\t: " + getJob());
		System.out.println("Scores \t\t: " + getDiem());
		System.out.println("capacity \t: " + getHocLuc());
	}
	
	
	public String xetHocLuc() {
		if (getDiem() >= 0 && getDiem() <= 10) {
			if (getDiem() < 5.0) {
				return "Yáº¿u";
			} else if (getDiem() <= 6.5) {
				return "Trung bĂ¬nh";
			} else if (getDiem() <= 7.5) {
				return "KhĂ¡";
			} else if (getDiem() <= 9.0) {
				return "Giá»�i";
			} else {
				return "Xuáº¥t sáº¯c";
			}
		} else {
			return "Sai Ä‘iá»ƒm rá»“i nĂ¨";
		}
	}
}
