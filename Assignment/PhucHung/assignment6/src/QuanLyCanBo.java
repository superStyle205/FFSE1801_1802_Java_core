
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo {
	private ArrayList<Person> persons;
	private Scanner sc;

	public QuanLyCanBo() {
		persons = new ArrayList<Person>();
		sc = new Scanner(System.in);
	}

	public ArrayList<Person> getDanhSachGiangVien() {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		for (Person person : persons) {
			if (person instanceof Teacher) {
				teachers.add((Teacher) person);
				break;
			}
		}
		return persons;
	}

	public ArrayList<Person> getDanhSachNhanVien() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (Person person : persons) {
			if (person instanceof Employee) {
				employees.add((Employee) person);
				break;
			}
		}
		return persons;
	}

	public void addCanBo(Person person) {
		persons.add(person);
	}

	public void hienThiCanBo() {
		System.out.println("1. Hien thi giang vien / 2. Hien thi nhan vien");
		int choose = Integer.parseInt(sc.nextLine());
		if (choose == 1) {
			// hien thi giang vien
			System.out.println("Nhap khoa cần tìm");
			String chonKhoa = sc.nextLine();
			for (Person person : persons) {
				if (person instanceof Teacher) {
					if (((Teacher) person).getKhoa().equals(chonKhoa)) {
						((Teacher) person).xuat();
					}
				}
			}
		}
		if (choose == 2) {
			// hien thi nhan vien
			System.out.println("Nhập phòng ban cần tìm");
			String chonBan = sc.nextLine();
			for (Person person : persons) {
				if (person instanceof Employee) {
					if (((Employee) person).getPhongBan().equals(chonBan)) {
						((Employee) person).xuat();
					}
				}
			}
		}
	}

	public void tongLuong() {
		double sumGiangVien = 0;
		double sumNhanVien = 0;
		for (Person person : persons) {
			if (person instanceof Teacher) {
				sumGiangVien += ((Teacher) person).getLuong();
			} else if (person instanceof Employee) {
				sumNhanVien += ((Employee) person).getLuong();
			}
		}
		System.out.println("Tổng lương giảng viên \t: " + sumGiangVien);
		System.out.println("Tổng hành chính \t: " + sumNhanVien);
		System.out.println("Tổng 2 cai cong lai \t\t\t: " + (sumGiangVien + sumNhanVien));
	}

	public void sapXep() {
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person cn1, Person cn2) {
				if (cn1.getLuong() < cn2.getLuong()) {
					return 1;
				} else {
					if (cn1.getLuong() == cn2.getLuong()) {
						// nếu lương bằng thì sx theo tên
						return (cn1.getTen().compareTo(cn2.getTen()));
					} else {
						return -1;
					}
				}
			}
		});
		for (Person person : persons) {
			person.xuat();
		}
	}

	public void checkId(int id) throws Exception {
		int check = 1;
		for (Person person : persons) {
			if (person.getId() != id) {
				check = 1;
			} else if (check == 1) {
				throw new Exception("Id bi trung , nhap lai de !!! ");
			}
		}
	}

	public void checkText(Teacher teacher) throws Exception {
		for (int i = 0; i < persons.size(); i++) {
			char subItem = teacher.getTen().charAt(i);
			if (!(Character.isLetter(subItem) || Character.isWhitespace(subItem))) {
				throw new Exception("format text is wrong !!");
			}
		}
	}

	public void checkName(Teacher teacher) throws Exception {
		if ("".equals(teacher.getTen())) {
			throw new Exception("Text is no empty");
		} else if (teacher.getTen().length() > 40) {
			throw new Exception("độ dài không quá 40 ký tự");
		}

	}

	public void checkTrinhDo(Teacher teacher) throws Exception {
		if (!(teacher.getTrinhDo().equals("cu nhan") || teacher.getTrinhDo().equals("thac si")
				|| teacher.getTrinhDo().equals("tien si"))) {
			throw new Exception("phai la Cử nhân, Thạc sĩ, Tiến sĩ !!!");
		}

	}

	public Person nhapThongTin() {
		System.out.println("1. Giảng viên / 2. Nhân Viên");
		int chon = Integer.parseInt(sc.nextLine());
		if (chon == 1) {
			Teacher teacher = new Teacher();
			while (true) {
				try {
					System.out.println("Nhập thông tin giảng viên thứ " + (persons.size() + 1));
					System.out.println("Nhập id giang vien :");
					teacher.setId(Integer.parseInt(sc.nextLine()));
					checkId(teacher.getId());
					System.out.println("Nhập tên");
					teacher.setTen(sc.nextLine());
					checkName(teacher);
					checkText(teacher);
					System.out.println("Nhập khoa");
					teacher.setKhoa(sc.nextLine());
					System.out.println("Nhập trình độ : ( Cử nhân, Thạc sĩ, Tiến sĩ )");
					teacher.setTrinhDo(sc.nextLine());
					checkTrinhDo(teacher);
					System.out.println("Nhập số tiết dạy trong tháng");
					teacher.setSoTietDayTrongThang(Double.parseDouble(sc.nextLine()));
					System.out.println("Nhập hệ số lương");
					teacher.setHeSoLuong(Double.parseDouble(sc.nextLine()));
					persons.add(teacher);
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else if (chon == 2) {
			Employee employee = new Employee();
			while (true) {
				try {
					System.out.println("Nhập thông tin nhân viên thứ " + (persons.size() + 1));
					System.out.println("Nhập id nhan vien");
					employee.setId(Integer.parseInt(sc.nextLine()));
					checkId(employee.getId());
					System.out.println("Nhập tên");
					employee.setTen(sc.nextLine());

					System.out.println("Nhập phòng ban ( Trường phòng, phó phòng, nhân viên )");
					employee.setPhongBan(sc.nextLine());
					if (!(employee.getPhongBan().equals("truong phong") || employee.getPhongBan().equals("pho phong")
							|| employee.getPhongBan().equals("nhan vien"))) {
						throw new Exception("phai la Trường phòng, phó phòng, nhân viên !!!");
					}
					System.out.println("Nhập số ngày công");
					employee.setSoNgayCong(Double.parseDouble(sc.nextLine()));

					System.out.println("Nhập số tiết dạy trong tháng");
					employee.setChucVu(sc.nextLine());

					System.out.println("Nhập hệ số lương");
					employee.setHeSoLuong(Double.parseDouble(sc.nextLine()));
					persons.add(employee);
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return null;
	}

	public void menu() {
		int chooseMenu;
		while (true) {
			System.out.println("1. Nhập thông tin danh sách cán bộ trong trường");
			System.out.println("2. Xuất danh sách giảng viên khoa x,hoặc nhân viên phòng ban y nào đó");
			System.out.println("3. Tổng số lương phải trả cho cán bộ");
			System.out.println("4. Sắp xếp cán bộ theo lương,nếu lương bằng thì sắp xếp theo tên");
			chooseMenu = Integer.parseInt(sc.nextLine());
			switch (chooseMenu) {
			case 1:
				Person person = nhapThongTin();
				addCanBo(person);
				break;
			case 2:
				hienThiCanBo();
				break;
			case 3:
				tongLuong();
				break;
			case 4:
				sapXep();
				break;
			case 5:
				System.out.println("tam biet");
				System.exit(0);
				break;
			default:
				System.out.println("khong ton tai tinh nang nay");
				break;
			}
		}
	}

	public static void main(String[] args) {
		QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
		quanLyCanBo.menu();
	}
}
