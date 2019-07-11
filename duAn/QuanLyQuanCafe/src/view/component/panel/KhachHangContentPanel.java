package view.component.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

import common.grouptable.ColumnGroup;
import common.grouptable.JCustomTable;

public class KhachHangContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton dongBo ;
	private JButton themNhom;
	private JButton suaNhom;
	private JButton xoaNhom;
	private JButton capNhap;
	private JButton luu;
	private JButton chuyen;
	private JButton xoa;
	private JPanel ContentKhachHang;
	private JSplitPane splitPane;
	private JPanel panelLeft;
	private JTree tree;
	private JPanel panelRight;
	private JPanel panel;
	private JLabel lblShowHead;
	private JPanel panelTable;

	private JCustomTable khachHangTable;

	public KhachHangContentPanel() {
		setLayout(new BorderLayout(0,0));
		initScreen();
	}
	public void initScreen() {
		JPanel headMenuButton = new JPanel();
		add(headMenuButton, BorderLayout.NORTH);
		headMenuButton.setLayout(new BoxLayout(headMenuButton,BoxLayout.X_AXIS));

		dongBo = new JButton("Đồng Bộ");
		headMenuButton.add(dongBo);

		themNhom = new JButton("Thêm Nhóm");
		headMenuButton.add(themNhom);

		suaNhom = new JButton("Sữa nhóm");
		headMenuButton.add(suaNhom);

		xoaNhom = new JButton("Xóa Nhóm");
		headMenuButton.add(xoaNhom);

		capNhap = new JButton("Cập Nhập");
		headMenuButton.add(capNhap);

		luu = new JButton("Lưu ");
		headMenuButton.add(luu);

		chuyen = new JButton("Chuyển");
		headMenuButton.add(chuyen);

		xoa = new JButton("Xóa");
		headMenuButton.add(xoa);

		ContentKhachHang = new JPanel();
		add(ContentKhachHang, BorderLayout.CENTER);
		ContentKhachHang.setLayout(new BorderLayout(0, 0));

		splitPane = new JSplitPane();
		ContentKhachHang.add(splitPane, BorderLayout.CENTER);
		splitPane.setOneTouchExpandable(true);


		panelLeft = new JPanel();
		splitPane.setLeftComponent(panelLeft);

		tree = new JTree();
		panelLeft.add(tree);

		panelRight = new JPanel();
		splitPane.setRightComponent(panelRight);
		panelRight.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		panelRight.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));

		lblShowHead = new JLabel("Danh Sách Khách hàng");
		panel.add(lblShowHead);

		panelTable = new JPanel();
		panelRight.add(panelTable, BorderLayout.CENTER);
		panelTable.setLayout(new BorderLayout(0, 0));

		DefaultTableModel KhachHangTableModel = new DefaultTableModel();
		KhachHangTableModel.addColumn("TT");
		KhachHangTableModel.addColumn("Mã");
		KhachHangTableModel.addColumn("Đơn Vị / Họ Tên");
		KhachHangTableModel.addColumn("Số thẻ");
		KhachHangTableModel.addColumn("Điện Thoại");
		KhachHangTableModel.addColumn("Địa chỉ  ");
		KhachHangTableModel.addColumn("Phải Thu ");
		KhachHangTableModel.addColumn("Phải Trả ");
		KhachHangTableModel.addColumn("Doanh thu");
		KhachHangTableModel.addColumn("Phải Trả ");
		KhachHangTableModel.addColumn("Đã Thu");
		KhachHangTableModel.addColumn("Đã Trả ");
		KhachHangTableModel.addColumn("Phải Thu ");
		KhachHangTableModel.addColumn("Phải Trả ");
		KhachHangTableModel.addColumn("Số Tài Khoản");
		KhachHangTableModel.addColumn("Ngân Hàng");
		KhachHangTableModel.addColumn("Mã số thuế  ");
		KhachHangTableModel.addColumn("Email ");
		KhachHangTableModel.addColumn("Ghi Chú");


		khachHangTable = new JCustomTable(KhachHangTableModel);
		// sets width column
		khachHangTable.setAutoResizeMode(JCustomTable.AUTO_RESIZE_OFF);

		khachHangTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		khachHangTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		khachHangTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(3).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(4).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(5).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(6).setPreferredWidth(200);
		khachHangTable.getColumnModel().getColumn(7).setPreferredWidth(200);
		khachHangTable.getColumnModel().getColumn(8).setPreferredWidth(200);
		khachHangTable.getColumnModel().getColumn(9).setPreferredWidth(227);
		khachHangTable.getColumnModel().getColumn(10).setPreferredWidth(227);
		khachHangTable.getColumnModel().getColumn(11).setPreferredWidth(227);
		khachHangTable.getColumnModel().getColumn(12).setPreferredWidth(227);
		khachHangTable.getColumnModel().getColumn(13).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(14).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(15).setPreferredWidth(140);
		khachHangTable.getColumnModel().getColumn(16).setPreferredWidth(200);
		khachHangTable.getColumnModel().getColumn(17).setPreferredWidth(120);
		khachHangTable.getColumnModel().getColumn(18).setPreferredWidth(120);
		//Goup Column
		ColumnGroup DauKyGroup = new ColumnGroup("Đầu Kỳ");
		DauKyGroup.add(khachHangTable.getColumn(7));
		DauKyGroup.add(khachHangTable.getColumn(8));
		khachHangTable.addColumnGroup(DauKyGroup);

		ColumnGroup PhatSinhGroup = new ColumnGroup("Phát sinh trong kỳ");
		PhatSinhGroup.add(khachHangTable.getColumn(9));
		PhatSinhGroup.add(khachHangTable.getColumn(10));
		PhatSinhGroup.add(khachHangTable.getColumn(11));
		PhatSinhGroup.add(khachHangTable.getColumn(12));
		khachHangTable.addColumnGroup(PhatSinhGroup);

		ColumnGroup CuoiKyGroup = new ColumnGroup("Cuối Kỳ");
		CuoiKyGroup.add(khachHangTable.getColumn(13));
		CuoiKyGroup.add(khachHangTable.getColumn(14));
		khachHangTable.addColumnGroup(CuoiKyGroup);		

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
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");
		chuoi.add("");

		KhachHangTableModel.addRow(chuoi);

		JScrollPane panelSCroll = new JScrollPane(khachHangTable);
		panelSCroll.setViewportView(khachHangTable);
		panelTable.add(panelSCroll, BorderLayout.CENTER);

	}
}
