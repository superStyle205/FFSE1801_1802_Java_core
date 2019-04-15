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

		int choose = Integer.parseInt(sc.nextLine());
		if (choose == 1) {
			// hien thi giang vien
			System.out.println("Nhap khoa");
			String chonKhoa = sc.nextLine();
			for (Person person : persons) {
				if (person instanceof Teacher) {
					if (((Teacher) person).getKhoa().equals(chonKhoa))
						;
					((Teacher) person).xuat();
				}
			}
		}
		if (choose == 2) {
			// hien thi nhan vien
			System.out.println("Nhập phòng ban cần tìm");
			String chonBan = sc.nextLine();
			for (Person person : persons) {
				if (person instanceof Employee) {
					if (((Employee) person).getPhongBan().equals(chonBan))
						;
					((Employee) person).xuat();
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
		System.out.println("Tổng \t\t\t: " + (sumGiangVien + sumNhanVien));
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
	public Person nhapThongTin() {
		System.out.println("1. Giảng viên\n2. Nhân Viên");
		int chon = Integer.parseInt(sc.nextLine());
		if (chon == 1) {
			Teacher gv = new Teacher();
			System.out.println("Nhập thông tin giảng viên thứ " + (persons.size() + 1));

			System.out.println("Nhập tên");
			gv.setTen(sc.nextLine());

			System.out.println("Nhập khoa");
			gv.setKhoa(sc.nextLine());

			System.out.println("Nhập trình độ");
			gv.setTrinhDo(sc.nextLine());

			System.out.println("Nhập số tiết dạy trong tháng");
			gv.setSoTietDayTrongThang(sc.nextDouble());

			System.out.println("Nhập hệ số lương");
			gv.setHeSoLuong(sc.nextDouble());

			persons.add(gv);

		} else if (chon == 2) {

			Employee hc = new Employee();

			System.out.println("Nhập thông tin nhân viên thứ " + (persons.size() + 1));

			System.out.println("Nhập tên");
			hc.setTen(sc.nextLine());

			System.out.println("Nhập phòng ban");
			hc.setPhongBan(sc.nextLine());

			System.out.println("Nhập số ngày công");
			hc.setSoNgayCong(sc.nextDouble());

			System.out.println("Nhập số tiết dạy trong tháng");
			hc.setChucVu(sc.nextLine());

			System.out.println("Nhập hệ số lương");
			hc.setHeSoLuong(sc.nextDouble());

			persons.add(hc);

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
