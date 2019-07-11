package view.component.panel;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import common.grouptable.ColumnGroup;
import common.grouptable.GroupableTableHeader;
import common.grouptable.JCustomTable;

public class SanPhamContentPanel extends JPanel {
	private JButton dongBo ;
	private JButton themNhom;
	private JButton suaNhom;
	private JButton xoaNhom;
	private JButton capNhap;
	private JButton luuSp;
	private JButton chuyenSp;
	private JButton xoaSp;
	private JPanel ContentSP;
	private JSplitPane splitPane;
	private JPanel panelLeft;
	private JTree tree;
	
	private JPanel panelRight;
	private JPanel panel;
	private JLabel lblShowHead;
	private JPanel panelTable;

	private JCustomTable sanPhamTable;

	public SanPhamContentPanel() {
		setLayout(new BorderLayout(0,0));

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

		luuSp = new JButton("Lưu SP ");
		headMenuButton.add(luuSp);

		chuyenSp = new JButton("Chuyển Tiếp");
		headMenuButton.add(chuyenSp);

		xoaSp = new JButton("Xóa SP");
		headMenuButton.add(xoaSp);
		
		ContentSP = new JPanel();
		add(ContentSP, BorderLayout.CENTER);
		ContentSP.setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		ContentSP.add(splitPane, BorderLayout.CENTER);
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
		
		lblShowHead = new JLabel("Hàng Hóa, Sản Phẩm, Dịch Vụ");
		panel.add(lblShowHead);
		
		panelTable = new JPanel();
		panelRight.add(panelTable, BorderLayout.CENTER);
		panelTable.setLayout(new BorderLayout(0, 0));
		
		DefaultTableModel sanPhamTableModel = new DefaultTableModel();
		sanPhamTableModel.addColumn("TT");
		sanPhamTableModel.addColumn("Mã");
		sanPhamTableModel.addColumn("Tên Hàng Hóa");
		sanPhamTableModel.addColumn("ĐVT");
		sanPhamTableModel.addColumn("Đơn Giá ");
		sanPhamTableModel.addColumn("Giảm ");
		sanPhamTableModel.addColumn("Đơn Giá ");
		sanPhamTableModel.addColumn("Giảm ");

		sanPhamTable = new JCustomTable(sanPhamTableModel);
		
		//sets width column
		sanPhamTable.setAutoResizeMode(JCustomTable.AUTO_RESIZE_OFF);

		sanPhamTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		sanPhamTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		sanPhamTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		sanPhamTable.getColumnModel().getColumn(3).setPreferredWidth(80);
		sanPhamTable.getColumnModel().getColumn(4).setPreferredWidth(140);
		sanPhamTable.getColumnModel().getColumn(5).setPreferredWidth(140);
		sanPhamTable.getColumnModel().getColumn(6).setPreferredWidth(200);
		sanPhamTable.getColumnModel().getColumn(7).setPreferredWidth(200);
		//Goup Column
		ColumnGroup MacDinhGroup = new ColumnGroup("Mặc định");
		MacDinhGroup.add(sanPhamTable.getColumn(4));
		MacDinhGroup.add(sanPhamTable.getColumn(5));
		sanPhamTable.addColumnGroup(MacDinhGroup);
		
		ColumnGroup phongLanh = new ColumnGroup("Phòng Lạnh");
		phongLanh.add(sanPhamTable.getColumn(6));
		phongLanh.add(sanPhamTable.getColumn(7));
		sanPhamTable.addColumnGroup(phongLanh);
		
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
		sanPhamTableModel.addRow(chuoi);
		
		
		
		JScrollPane panelSCroll = new JScrollPane(sanPhamTable);
		panelSCroll.setViewportView(sanPhamTable);
		panelTable.add(panelSCroll, BorderLayout.CENTER);
		
		
		
	}
}
