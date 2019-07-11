package view.component.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class FooterPanel extends JPanel {
	private static final long serialVersionUID = 1L; 
	private JLabel lbtenTaiKhoan;
	public static JTextField jTtenTaiKhoan;
	private JTextField TxtNgay;
	private JTextField TxtTime;
	private DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	public FooterPanel() {
		setPreferredSize(new Dimension(Integer.MAX_VALUE, 25));
		setBackground(new Color(255, 204, 153));
		setLayout(null);
		initScreen();
	}
	public void initScreen() {
		lbtenTaiKhoan = new JLabel("Tên Tài Khoản : ");
		lbtenTaiKhoan.setBounds(0, 4, 96, 16);
		jTtenTaiKhoan = new JTextField();
		lbtenTaiKhoan.setBounds(0, 0, 100, 25);
		jTtenTaiKhoan.setBounds(103,0,100,25);


		add(lbtenTaiKhoan);
		add(jTtenTaiKhoan);

		TxtNgay = new JTextField();
		TxtNgay.setBounds(204, 0, 116, 25);
		add(TxtNgay);
		TxtNgay.setColumns(10);

		TxtTime = new JTextField();
		TxtTime.setColumns(10);
		TxtTime.setBounds(322, 0, 116, 25);
		add(TxtTime);
		//khóa JtextField
		jTtenTaiKhoan.setEditable(false);
		TxtNgay.setEditable(false);
		TxtTime.setEditable(false);
		// TIME
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				String time = timeFormat.format(date);
				TxtTime.setText(time);
			}
		};
		Timer timer = new Timer(1000, timerListener);
		// to make sure it doesn't wait one second at the start
		timer.setInitialDelay(0);
		timer.start();

		// DATE
		LocalDate localDate = LocalDate.now();
		TxtNgay.setText(DateTimeFormatter.ofPattern("dd/MM/yyy").format(localDate));
	}
	public JTextField getjTtenTaiKhoan() {
		return jTtenTaiKhoan;
	}
	public void setjTtenTaiKhoan(JTextField jTtenTaiKhoan) {
		this.jTtenTaiKhoan = jTtenTaiKhoan;
	}
}
