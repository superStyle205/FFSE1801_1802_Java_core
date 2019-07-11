package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import view.component.panel.FooterPanel;
import view.component.panel.HeaderPanel;
import view.component.panel.KhachHangContentPanel;
import view.component.panel.NhanVienContentPanel;
import view.component.panel.SanPhamContentPanel;
import view.component.panel.TabContentPanel;
import view.component.panel.ThuNganContentPanel;

import javax.swing.JTabbedPane;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ViewMain extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private HeaderPanel header;
	private TabContentPanel ContentPanel;
	private FooterPanel footer;
	private String username;
	private ActionListener actionListenerToolHeThong = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object action = e.getSource();
			if (action == header.getCardHeThong().getBtnMatKhau()) {
				DoiMatKhau doiMatKhau = new DoiMatKhau(ViewMain.this);
				doiMatKhau.setUserName(username);
				doiMatKhau.setVisible(true);
				doiMatKhau.setLocationRelativeTo(null);
				setEnabled(false);
				header.showCardWithName(HeaderPanel.CARD_DEFAULT);
				} else if (action == header.getCardHeThong().getBtnKetThuc()) {
				System.exit(0);
			} else if (action == header.getCardHeThong().getBtnDanhMuc()) {
				DanhMuc danhMuc;
				try {
					danhMuc = new DanhMuc(ViewMain.this);
					danhMuc.setVisible(true);
					danhMuc.setLocationRelativeTo(null);
					setEnabled(false);
					header.showCardWithName(HeaderPanel.CARD_DEFAULT);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else if (action == header.getCardHeThong().getBtnTuyChon()) {
				TuyChon tuyChon = new TuyChon(ViewMain.this);
				tuyChon.setVisible(true);
				tuyChon.setLocationRelativeTo(null);
				setEnabled(false);
				header.showCardWithName(HeaderPanel.CARD_DEFAULT);
			}
		}
	};

	public ViewMain() {
		super("Quản lý quán coffee");
		this.setSize(1500, 900);
		this.setLocationRelativeTo(null);
		initScreen();
	}

	private void initScreen() {
		Border border = BorderFactory.createLineBorder(Color.RED, 1);
		header = new HeaderPanel();
		header.getCardHeThong().getBtnMatKhau().addActionListener(actionListenerToolHeThong);
		header.getCardHeThong().getBtnKetThuc().addActionListener(actionListenerToolHeThong);
		header.getCardHeThong().getBtnKhachHang().addActionListener(actionListenerToolHeThong);
		header.getCardHeThong().getBtnNhanVien().addActionListener(actionListenerToolHeThong);
		header.getCardHeThong().getBtnDanhMuc().addActionListener(actionListenerToolHeThong);
		header.getCardHeThong().getBtnTuyChon().addActionListener(actionListenerToolHeThong);
		header.showCardWithName(HeaderPanel.CARD_DEFAULT);
		ContentPanel = new TabContentPanel();
		ContentPanel.add("thu ngân", new ThuNganContentPanel());


		footer = new FooterPanel();

		Container container = getContentPane();

		container.add(header, BorderLayout.NORTH);
		container.add(ContentPanel, BorderLayout.CENTER);
		container.add(footer, BorderLayout.SOUTH);

		header.getCardHeThong().getBtnSanPham().addActionListener(this);
		header.getCardHeThong().getBtnKhachHang().addActionListener(this);
		header.getCardHeThong().getBtnNhanVien().addActionListener(this);
	}

	public HeaderPanel getHeader() {
		return header;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == header.getCardHeThong().getBtnSanPham()) {
			ContentPanel.add("Sản Phẩm", new SanPhamContentPanel());
		} else if (e.getSource() == header.getCardHeThong().getBtnKhachHang()) {
			ContentPanel.add("Khách Hàng", new KhachHangContentPanel());
		}else if (e.getSource() == header.getCardHeThong().getBtnNhanVien()) {
			try {
				ContentPanel.add("Nhân Viên", new NhanVienContentPanel());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}