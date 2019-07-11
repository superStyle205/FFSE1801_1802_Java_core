package view.component.panel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.bean.bo.UserBo;
import model.bean.bo.UserBoImpl;
import view.DoiMatKhau;
import view.ViewMain;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToolHeThongPanel extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */
	private static long serialVersionUID = 1L;
	// cac item cho cum he thong
	private JButton btnDanhMuc;
	private JButton btnTuyChon;
	private JButton btnSanPham;
	private JButton btnKhachHang;
	private JButton btnNhanVien;
	private JButton btnMatKhau;
	private JButton btnKetThuc;

	private ImageIcon DanhMuc;
	private ImageIcon TuyChon;
	private ImageIcon SanPham;
	private ImageIcon KhachHang;
	private ImageIcon NhanVien;
	private ImageIcon MatKhau;
	private ImageIcon KetThuc;
	private ActionListener aListener;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public JButton getBtnDanhMuc() {
		return btnDanhMuc;
	}

	public void setBtnDanhMuc(JButton btnDanhMuc) {
		this.btnDanhMuc = btnDanhMuc;
	}

	public JButton getBtnTuyChon() {
		return btnTuyChon;
	}

	public void setBtnTuyChon(JButton btnTuyChon) {
		this.btnTuyChon = btnTuyChon;
	}

	public JButton getBtnSanPham() {
		return btnSanPham;
	}

	public void setBtnSanPham(JButton btnSanPham) {
		this.btnSanPham = btnSanPham;
	}

	public JButton getBtnKhachHang() {
		return btnKhachHang;
	}

	public void setBtnKhachHang(JButton btnKhachHang) {
		this.btnKhachHang = btnKhachHang;
	}

	public JButton getBtnNhanVien() {
		return btnNhanVien;
	}

	public void setBtnNhanVien(JButton btnNhanVien) {
		this.btnNhanVien = btnNhanVien;
	}

	public JButton getBtnMatKhau() {
		return btnMatKhau;
	}

	public void setBtnMatKhau(JButton btnMatKhau) {
		this.btnMatKhau = btnMatKhau;
	}

	public JButton getBtnKetThuc() {
		return btnKetThuc;
	}

	public void setBtnKetThuc(JButton btnKetThuc) {
		this.btnKetThuc = btnKetThuc;
	}

	public ImageIcon getDanhMuc() {
		return DanhMuc;
	}

	public void setDanhMuc(ImageIcon danhMuc) {
		DanhMuc = danhMuc;
	}

	public ImageIcon getTuyChon() {
		return TuyChon;
	}

	public void setTuyChon(ImageIcon tuyChon) {
		TuyChon = tuyChon;
	}

	public ImageIcon getSanPham() {
		return SanPham;
	}

	public void setSanPham(ImageIcon sanPham) {
		SanPham = sanPham;
	}

	public ImageIcon getKhachHang() {
		return KhachHang;
	}

	public void setKhachHang(ImageIcon khachHang) {
		KhachHang = khachHang;
	}

	public ImageIcon getNhanVien() {
		return NhanVien;
	}

	public void setNhanVien(ImageIcon nhanVien) {
		NhanVien = nhanVien;
	}

	public ImageIcon getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(ImageIcon matKhau) {
		MatKhau = matKhau;
	}

	public ImageIcon getKetThuc() {
		return KetThuc;
	}

	public void setKetThuc(ImageIcon ketThuc) {
		KetThuc = ketThuc;
	}

	public ActionListener getaListener() {
		return aListener;
	}

	public ToolHeThongPanel() {
		setBackground(new Color(224, 255, 255));
		setLayout(null);
		initScreen();
	}
	public void	initScreen() {
		// add các nut button

		DanhMuc = new ImageIcon(
				new ImageIcon("icons8-sorting-48.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnDanhMuc = new JButton("Danh Mục", DanhMuc);
		btnDanhMuc.setBounds(0, 0, 110, 92);
		btnDanhMuc.setVerticalTextPosition(JButton.BOTTOM);
		btnDanhMuc.setHorizontalTextPosition(JButton.CENTER);
		add(btnDanhMuc);

		TuyChon = new ImageIcon(new ImageIcon("TuyChon.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnTuyChon = new JButton("Tùy Chọn", TuyChon);
		btnTuyChon.setBounds(110, 0, 110, 92);
		btnTuyChon.setVerticalTextPosition(JButton.BOTTOM);
		btnTuyChon.setHorizontalTextPosition(JButton.CENTER);
		add(btnTuyChon);

		SanPham = new ImageIcon(new ImageIcon("SanPham.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnSanPham = new JButton("Sản phẩm", SanPham);
		btnSanPham.setBounds(220, 0, 110, 92);
		btnSanPham.setVerticalTextPosition(JButton.BOTTOM);
		btnSanPham.setHorizontalTextPosition(JButton.CENTER);
		add(btnSanPham);

		KhachHang = new ImageIcon(new ImageIcon("khachHang.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnKhachHang = new JButton("Khách Hàng ", KhachHang);
		btnKhachHang.setBounds(330, 0, 110, 92);
		btnKhachHang.setVerticalTextPosition(JButton.BOTTOM);
		btnKhachHang.setHorizontalTextPosition(JButton.CENTER);
		add(btnKhachHang);

		NhanVien = new ImageIcon(new ImageIcon("NhanVien.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnNhanVien = new JButton("Nhân Viên", NhanVien);
		btnNhanVien.setBounds(440, 0, 89, 92);
		btnNhanVien.setVerticalTextPosition(JButton.BOTTOM);
		btnNhanVien.setHorizontalTextPosition(JButton.CENTER);
		add(btnNhanVien);

		MatKhau = new ImageIcon(new ImageIcon("icons8-lock-48.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnMatKhau = new JButton("Mật Khẩu", MatKhau);
		btnMatKhau.setBounds(529, 0, 89, 92);
		btnMatKhau.setVerticalTextPosition(JButton.BOTTOM);
		btnMatKhau.setHorizontalTextPosition(JButton.CENTER);
		add(btnMatKhau);

		KetThuc = new ImageIcon(new ImageIcon("icons8-export-48.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnKetThuc = new JButton("Kết Thúc ", KetThuc);
		btnKetThuc.setBounds(618, 0, 89, 92);
		btnKetThuc.setVerticalTextPosition(JButton.BOTTOM);
		btnKetThuc.setHorizontalTextPosition(JButton.CENTER);
		add(btnKetThuc);

		btnMatKhau.addActionListener(aListener);
		btnKetThuc.addActionListener(aListener);
		btnDanhMuc.addActionListener(aListener);
		btnTuyChon.addActionListener(aListener);
		btnSanPham.addActionListener(this);
		btnKhachHang.addActionListener(this);
		btnNhanVien.addActionListener(this);
	}
	
	public void setaListener(ActionListener aListener) {
		this.aListener = aListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
