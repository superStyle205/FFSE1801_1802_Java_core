package view.component.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

import common.grouptable.JCustomTable;
import model.bean.User;
import model.dao.UserDao;
import model.dao.UserDaoImpl;

public class NhanVienContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton dongBo ;
	private JButton themBP;
	private JButton suaBP;
	private JButton xoaBP;
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
	private UserDao userDao = new UserDaoImpl();
	private JCustomTable NhanVienTable;
	private static int idTemp = 2;
	private int id = 1;
	private DefaultTableModel NhanVienTableModel;

	public NhanVienContentPanel() throws SQLException {

		setLayout(new BorderLayout(0,0));
		initSceen();
	}
	public void initSceen() throws SQLException{
		JPanel headMenuButton = new JPanel();
		add(headMenuButton, BorderLayout.NORTH);
		headMenuButton.setLayout(new BoxLayout(headMenuButton,BoxLayout.X_AXIS));

		dongBo = new JButton("Đồng Bộ");
		headMenuButton.add(dongBo);

		themBP = new JButton("Thêm Nhóm");
		headMenuButton.add(themBP);

		suaBP = new JButton("Sữa nhóm");
		headMenuButton.add(suaBP);

		xoaBP = new JButton("Xóa Nhóm");
		headMenuButton.add(xoaBP);

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

		lblShowHead = new JLabel("Danh Sách Nhân Viên");
		panel.add(lblShowHead);

		panelTable = new JPanel();
		panelRight.add(panelTable, BorderLayout.CENTER);
		panelTable.setLayout(new BorderLayout(0, 0));

		NhanVienTableModel = new DefaultTableModel();
		NhanVienTableModel.addColumn("TT");
		NhanVienTableModel.addColumn("Mã");
		NhanVienTableModel.addColumn("Họ Tên");
		NhanVienTableModel.addColumn("Thu Ngân");
		NhanVienTableModel.addColumn("Kế Toán");
		NhanVienTableModel.addColumn("Đăng Nhập");
		NhanVienTableModel.addColumn("Mật Khẩu");
		NhanVienTableModel.addColumn("Điện Thoại ");
		NhanVienTableModel.addColumn("Địa Chỉ");
		NhanVienTableModel.addColumn("Tài Khoản");
		NhanVienTableModel.addColumn("Ngân hàng");
		NhanVienTableModel.addColumn("Số CMND");
		NhanVienTableModel.addColumn("Email");


		NhanVienTable = new JCustomTable(NhanVienTableModel);

		// sets width column 
		NhanVienTable.setAutoResizeMode(JCustomTable.AUTO_RESIZE_OFF);

		NhanVienTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		NhanVienTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		NhanVienTable.getColumnModel().getColumn(2).setPreferredWidth(140);
		NhanVienTable.getColumnModel().getColumn(3).setPreferredWidth(140);
		NhanVienTable.getColumnModel().getColumn(4).setPreferredWidth(140);
		NhanVienTable.getColumnModel().getColumn(5).setPreferredWidth(140);
		NhanVienTable.getColumnModel().getColumn(6).setPreferredWidth(200);
		NhanVienTable.getColumnModel().getColumn(7).setPreferredWidth(200);
		NhanVienTable.getColumnModel().getColumn(8).setPreferredWidth(200);
		NhanVienTable.getColumnModel().getColumn(9).setPreferredWidth(227);
		NhanVienTable.getColumnModel().getColumn(10).setPreferredWidth(227);
		NhanVienTable.getColumnModel().getColumn(11).setPreferredWidth(227);
		NhanVienTable.getColumnModel().getColumn(12).setPreferredWidth(227);
		//add row

		
		load();
		

		JScrollPane panelSCroll = new JScrollPane(NhanVienTable);
		panelSCroll.setViewportView(NhanVienTable);
		panelTable.add(panelSCroll, BorderLayout.CENTER);

	}
	private void index() {
		id = idTemp++;
	}
	private void load() throws SQLException {
		List<User> list = userDao.getStaff();
		for (User user : list) {
			Vector<Object> vector = new Vector<Object>();
			vector.add(id);
			vector.add(user.getMaNV());
			vector.add(user.getHoVaTen());
			vector.add(user.getIsThuNgan());
			vector.add(user.getIsKeToan());
			vector.add(user.getUserName());
			vector.add(user.getPassWord());
			vector.add(user.getDienThoai());
			vector.add(user.getDiaChi());
			NhanVienTableModel.addRow(vector);
			index();
		}
	}
	
}
