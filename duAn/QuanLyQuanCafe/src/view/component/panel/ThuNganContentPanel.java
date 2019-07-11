package view.component.panel;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import common.grouptable.ColumnGroup;
import common.grouptable.JCustomTable;

public class ThuNganContentPanel extends JPanel {
	private JButton duLien ;
	private JButton capNhap;
	private JButton xoa;
	private JButton chuyen;
	private JButton ghep;
	private JButton thanhToan;
	private JButton xacNhan;
	private JCustomTable thuNganTable;
	private JPanel contentPanel;
	private JPanel headTittle;
	private JLabel lbltitleLabel;
	private JPanel TablePanel;

	public ThuNganContentPanel() {
		setLayout(new BorderLayout(0,0));
		initScreen();
	}
	public void initScreen() {
		JPanel headMenuButton = new JPanel();
		add(headMenuButton, BorderLayout.NORTH);
		headMenuButton.setLayout(new BoxLayout(headMenuButton,BoxLayout.X_AXIS));

		duLien = new JButton("Dữ Liệu");
		headMenuButton.add(duLien);

		capNhap = new JButton("Cập Nhập");
		headMenuButton.add(capNhap);

		xoa = new JButton("Xóa");
		headMenuButton.add(xoa);

		chuyen = new JButton("Chuyển");
		headMenuButton.add(chuyen);

		ghep = new JButton("Ghép");
		headMenuButton.add(ghep);

		thanhToan = new JButton("Thanh Toán ");
		headMenuButton.add(thanhToan);

		xacNhan = new JButton("Xác Nhận");
		headMenuButton.add(xacNhan);

		contentPanel = new JPanel();
		add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));

		headTittle = new JPanel();
		contentPanel.add(headTittle, BorderLayout.NORTH);
		headTittle.setLayout(new BoxLayout(headTittle, BoxLayout.X_AXIS));

		lbltitleLabel = new JLabel("Danh sách bàn phòng");
		headTittle.add(lbltitleLabel);

		TablePanel = new JPanel();
		contentPanel.add(TablePanel, BorderLayout.CENTER);

		//create table
		DefaultTableModel thuNganTableModel = new DefaultTableModel();
		thuNganTableModel.addColumn("TT");
		thuNganTableModel.addColumn("Số Bàn");
		thuNganTableModel.addColumn("Số CT");
		thuNganTableModel.addColumn("Số Món");
		thuNganTableModel.addColumn("Thiếu  ");
		thuNganTableModel.addColumn("Số Tiền ");
		thuNganTableModel.addColumn("Giờ Vào ");
		thuNganTableModel.addColumn("Thời Gian ");
		thuNganTableModel.addColumn("Số Khách ");
		thuNganTableModel.addColumn("Khách hàng ");
		thuNganTableModel.addColumn("Nhân Viên Phục Vụ ");
		thuNganTableModel.addColumn("Ghi Chú ");


		thuNganTable = new JCustomTable(thuNganTableModel);

		//		set do dai column
		thuNganTable.setAutoResizeMode(JCustomTable.AUTO_RESIZE_OFF);

		thuNganTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		thuNganTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		thuNganTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		thuNganTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		thuNganTable.getColumnModel().getColumn(4).setPreferredWidth(80);
		thuNganTable.getColumnModel().getColumn(5).setPreferredWidth(140);
		thuNganTable.getColumnModel().getColumn(6).setPreferredWidth(200);
		thuNganTable.getColumnModel().getColumn(7).setPreferredWidth(120);
		thuNganTable.getColumnModel().getColumn(8).setPreferredWidth(80);
		thuNganTable.getColumnModel().getColumn(9).setPreferredWidth(320);
		thuNganTable.getColumnModel().getColumn(10).setPreferredWidth(320);
		thuNganTable.getColumnModel().getColumn(11).setPreferredWidth(227);

		//Goup Column
		ColumnGroup chungTuGroup = new ColumnGroup("Chứng Từ");
		chungTuGroup.add(thuNganTable.getColumn(2));
		chungTuGroup.add(thuNganTable.getColumn(3));
		thuNganTable.addColumnGroup(chungTuGroup);

		ColumnGroup thucDonGroup = new ColumnGroup("Thực Đơn");
		thucDonGroup.add(thuNganTable.getColumn(4));
		thucDonGroup.add(thuNganTable.getColumn(5));
		thucDonGroup.add(thuNganTable.getColumn(6));
		thuNganTable.addColumnGroup(thucDonGroup);

		ColumnGroup khachHanhGroup = new ColumnGroup("Khách Hàng");
		khachHanhGroup.add(thuNganTable.getColumn(7));
		khachHanhGroup.add(thuNganTable.getColumn(8));
		khachHanhGroup.add(thuNganTable.getColumn(9));
		khachHanhGroup.add(thuNganTable.getColumn(10));
		thuNganTable.addColumnGroup(khachHanhGroup);

		//add row
		Vector<String> chuoi = new Vector<String>();
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		thuNganTableModel.addRow(chuoi);
		TablePanel.setLayout(new BorderLayout(0, 0));

		JScrollPane panelSCroll = new JScrollPane();
		panelSCroll.setViewportView(thuNganTable);
		TablePanel.add(panelSCroll);
	}

}
