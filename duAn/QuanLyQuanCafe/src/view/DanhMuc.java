package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.bean.DonViTinhTable;
import model.bean.KhuVuc;
import model.bean.LoaiBangGiaCoffee;
import model.dao.DonViTinh;
import model.dao.DonViTinhImpl;
import model.dao.KhuVucDao;
import model.dao.KhuVucDaoImpl;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dao.banggia.BangGiaDao;
import model.dao.banggia.BangGiaDaolmpl;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DanhMuc extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JFrame jFrame;

	private CardLayout cardLayout = new CardLayout();
	private JPanel pnHeader;
	private JComboBox comboBox;
	private Item item = new Item();

	/// contenPanel

	private JPanel pnContenPanel;

	/// card 1

	private JPanel pnBangGia;
	private JPanel pnFooterBangGia;
	private JButton btnluuCard1;
	private JButton btnXoaCard1;
	private JButton btnSaoChepCard1;
	private JButton btnThoatBangGia;
	private JScrollPane scrollPane;
	private JTable tableBangGia;
	private JPanel ContentPanelBangGia;
	private JPanel panelAddData;	
	private JTextField txtTenKyHieu;
	private DefaultTableModel defaultTableModelTable1;
	/// card 2

	private JPanel pnKhuVuc;
	private JPanel pnFooterKhuVuc;
	private JButton btnLuuKhuVuc;
	private JButton btnXoaKhuVuc;
	private JButton btnThoatKhuVuc;
	private DefaultTableModel defaultTableModelTable2;
	/// card 3

	private JPanel pnDVT;
	private JPanel pnFooterDVT;
	private JButton btnLuuDVT;
	private JButton btnXoaDVT;
	private JButton btnThoatDVT;
	private JLabel lblkyHieu;
	private JLabel lblTnBngGi;
	private JTextField txtTenBangGia;
	private DefaultTableModel defaultTableModelTable3;

	BangGiaDao bangGiaDao = new BangGiaDaolmpl();
	KhuVucDao khuVucDao = new KhuVucDaoImpl();
	DonViTinh donViTinh = new DonViTinhImpl();

	private JButton btnThayDoi;
	private JPanel panel;
	private JPanel textPanel;
	private JTextField txtIdKhuVuc;
	private JLabel lblMaKhuVuc;
	private JLabel lblTenKhuVuc;
	private JTextField txtNameKhuVuc;
	private JScrollPane scrollPaneTableCard2;
	private JTable tableKhuVuc;
	private JButton btnSuaCard2;
	private JButton btnSuaCard3;
	private JPanel panel_Table_Card3;
	private JPanel panel_TXT;
	private JTextField textMaDVT;
	private JLabel lblMaDonViTinh;
	private JScrollPane scrollPane_Card3;
	private JTable tableCard3;

	public DanhMuc(JFrame jFrame) throws SQLException{
		super("Danh mục dữ liệu");
		this.jFrame = jFrame;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		initScreen();

	}
	public void initScreen() throws SQLException{



		/// header

		pnHeader = new JPanel();
		contentPane.add(pnHeader, BorderLayout.NORTH);
		pnHeader.setLayout(new BoxLayout(pnHeader, BoxLayout.X_AXIS));

		String arr[] = { "Bảng giá bán hàng", "Khu vực", "Đơn vị tính" };
		comboBox = new JComboBox<Object>(arr);
		pnHeader.add(comboBox);

		/// conten panel

		pnContenPanel = new JPanel();
		contentPane.add(pnContenPanel, BorderLayout.CENTER);
		pnContenPanel.setLayout(cardLayout);

		/// card 1

		pnBangGia = new JPanel();
		pnContenPanel.add(pnBangGia, "card1");
		pnBangGia.setLayout(new BorderLayout(0, 0));

		pnFooterBangGia = new JPanel();
		pnBangGia.add(pnFooterBangGia, BorderLayout.SOUTH);
		pnFooterBangGia.setLayout(new BoxLayout(pnFooterBangGia, BoxLayout.X_AXIS));

		btnluuCard1 = new JButton("Lưu");
		pnFooterBangGia.add(btnluuCard1);

		btnXoaCard1 = new JButton("Xóa");
		pnFooterBangGia.add(btnXoaCard1);

		btnThayDoi = new JButton("Thay đổi");
		pnFooterBangGia.add(btnThayDoi);

		btnSaoChepCard1 = new JButton("Sao chép");
		pnFooterBangGia.add(btnSaoChepCard1);

		btnThoatBangGia = new JButton("Thoát");
		pnFooterBangGia.add(btnThoatBangGia);

		ContentPanelBangGia = new JPanel();
		pnBangGia.add(ContentPanelBangGia, BorderLayout.CENTER);
		ContentPanelBangGia.setLayout(new BorderLayout(0, 0));

		panelAddData = new JPanel();

		ContentPanelBangGia.add(panelAddData, BorderLayout.SOUTH);
		panelAddData.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblkyHieu = new JLabel("tên ký hiệu");
		panelAddData.add(lblkyHieu);

		txtTenKyHieu = new JTextField();
		panelAddData.add(txtTenKyHieu);
		txtTenKyHieu.setColumns(10);

		lblTnBngGi = new JLabel("tên Bảng giá ");
		panelAddData.add(lblTnBngGi);

		txtTenBangGia = new JTextField();
		txtTenBangGia.setColumns(12);
		panelAddData.add(txtTenBangGia);

		scrollPane = new JScrollPane();
		ContentPanelBangGia.add(scrollPane, BorderLayout.CENTER);

		tableBangGia = new JTable();
		tableBangGia.addMouseListener(new MouseAdapter()  {
			// event mouse click column table 
			@Override
			public void mouseClicked(MouseEvent e) {
				// mouse click bảng giá
				int i = tableBangGia.getSelectedRow();
				TableModel model = tableBangGia.getModel();
				txtTenKyHieu.setText(model.getValueAt(i, 0).toString());
				txtTenBangGia.setText(model.getValueAt(i, 1).toString());

			}
		});
		tableBangGia.setModel(
				new DefaultTableModel(new Object[][] { 
				},
						new String[] { "Kí hiệu", "Tên bảng giá", "Mặc định", "Sao chép" })
				{

					private static final long serialVersionUID = 1L;
					@Override
					public Class getColumnClass (int column) {
						switch (column) {
						case 0:
							return String.class;
						case 1:
							return String.class;
						case 2:
							return Boolean.class;
						default:
							return Boolean.class;
						}
					}
				});
		LoadDataTableCard1();
		scrollPane.setViewportView(tableBangGia);

		/// card 2

		pnKhuVuc = new JPanel();
		pnContenPanel.add(pnKhuVuc, "card2");
		pnKhuVuc.setLayout(new BorderLayout(0, 0));

		pnFooterKhuVuc = new JPanel();
		pnKhuVuc.add(pnFooterKhuVuc, BorderLayout.SOUTH);
		pnFooterKhuVuc.setLayout(new BoxLayout(pnFooterKhuVuc, BoxLayout.X_AXIS));

		btnLuuKhuVuc = new JButton("Lưu");
		pnFooterKhuVuc.add(btnLuuKhuVuc);

		btnSuaCard2 = new JButton("Sửa");
		pnFooterKhuVuc.add(btnSuaCard2);

		btnXoaKhuVuc = new JButton("Xóa");
		pnFooterKhuVuc.add(btnXoaKhuVuc);

		btnThoatKhuVuc = new JButton("Thoát");
		pnFooterKhuVuc.add(btnThoatKhuVuc);

		panel = new JPanel();
		pnKhuVuc.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		textPanel = new JPanel();
		panel.add(textPanel, BorderLayout.SOUTH);
		textPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblMaKhuVuc = new JLabel("Id");
		textPanel.add(lblMaKhuVuc);

		txtIdKhuVuc = new JTextField();
		textPanel.add(txtIdKhuVuc);
		txtIdKhuVuc.setColumns(10);

		lblTenKhuVuc = new JLabel("Tên Khu Vực");
		textPanel.add(lblTenKhuVuc);

		txtNameKhuVuc = new JTextField();
		textPanel.add(txtNameKhuVuc);
		txtNameKhuVuc.setColumns(10);

		scrollPaneTableCard2 = new JScrollPane();
		panel.add(scrollPaneTableCard2, BorderLayout.CENTER);

		tableKhuVuc = new JTable();

		tableKhuVuc.addMouseListener(new MouseAdapter()  {
			// event mouse click column table 
			@Override
			public void mouseClicked(MouseEvent e) {
				// mouse click bảng giá
				int i = tableKhuVuc.getSelectedRow();
				TableModel model = tableKhuVuc.getModel();
				txtIdKhuVuc.setText(model.getValueAt(i, 0).toString());
				txtNameKhuVuc.setText(model.getValueAt(i, 1).toString());

			}
		});
		tableKhuVuc.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"mã", "Tên Cửa Hàng", ""
				})
		{
			private static final long serialVersionUID = 1L;
			@Override
			public Class<?> getColumnClass(int column) {
				switch (column) {
				case 0:
					return String.class;
				case 1:
					return String.class;
				default:
					return String.class;
				}
			}
		}
				);
		LoadDataTableCard2();
		scrollPaneTableCard2.setViewportView(tableKhuVuc);


		/// card 3

		pnDVT = new JPanel();
		pnContenPanel.add(pnDVT, "card3");
		pnDVT.setLayout(new BorderLayout(0, 0));

		pnFooterDVT = new JPanel();
		pnDVT.add(pnFooterDVT, BorderLayout.SOUTH);
		pnFooterDVT.setLayout(new BoxLayout(pnFooterDVT, BoxLayout.X_AXIS));

		btnLuuDVT = new JButton("Lưu");
		pnFooterDVT.add(btnLuuDVT);

		btnSuaCard3 = new JButton("Sửa");
		pnFooterDVT.add(btnSuaCard3);

		btnXoaDVT = new JButton("Xóa");
		pnFooterDVT.add(btnXoaDVT);

		btnThoatDVT = new JButton("Thoát");
		pnFooterDVT.add(btnThoatDVT);

		/// card layout
		pnContenPanel.add(pnBangGia, "card1");
		pnContenPanel.add(pnKhuVuc, "card2");
		pnContenPanel.add(pnDVT, "card3");

		panel_Table_Card3 = new JPanel();
		pnDVT.add(panel_Table_Card3, BorderLayout.CENTER);
		panel_Table_Card3.setLayout(new BorderLayout(0, 0));

		panel_TXT = new JPanel();
		panel_Table_Card3.add(panel_TXT, BorderLayout.SOUTH);
		panel_TXT.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblMaDonViTinh = new JLabel("Mã Đơn Vị Tính:");
		panel_TXT.add(lblMaDonViTinh);

		textMaDVT = new JTextField();
		panel_TXT.add(textMaDVT);
		textMaDVT.setColumns(10);

		scrollPane_Card3 = new JScrollPane();
		panel_Table_Card3.add(scrollPane_Card3, BorderLayout.CENTER);

		tableCard3 = new JTable();

		tableCard3.addMouseListener(new MouseAdapter() {

			// event mouse click column table 
			@Override
			public void mouseClicked(MouseEvent e) {
				// mouse click DVT
				int k = tableCard3.getSelectedRow();
				TableModel model = tableCard3.getModel();
				textMaDVT.setText(model.getValueAt(k, 0).toString());

			}
		});
		tableCard3.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"mã ĐVT", "Mặc Định"
				})
		{

			private static final long serialVersionUID = 1L;
			@Override
			public Class getColumnClass (int column) {
				switch (column) {
				case 0:
					return String.class;
				default:
					return Boolean.class;
				}
			}
		});
		LoadDataTableCard3();
		scrollPane_Card3.setViewportView(tableCard3);

		/// sự kiện
		btnThoatBangGia.addActionListener(this);
		btnThoatDVT.addActionListener(this);
		btnThoatKhuVuc.addActionListener(this);
		btnluuCard1.addActionListener(this);
		btnThayDoi.addActionListener(this);
		btnXoaCard1.addActionListener(this);
		btnLuuKhuVuc.addActionListener(this);
		btnSuaCard2.addActionListener(this);
		btnXoaKhuVuc.addActionListener(this);
		btnLuuDVT.addActionListener(this);
		btnSuaCard3.addActionListener(this);
		btnXoaDVT.addActionListener(this);
		comboBox.addItemListener(item);
	}
	//load table card1 
	public void LoadDataTableCard1() throws SQLException {
		BangGiaDao bangGiaDao = new BangGiaDaolmpl();
		ArrayList<LoaiBangGiaCoffee> listBangGia = bangGiaDao.getListTable();

		for(LoaiBangGiaCoffee loaiBangGiaCoffee : listBangGia) {
			Vector<String> rowBangGia = new Vector<String>();
			rowBangGia.add(loaiBangGiaCoffee.getId());
			rowBangGia.add(loaiBangGiaCoffee.getTenBG());

			defaultTableModelTable1 = (DefaultTableModel)tableBangGia.getModel();
			defaultTableModelTable1.addRow(rowBangGia);

		}
	}
	// load table card 2
	public void LoadDataTableCard2() throws SQLException {
		KhuVucDao khuVucDao  = new KhuVucDaoImpl();
		ArrayList<KhuVuc> listKhuVuc =  khuVucDao.getLisTable();

		for (KhuVuc khuVuc : listKhuVuc) {
			Vector<String> rowKhuVuc = new Vector<String>();
			rowKhuVuc.add(khuVuc.getMaKhuVuc());
			rowKhuVuc.add(khuVuc.getTenKhuVuc());

			defaultTableModelTable2 = (DefaultTableModel)tableKhuVuc.getModel();
			defaultTableModelTable2.addRow(rowKhuVuc);
		}
	}
	// load table card 3
	public void LoadDataTableCard3() throws SQLException {
		ArrayList<DonViTinhTable> listDVT = donViTinh.getListTable();

		for (DonViTinhTable donViTinhTable : listDVT) {
			Vector<String> rowDVT = new Vector<String>();
			rowDVT.add(donViTinhTable.getIdDVT());
			rowDVT.add(donViTinhTable.getMacDinh());

			defaultTableModelTable3 = (DefaultTableModel)tableCard3.getModel();
			defaultTableModelTable3.addRow(rowDVT);
		}
	}
	// event card
	@Override
	public void actionPerformed(ActionEvent e) {

		actionPerformedCard1(e);
		actionPerformedCard2(e);
		actionPerformedCard3(e);
	}

	//event Card1 
	public void actionPerformedCard1(ActionEvent e) {
		if (e.getSource() == btnThoatBangGia) {

			jFrame.setEnabled(true);
			this.dispose();
		} else if (e.getSource() == btnluuCard1) {
			// add data table 
			LoaiBangGiaCoffee addBangGia = new LoaiBangGiaCoffee();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (txtTenKyHieu.getText().equals("") || txtTenBangGia.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				addBangGia.setId(txtTenKyHieu.getText());
				addBangGia.setTenBG(txtTenBangGia.getText());
				try {
					bangGiaDao.addLoaiBangGia(addBangGia);
					JOptionPane.showMessageDialog(null, "thêm thành công");
					defaultTableModelTable1.setRowCount(0);
					LoadDataTableCard1();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} else if (e.getSource() == btnThayDoi ) {
			// edit table 
			LoaiBangGiaCoffee edit = new LoaiBangGiaCoffee();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (txtTenKyHieu.getText().equals("") || txtTenBangGia.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				edit.setId(txtTenKyHieu.getText());
				edit.setTenBG(txtTenBangGia.getText());

				try {
					bangGiaDao.editDataTable(edit);
					JOptionPane.showMessageDialog(null, "Sửa thành công");
					defaultTableModelTable1.setRowCount(0);
					LoadDataTableCard1();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} else if (e.getSource() == btnXoaCard1) {
			//delete table 
			LoaiBangGiaCoffee delete = new LoaiBangGiaCoffee();
			delete.setId(txtTenKyHieu.getText());
			try {
				bangGiaDao.deleteDataTable(delete);
				JOptionPane.showMessageDialog(null, "xóa thành công");
				defaultTableModelTable1.setRowCount(0);
				LoadDataTableCard1();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	//event Card 2
	public void actionPerformedCard2(ActionEvent e) {
		if (e.getSource() == btnThoatKhuVuc) {
			jFrame.setEnabled(true);
			this.dispose();
		} else if (e.getSource() == btnLuuKhuVuc) {

			// add data table 
			KhuVuc addTableKhuVuc = new KhuVuc();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (txtIdKhuVuc.getText().equals("") || txtNameKhuVuc.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				addTableKhuVuc.setMaKhuVuc(txtIdKhuVuc.getText());
				addTableKhuVuc.setTenKhuVuc(txtNameKhuVuc.getText());
				try {
					khuVucDao.addTableKhuVuc(addTableKhuVuc);
					JOptionPane.showMessageDialog(null, "thêm thành công");
					defaultTableModelTable2.setRowCount(0);
					LoadDataTableCard2();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		} else if (e.getSource() == btnSuaCard2) {
			// edit data table 
			KhuVuc editTableKhuVuc = new KhuVuc();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (txtIdKhuVuc.getText().equals("") || txtNameKhuVuc.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				editTableKhuVuc.setMaKhuVuc(txtIdKhuVuc.getText());
				editTableKhuVuc.setTenKhuVuc(txtNameKhuVuc.getText());
				try {
					khuVucDao.editTableKhuVuc(editTableKhuVuc);
					JOptionPane.showMessageDialog(null, "Sửa thành công");
					defaultTableModelTable2.setRowCount(0);
					LoadDataTableCard2();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}


		} else if (e.getSource() == btnXoaKhuVuc) {
			//delete table 
			KhuVuc delete = new KhuVuc();
			delete.setMaKhuVuc(txtIdKhuVuc.getText());
			try {
				khuVucDao.deleteDataTable(delete);
				JOptionPane.showMessageDialog(null, "xóa thành công");
				defaultTableModelTable2.setRowCount(0);
				LoadDataTableCard2();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	//event Card 3
	public void actionPerformedCard3(ActionEvent e) {
		if (e.getSource() == btnThoatDVT) {
			jFrame.setEnabled(true);
			this.dispose();
		} else if (e.getSource() == btnLuuDVT) {

			// add data table 
			DonViTinhTable addTableDonViTinh = new DonViTinhTable();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (textMaDVT.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				addTableDonViTinh.setIdDVT(textMaDVT.getText());
				try {
					donViTinh.addTableDonViTinh(addTableDonViTinh);
					JOptionPane.showMessageDialog(null, "thêm thành công");
					defaultTableModelTable3.setRowCount(0);
					LoadDataTableCard3();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		} else if (e.getSource() == btnSuaCard3) {
			// edit data table 
			DonViTinhTable editTableDVT = new DonViTinhTable();
			// bắt lỗi trường hợp để ký tự trắng( add data table)
			if (textMaDVT.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"không được để trống ");
			}else {
				editTableDVT.setIdDVT(textMaDVT.getText());
				try {
					donViTinh.editTableDonViTinh(editTableDVT);
					JOptionPane.showMessageDialog(null, "Sửa thành công");
					defaultTableModelTable3.setRowCount(0);
					LoadDataTableCard3();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}else if (e.getSource() == btnXoaDVT) {
			//delete table 
			DonViTinhTable delete = new DonViTinhTable();
			delete.setIdDVT(textMaDVT.getText());
			try {
				donViTinh.deleteTableDonViTinh(delete);
				JOptionPane.showMessageDialog(null, "xóa thành công");
				defaultTableModelTable3.setRowCount(0);
				LoadDataTableCard3();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public class Item implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == comboBox) {

				if (comboBox.getSelectedItem().equals("Bảng giá bán hàng")) {
					showCardWithName("card1");

				}
				if (comboBox.getSelectedItem().equals("Khu vực")) {

					showCardWithName("card2");

				}
				if (comboBox.getSelectedItem().equals("Đơn vị tính")) {

					showCardWithName("card3");
				}
			}
		}
	}

	public void showCardWithName(String cardName) {
		cardLayout.show(pnContenPanel, cardName);
	}
}
