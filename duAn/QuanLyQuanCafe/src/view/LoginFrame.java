package view;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import model.bean.bo.UserBo;
import model.bean.bo.UserBoImpl;
import model.dao.ConnectUtil;
import view.component.panel.FooterPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ComponentColorModel;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame implements ActionListener,KeyListener{
	private static final long serialVersionUID = 1L;
	private JLabel bannerImage;
	private JLabel bannerImage2;

	private JLabel lblLogin;
	private JLabel lblUserName;
	private JLabel lblPassword;

	private JTextField tfUsername;
	private JPasswordField tfPassword;

	private JButton btnLogin;
	private JButton btnExit;

	private UserBo userBo;

	private JCheckBox showPassword; 

	//use Interface UserBo
	public LoginFrame(UserBo userBo) {
		this.setSize(600,460);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);


		//hide title bar
		this.setUndecorated(true);
		this.userBo = userBo;
		// init item in screen
		initScreen();

		CheckExitUser();
	}

	private void initScreen() {
		// tạo banner
		bannerImage = new JLabel(new ImageIcon("E:\\laptrinh\\java\\duan1\\QuanLyQuanCafe\\mau-logo-quan-cafe-dep.png"));
		bannerImage.setBounds(0, 0, 600, 300);
		bannerImage.setPreferredSize(new Dimension(514, 306));
		showPassword = new JCheckBox("Show password");

		//tao noi dung dang nhap
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 300, 600, 160);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font(lblLogin.getName(), Font.PLAIN, 25));
		lblLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(lblLogin);

		JPanel inputUserLogin = new JPanel();
		inputUserLogin.setLayout(new BoxLayout(inputUserLogin, BoxLayout.Y_AXIS));
		lblUserName = new JLabel("Username :");
		lblPassword = new JLabel("Password :");
		tfUsername = new JTextField(15);
		tfUsername.setText("admin");
		tfPassword = new JPasswordField(15);
		JPanel inputUserName = new JPanel();
		inputUserName.add(lblUserName);
		inputUserName.add(tfUsername);
		JPanel inputPassword = new JPanel();
		inputPassword.add(lblPassword);
		inputPassword.add(tfPassword);

		inputUserLogin.add(inputUserName);
		inputUserLogin.add(inputPassword);
		inputPassword.add(showPassword);
		mainPanel.add(inputUserLogin);
		//	showPassWord
		JPanel showPassworkPanel = new JPanel();
		showPassworkPanel.add(showPassword);
		showPassword.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == showPassword) {
					if (showPassword.isSelected()) {
						tfPassword.setEchoChar((char) 0);
					} else {
						tfPassword.setEchoChar('•');
					}
				}
			}
		});
		mainPanel.add(showPassworkPanel);

		tfUsername.addKeyListener(this);
		tfPassword.addKeyListener(this);

		//phan button login va EXIT

		JPanel actionPanel = new JPanel();
		btnLogin = new  JButton("Login");
		btnExit  = new JButton("Exit");
		actionPanel.add(btnLogin);
		actionPanel.add(btnExit);
		mainPanel.add(actionPanel);

		btnExit.addActionListener(this);
		btnLogin.addActionListener(this);

		btnLogin.addKeyListener(this);
		btnExit.addKeyListener(this);

		Container container = getContentPane();
		getContentPane().setLayout(null);
		bannerImage2 = new JLabel(new ImageIcon("E:\\laptrinh\\java\\duan1\\QuanLyQuanCafe\\61395549_1377341882413317_7678735680763068416_n.png"));
		bannerImage2.setBounds(462, 0, 153, 99);
		getContentPane().add(bannerImage2);
		bannerImage2.setPreferredSize(new Dimension(100, 50));
		container.add(bannerImage);	
		container.add(mainPanel);



	}

	public void isConnectDatabase() {
		try {
			ConnectUtil.connect();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this ,e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	} 
	public void CheckExitUser() {
		try {
			if (!userBo.isExisUser("admin")) {
				userBo.addNewAminAccount();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object action = e.getSource();
		if (action == btnLogin) {
			loadMainFrame();
		} else {
			this.dispose();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == btnExit && e.getKeyCode() == KeyEvent.VK_ENTER) {
			this.dispose();
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			loadMainFrame();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {


	}
	private void loadMainFrame () {
		try {
			if (userBo.isExisUser(tfUsername.getText(), tfPassword.getText())) {
				ViewMain ViewMain = new ViewMain();
				ViewMain.setUsername(tfUsername.getText());
				FooterPanel.jTtenTaiKhoan.setText(tfUsername.getText());
				ViewMain.setVisible(true);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Sai Username Hoặc password","ERROR", JOptionPane.ERROR_MESSAGE);
				tfUsername.setText("");
				tfPassword.setText("");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}	
}
