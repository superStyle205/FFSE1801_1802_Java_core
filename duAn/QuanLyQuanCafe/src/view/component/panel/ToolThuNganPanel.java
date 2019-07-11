package view.component.panel;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToolThuNganPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	//cac item cho cum thu ngan
	private JButton btnMauIn;
	private JButton btnMayIn;
	private JButton btnSoDo;
	private JButton btnDatBan;
	private JButton btnHoaDon;
	private JButton btnDoanhThu;
	private JButton btnThuChi;
	private JButton btnPhieuThu;
	private JButton btnPhieuChi;

	private ImageIcon MauIn;
	private ImageIcon MayIn;
	private ImageIcon SoDo;
	private ImageIcon DatBan;
	private ImageIcon HoaDon;
	private ImageIcon DoanhThu;
	private ImageIcon ThuChi;
	private ImageIcon PhieuThu;
	private ImageIcon PhieuChi;

	public ToolThuNganPanel() {
		setBackground(new Color(224, 255, 255));
		setLayout(null);
		initScreen();
	}
	public void initScreen() {
		//add button
		MauIn = new ImageIcon( new ImageIcon("MauIn.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnMauIn = new JButton("Mẫu in", MauIn);
		btnMauIn.setBounds(0, 0, 110, 92);
		btnMauIn.setVerticalTextPosition(JButton.BOTTOM);
		btnMauIn.setHorizontalTextPosition(JButton.CENTER);
		add(btnMauIn);

		MayIn = new ImageIcon(new ImageIcon("mayIn.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnMayIn = new JButton("Máy In", MayIn);
		btnMayIn.setBounds(110, 0, 110, 92);
		btnMayIn.setVerticalTextPosition(JButton.BOTTOM);
		btnMayIn.setHorizontalTextPosition(JButton.CENTER);
		add(btnMayIn);

		SoDo = new ImageIcon(new ImageIcon("SoDo.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnSoDo = new JButton("Sơ Đồ", SoDo);
		btnSoDo.setBounds(220, 0, 110, 92);
		btnSoDo.setVerticalTextPosition(JButton.BOTTOM);
		btnSoDo.setHorizontalTextPosition(JButton.CENTER);
		add(btnSoDo);

		DatBan = new ImageIcon(new ImageIcon("DatBan.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnDatBan = new JButton("Đặt Bàn", DatBan);
		btnDatBan.setBounds(330, 0, 110, 92);
		btnDatBan.setVerticalTextPosition(JButton.BOTTOM);
		btnDatBan.setHorizontalTextPosition(JButton.CENTER);
		add(btnDatBan);

		HoaDon = new ImageIcon(new ImageIcon("hoaDon.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnHoaDon = new JButton("Hóa Đơn", HoaDon);
		btnHoaDon.setBounds(440, 0, 89, 92);
		btnHoaDon.setVerticalTextPosition(JButton.BOTTOM);
		btnHoaDon.setHorizontalTextPosition(JButton.CENTER);
		add(btnHoaDon);

		DoanhThu = new ImageIcon(new ImageIcon("DoanhThu.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnDoanhThu = new JButton("Doanh thu", DoanhThu);
		btnDoanhThu.setBounds(529, 0, 101, 92);
		btnDoanhThu.setVerticalTextPosition(JButton.BOTTOM);
		btnDoanhThu.setHorizontalTextPosition(JButton.CENTER);
		add(btnDoanhThu);

		ThuChi = new ImageIcon(new ImageIcon("thuChi.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnThuChi = new JButton("Thu Chi ", ThuChi);
		btnThuChi.setBounds(630, 0, 89, 92);
		btnThuChi.setVerticalTextPosition(JButton.BOTTOM);
		btnThuChi.setHorizontalTextPosition(JButton.CENTER);
		add(btnThuChi);

		PhieuThu = new ImageIcon(new ImageIcon("phieuThu.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnPhieuThu = new JButton("Phiếu Thu ", PhieuThu);
		btnPhieuThu.setBounds(719, 0, 98, 92);
		btnPhieuThu.setVerticalTextPosition(JButton.BOTTOM);
		btnPhieuThu.setHorizontalTextPosition(JButton.CENTER);
		add(btnPhieuThu);

		PhieuChi = new ImageIcon(new ImageIcon("phieuChi.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		btnPhieuChi = new JButton("Phiếu Chi ", PhieuChi);
		btnPhieuChi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPhieuChi.setBounds(817, 0, 98, 92);
		btnPhieuChi.setVerticalTextPosition(JButton.BOTTOM);
		btnPhieuChi.setHorizontalTextPosition(JButton.CENTER);
		add(btnPhieuChi);
	}
}


