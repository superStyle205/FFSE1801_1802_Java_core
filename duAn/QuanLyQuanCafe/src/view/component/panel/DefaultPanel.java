package view.component.panel;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;

public class DefaultPanel extends JPanel {

	private JPanel bangGia ;
	private JPanel baoCao;
	private JPanel inHoaDon;

	private Label lbbangGia;
	private Label lbthuNgan;
	private Label lbnhanVien;

	private JComboBox<String> jCbBangGia;
	private JComboBox<String> jCbthuNgan;
	private JComboBox<String> jCbnhanVien;

	private JRadioButton tiengViet;
	private JRadioButton TiengAnh;
	private Checkbox xemTruoc;

	public DefaultPanel() {
		setBackground(new Color(102, 255, 255));
		initScreen();

	}
	public void initScreen() {
		bangGia = new JPanel();
		bangGia.setBackground(new Color(102, 255, 255));
		bangGia.setLayout(new GridLayout(3, 2));
		bangGia.setBounds(5,3,270,87);

		lbbangGia = new Label("Bảng Giá: ");
		jCbBangGia = new JComboBox<>();
		jCbBangGia.addItem("Mặc Định");
		jCbBangGia.addItem("Phòng lạnh");

		lbthuNgan = new Label("Thu ngân: ");
		jCbthuNgan = new  JComboBox<>();
		jCbthuNgan.addItem("Tất Cả");


		lbnhanVien = new Label("Nhân viên: ");
		jCbnhanVien = new JComboBox<>();

		bangGia.add(lbbangGia);
		bangGia.add(jCbBangGia);
		bangGia.add(lbthuNgan);
		bangGia.add(jCbthuNgan);
		bangGia.add(lbnhanVien);
		bangGia.add(jCbnhanVien);

		baoCao = new JPanel();
		baoCao.setLayout(new GridLayout(2, 2));
		Border borderBaoCao = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder titledBaoCao = BorderFactory.createTitledBorder(borderBaoCao , "Báo Cáo");
		baoCao.setBorder(titledBaoCao);
		baoCao.setBounds(277,3,350,87);

		JPanel jb = new JPanel();
		jb.setLayout(new BoxLayout(jb, BoxLayout.X_AXIS));
		JLabel lblTuNgay = new JLabel("từ ngày:");
		JLabel lblDenNgay = new JLabel("Đến Ngày");
		JDateChooser dateChooser = new JDateChooser();
		JDateChooser dateChooser_1 = new JDateChooser();

		jb.add(lblTuNgay);
		jb.add(dateChooser);
		jb.add(lblDenNgay);
		jb.add(dateChooser_1);
		baoCao.add(jb);

		JPanel jbt = new JPanel();
		jbt.setLayout(new BoxLayout(jbt, BoxLayout.X_AXIS));
		JLabel jblKhachHang = new JLabel("Khách Hàng: ");
		JComboBox<String> JbMenu = new JComboBox<>();


		jbt.add(jblKhachHang);
		jbt.add(JbMenu);
		baoCao.add(jbt);	

		inHoaDon = new JPanel();
		inHoaDon.setLayout(new GridLayout(2, 2));
		Border borderInHoaDon = BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder titleInHoaDon = BorderFactory.createTitledBorder(borderInHoaDon , "In Hóa Đơn");
		ButtonGroup nGroup = new ButtonGroup();

		inHoaDon.setBorder(titleInHoaDon);
		inHoaDon.setBounds(629,3,350,87);
		tiengViet = new JRadioButton("Tiếng Việt",true);
		inHoaDon.add(tiengViet);
		TiengAnh = new JRadioButton("Tiếng Anh");
		inHoaDon.add(TiengAnh);
		xemTruoc = new Checkbox("Xem Trước Hóa Đơn", true);
		inHoaDon.add(xemTruoc);
		setLayout(null);
		nGroup.add(TiengAnh);
		nGroup.add(tiengViet);

		add(bangGia);
		add(baoCao);
		add(inHoaDon);

	}
}
