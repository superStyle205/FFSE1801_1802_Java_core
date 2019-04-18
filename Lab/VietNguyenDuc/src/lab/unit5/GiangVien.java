package lab.unit5;

public class GiangVien extends CanBo {
    private String khoa;
    private String trinhDo;
    private int soTiet;

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public void input() {
        System.out.println("Nhập tên giảng viên: ");
        setName(sc.nextLine());
        System.out.println("Nhập phòng ban: ");
        this.khoa = sc.nextLine();
        System.out.println("Nhập chức vụ: \n 1. Cử nhân \n 2. Thạc sĩ \n 3. Tiến sĩ");
        int chonTrinhDo = sc.nextInt();
        switch (chonTrinhDo) {
            case 1:
                this.trinhDo = "Cử nhân";
                setPhuCap(300);
                break;
            case 2:
                this.trinhDo = "Thạc sĩ";
                setPhuCap(500);
                break;
            case 3:
                this.trinhDo = "Tiến sĩ";
                setPhuCap(1000);
                break;
            default:
                break;
        }
        System.out.println("Nhập số ngày công: ");
        this.soTiet = sc.nextInt();
        System.out.println("Nhập hệ số lương: ");
        setHeSoLuong(sc.nextDouble());
    }

    public void output() {
        System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", "Tên", "Khoa", "Trình độ", "Hệ số lương",
                "Số tiết", "Phụ cấp");
        System.out.printf("\n%n|%-30s|%-20s|%-20s|%-15s|%-15s|%-20s|%n", getName(), khoa, trinhDo,
                getHeSoLuong(), soTiet, getPhuCap());
    }
    public void findGiangVien(String Khoa) {
        if (Khoa.equals(this.khoa)) {
            output();
        }
    }
    public double getLuong() {
        double luong = getHeSoLuong() * 730 + getPhuCap() + soTiet * 45;
        return luong;
    }
}
