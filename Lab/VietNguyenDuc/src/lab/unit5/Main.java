package lab.unit5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        run();
    }

    public static void run() {
        ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
        boolean pause = false;
        Scanner sc = new Scanner(System.in);

        while (!pause) {
            showText("1.Nhập thông tin danh sách cán bộ trong trường.  ( + 2.5 điểm )\n" +
                    "2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó.  ( + 2.5 điểm )\n" +
                    "3.Tổng số lương trường phải trả cho cán bộ.  ( + 2.5 điểm )\n" +
                    "4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên. ( + 2.5 điểm ) \n");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:
                    showText("1.Gỉang viên\n2.Nhân viên");
                    if (Integer.parseInt(sc.nextLine()) == 1) {
                        GiangVien giangVien = new GiangVien();
                        giangVien.input();
                        dsCanBo.add(giangVien);
                    } else {
                        NhanVien nhanVien = new NhanVien();
                        nhanVien.input();
                        dsCanBo.add(nhanVien);
                    }
                    break;
                case 2:
                    showText("1.Hiển thị danh sách giảng viên theo khoa\n2.Hiển thị danh sách nhân viên theo phòng ban");
                    if (Integer.parseInt(sc.nextLine()) == 1) {
                        showText("Khoa cần tìm:");
                        for (CanBo cb : dsCanBo) {
                            if (cb instanceof GiangVien){
                                ((GiangVien) cb).findGiangVien(sc.nextLine());
                            }
                        }
                    } else {
                        showText("Phòng ban cần tìm:");
                        for (CanBo cb : dsCanBo) {
                            if (cb instanceof NhanVien){
                                ((NhanVien) cb).findNhanVien(sc.nextLine());
                            }
                        }
                    }

                    break;
                case 3:
                    double sum = 0;
                    for (CanBo cb : dsCanBo) {
                        if (cb instanceof NhanVien) {
                            sum = ((NhanVien) cb).getLuong() +  sum;
                        } else {
                            sum = ((GiangVien) cb).getLuong() +  sum;
                        }
                    }
                    showText("Tổng lương phải trả cho cán bộ là: " + sum);
                    break;
                case 4:
                    dsCanBo.sort(new Comparator<CanBo>() {
                        @Override
                        public int compare(CanBo o1, CanBo o2) {
                            String n1 = o1.getName();
                            String n2 = o2.getName();
                            double l1, l2;
                            if (o1 instanceof NhanVien) {
                                l1 = ((NhanVien) o1).getLuong();
                            } else {
                                l1 = ((GiangVien) o1).getLuong();
                            }
                            if (o2 instanceof NhanVien) {
                                l2 = ((NhanVien) o2).getLuong();
                            } else {
                                l2 = ((GiangVien) o2).getLuong();
                            }
                            if (l1 == l2) {
                                return n1.compareTo(n2);
                            }
                            return l1 > l2 ? 1 : -1;
                        }
                    });
                    for (CanBo cb : dsCanBo) {
                        if (cb instanceof NhanVien) {
                            ((NhanVien) cb).output();
                            showText("Luong la++++++++++++++" + ((NhanVien) cb).getLuong());
                        }
                        if (cb instanceof GiangVien) {
                            ((GiangVien) cb).output();
                            showText("Luong la++++++++++++++" + ((GiangVien) cb).getLuong());
                        }

                    }

                    break;
                case 5:
                    GiangVien giangVien = new GiangVien();
                    giangVien.setName("a");
                    giangVien.setHeSoLuong(1);
                    giangVien.setPhuCap(1);
                    giangVien.setTrinhDo("a");
                    giangVien.setKhoa("a");
                    giangVien.setSoTiet(1);
                    dsCanBo.add(giangVien);
                    GiangVien giangViena = new GiangVien();
                    giangViena.setName("b");
                    giangViena.setHeSoLuong(123);
                    giangViena.setPhuCap(12);
                    giangViena.setTrinhDo("b");
                    giangViena.setKhoa("b");
                    giangViena.setSoTiet(23);
                    dsCanBo.add(giangViena);
                    GiangVien giangVien1 = new GiangVien();
                    giangVien1.setName("c");
                    giangVien1.setHeSoLuong(5);
                    giangVien1.setPhuCap(5);
                    giangVien1.setTrinhDo("c");
                    giangVien1.setKhoa("c");
                    giangVien1.setSoTiet(6);
                    dsCanBo.add(giangVien1);
                    GiangVien giangVien2 = new GiangVien();
                    giangVien2.setName("d");
                    giangVien2.setHeSoLuong(6);
                    giangVien2.setPhuCap(4);
                    giangVien2.setTrinhDo("d");
                    giangVien2.setKhoa("d");
                    giangVien2.setSoTiet(1);
                    dsCanBo.add(giangVien2);
                    GiangVien giangVien3 = new GiangVien();
                    giangVien3.setName("e");
                    giangVien3.setHeSoLuong(51);
                    giangVien3.setPhuCap(1);
                    giangVien3.setTrinhDo("e");
                    giangVien3.setKhoa("e");
                    giangVien3.setSoTiet(2);
                    dsCanBo.add(giangVien3);
                    GiangVien giangVien4 = new GiangVien();
                    giangVien4.setName("f");
                    giangVien4.setHeSoLuong(7);
                    giangVien4.setPhuCap(7);
                    giangVien4.setTrinhDo("f");
                    giangVien4.setKhoa("f");
                    giangVien4.setSoTiet(1);
                    dsCanBo.add(giangVien4);
                    GiangVien giangVien5 = new GiangVien();
                    giangVien5.setName("g");
                    giangVien5.setHeSoLuong(23);
                    giangVien5.setPhuCap(14);
                    giangVien5.setTrinhDo("g");
                    giangVien5.setKhoa("g");
                    giangVien5.setSoTiet(17);
                    dsCanBo.add(giangVien5);
                    GiangVien giangVie6 = new GiangVien();
                    giangVie6.setName("h");
                    giangVie6.setHeSoLuong(135);
                    giangVie6.setPhuCap(121);
                    giangVie6.setTrinhDo("h");
                    giangVie6.setKhoa("h");
                    giangVie6.setSoTiet(15);
                    dsCanBo.add(giangVie6);
                    GiangVien giangVie7 = new GiangVien();
                    giangVie7.setName("th");
                    giangVie7.setHeSoLuong(1);
                    giangVie7.setPhuCap(1);
                    giangVie7.setTrinhDo("h");
                    giangVie7.setKhoa("h");
                    giangVie7.setSoTiet(1);
                    dsCanBo.add(giangVie7);
                    GiangVien giangVi7 = new GiangVien();
                    giangVi7.setName("j");
                    giangVi7.setHeSoLuong(14);
                    giangVi7.setPhuCap(11);
                    giangVi7.setTrinhDo("j");
                    giangVi7.setKhoa("j");
                    giangVi7.setSoTiet(17);
                    dsCanBo.add(giangVi7);
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.setName("aa");
                    nhanVien.setPhuCap(5);
                    nhanVien.setChucVu("aa");
                    nhanVien.setPhongBan("aa");
                    nhanVien.setSoNgayCong(12);
                    nhanVien.setHeSoLuong(31);
                    dsCanBo.add(nhanVien);
                    NhanVien nhanVien1 = new NhanVien();
                    nhanVien1.setName("bb");
                    nhanVien1.setPhuCap(532);
                    nhanVien1.setChucVu("bb");
                    nhanVien1.setPhongBan("bb");
                    nhanVien1.setSoNgayCong(25);
                    nhanVien1.setHeSoLuong(125);
                    dsCanBo.add(nhanVien1);
                    NhanVien nhanVien2 = new NhanVien();
                    nhanVien2.setName("cc");
                    nhanVien2.setPhuCap(34);
                    nhanVien2.setChucVu("cc");
                    nhanVien2.setPhongBan("cc");
                    nhanVien2.setSoNgayCong(23);
                    nhanVien2.setHeSoLuong(12);
                    dsCanBo.add(nhanVien2);
                    NhanVien nhanVien3 = new NhanVien();
                    nhanVien3.setName("cc");
                    nhanVien3.setPhuCap(54);
                    nhanVien3.setChucVu("rq");
                    nhanVien3.setPhongBan("bc");
                    nhanVien3.setSoNgayCong(23);
                    nhanVien3.setHeSoLuong(52);
                    dsCanBo.add(nhanVien3);
                    NhanVien nhanVien4 = new NhanVien();
                    nhanVien4.setName("ar");
                    nhanVien4.setPhuCap(125);
                    nhanVien4.setChucVu("ar");
                    nhanVien4.setPhongBan("ar");
                    nhanVien4.setSoNgayCong(35);
                    nhanVien4.setHeSoLuong(12);
                    dsCanBo.add(nhanVien4);
                    NhanVien nhanVien5 = new NhanVien();
                    nhanVien5.setName("ra");
                    nhanVien5.setPhuCap(5434);
                    nhanVien5.setChucVu("r");
                    nhanVien5.setPhongBan("ra");
                    nhanVien5.setSoNgayCong(342);
                    nhanVien5.setHeSoLuong(143);
                    dsCanBo.add(nhanVien5);
                    NhanVien nhanVien6 = new NhanVien();
                    nhanVien6.setName("ya");
                    nhanVien6.setPhuCap(114);
                    nhanVien6.setChucVu("oh");
                    nhanVien6.setPhongBan("ef");
                    nhanVien6.setSoNgayCong(15);
                    nhanVien6.setHeSoLuong(145);
                    dsCanBo.add(nhanVien6);
                    NhanVien nhanVien7 = new NhanVien();
                    nhanVien7.setName("qe");
                    nhanVien7.setPhuCap(155);
                    nhanVien7.setChucVu("yf");
                    nhanVien7.setPhongBan("qe");
                    nhanVien7.setSoNgayCong(125);
                    nhanVien7.setHeSoLuong(1534);
                    dsCanBo.add(nhanVien7);
                    NhanVien nhanVien8 = new NhanVien();
                    nhanVien8.setName("vd");
                    nhanVien8.setPhuCap(1568);
                    nhanVien8.setChucVu("vd");
                    nhanVien8.setPhongBan("vd");
                    nhanVien8.setSoNgayCong(18);
                    nhanVien8.setHeSoLuong(18);
                    dsCanBo.add(nhanVien8);
                    NhanVien nhanVien9 = new NhanVien();
                    nhanVien9.setName("b");
                    nhanVien9.setPhuCap(1);
                    nhanVien9.setChucVu("vd");
                    nhanVien9.setPhongBan("vd");
                    nhanVien9.setSoNgayCong(1);
                    nhanVien9.setHeSoLuong(1);
                    dsCanBo.add(nhanVien9);
                    break;
                default:
                    pause = true;
                    break;
            }
        }
    }

    public static void showText(String text) {
        System.out.println(text);
    }
}
