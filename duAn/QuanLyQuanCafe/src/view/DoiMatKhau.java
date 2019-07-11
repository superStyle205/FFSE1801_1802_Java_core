package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.bean.bo.UserBo;
import model.bean.bo.UserBoImpl;

public class DoiMatKhau extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField taikhoanTF;
	private UserBo userBo = new UserBoImpl();

	private JFrame frame;

	private JPasswordField matKhauCuTF;
	private JPasswordField matKhauMoiTf;
	private JButton btniMtKhu;
	private JButton btnHy;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DoiMatKhau(JFrame frame) {
		this.frame = frame;
		setResizable(false);
		setUndecorated(true);
		setBounds(100, 100, 450, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		initScreen();
	}
	public void initScreen() {
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//	tiêu đề 	
		JLabel headTilte = new JLabel("Thay đổi mật khẩu");
		headTilte.setFont(new Font("Tahoma", Font.BOLD, 18));
		headTilte.setHorizontalAlignment(SwingConstants.CENTER);
		headTilte.setBounds(105, 53, 186, 22);
		panel.add(headTilte);

		//Jpanel Nhập đổi mật khẩu

		JLabel lblTaiKhoan = new JLabel("Tài Khoản     :");
		lblTaiKhoan.setBounds(82, 110, 85, 16);
		panel.add(lblTaiKhoan);

		taikhoanTF = new JTextField(10);
		taikhoanTF.setBounds(185, 107, 136, 22);
		panel.add(taikhoanTF);



		JLabel lblMtKhuMi = new JLabel("Mật khẩu cũ   :");
		lblMtKhuMi.setBounds(82, 162, 85, 16);
		panel.add(lblMtKhuMi);

		matKhauCuTF = new JPasswordField(15);		
		matKhauCuTF.setColumns(10);
		matKhauCuTF.setBounds(185, 159, 136, 22);
		panel.add(matKhauCuTF);

		JLabel lblNhpLiMt = new JLabel("Mật Khẩu mới  :");
		lblNhpLiMt.setBounds(82, 213, 85, 16);
		panel.add(lblNhpLiMt);

		matKhauMoiTf = new JPasswordField(15);
		matKhauMoiTf.setColumns(10);
		matKhauMoiTf.setBounds(185, 210, 136, 22);
		panel.add(matKhauMoiTf);


		btniMtKhu = new JButton("Lưu Thay đổi");
		btniMtKhu.setBounds(82, 296, 114, 25);
		panel.add(btniMtKhu);

		btnHy = new JButton("hủy");
		btnHy.setBounds(224, 296, 114, 25);
		panel.add(btnHy);



		btnHy.addActionListener(this);
		btniMtKhu.addActionListener(this);
		btnHy.addKeyListener(this);
		btniMtKhu.addKeyListener(this);
		taikhoanTF.setEditable(false);
		matKhauCuTF.addKeyListener(this);
		matKhauMoiTf.addKeyListener(this);

	}

	public JTextField getTaikhoanTF() {
		return taikhoanTF;
	}

	public void setTaikhoanTF(JTextField taikhoanTF) {
		this.taikhoanTF = taikhoanTF;
	}
	// event load data mật khẩu
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btniMtKhu) {
			LoadMatKhau();
		} else {
			frame.setEnabled(true);
			this.dispose();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == btnHy && e.getKeyCode() == KeyEvent.VK_ENTER) {
			frame.setEnabled(true);
			this.dispose();
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			LoadMatKhau();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	private void LoadMatKhau() {

		try {
			if (userBo.isExisUser(taikhoanTF.getText(), matKhauCuTF.getText())) {
				if (userBo.EditPassword(taikhoanTF.getText(), matKhauMoiTf.getText())) {

				}
				JOptionPane.showMessageDialog(null, "Thay đổi thành công ");
				frame.setEnabled(true);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, " mật khẩu không đúng nhập lại");
				matKhauCuTF.setText("");
				matKhauMoiTf.setText("");

			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	}

	public void setUserName(String username) {
		taikhoanTF.setText(username);
	}
}

