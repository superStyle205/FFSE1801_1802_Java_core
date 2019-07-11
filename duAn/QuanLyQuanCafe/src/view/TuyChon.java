package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import view.component.panel.heThong.tuyChon.treetable;

public class TuyChon extends JFrame implements ActionListener{


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JFrame jFrame;


	public TuyChon(JFrame jFrame) {
//		super("Tùy chọn phần mềm");
//		this.jFrame = jFrame;
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		setBounds(100, 100, 486, 660);
//		setLocationRelativeTo(null);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//
//		btnNewButton = new JButton("New button");
//		contentPane.add(btnNewButton, BorderLayout.SOUTH);
//		
//		btnNewButton.addActionListener(this);
		
		
		/// ccong ngu
		
		super("Tùy chọn phần mềm");
		
		List<String[]> content = new ArrayList<>();
		
		content.add(new String[] {"Tác Nghiệp"});
		content.add(new String[] {"Chỉ hiển thị hàng tồn", " "});
		content.add(new String[] {"Giao diện có giảm giá", " "});
		content.add(new String[] {"Tạo phiếu mới", " "});
		content.add(new String[] {"Mở khay tiền 1", " "});
		content.add(new String[] {"Mở khay tiền 2", " "});
		
		content.add(new String[] {"Dữ Liệu"});
		content.add(new String[] {"Định dạng nội tệ", " "});
		content.add(new String[] {"Định dạng ngoại tệ", " "});
		content.add(new String[] {"Định dạng số lượng", " "});
		content.add(new String[] {"Độ dài mã nhóm hàng", " "});
		content.add(new String[] {"Độ dài mã nhóm khách hàng", " "});
		content.add(new String[] {"Độ dài mã bộ phận", " "});
		content.add(new String[] {"Độ dài mã hàng", " "});
		content.add(new String[] {"Độ dài mã khách hàng", " "});
		content.add(new String[] {"Độ dài mã nhân viên", " "});
		content.add(new String[] {"Thuế VAT", " "});
		
		
		content.add(new String[] {"In Ấn"});
		content.add(new String[] {"Độ dài tên hàng", ""});
		content.add(new String[] {"In số lượng hàng", " "});
		content.add(new String[] {"Số lượng liên", " "});
		content.add(new String[] {"Khổ rộng giấy in", " "});
		content.add(new String[] {"Chiều dài giấy in", " "});
		content.add(new String[] {"Lề trái", " "});
		content.add(new String[] {"Lề phải", " "});
		content.add(new String[] {"Lề trên", " "});
		content.add(new String[] {"Lề dưới", " "});
		content.add(new String[] {"Chừa lề trái", " "});
		content.add(new String[] {"In thêm số dòng trống", " "});

		
		content.add(new String[] {"Quản Trị"});
		content.add(new String[] {"Thời gian kết nối lại CSDL", " "});
		content.add(new String[] {" Xem doanh số ", " "});
		
		treetable tree = new treetable(content);
		setSize(500,475);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane(tree.gettreetable());
		panel.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btnNewButton_1 = new JButton("Lưu");
		panel_1.add(btnNewButton_1);
		
		btnNewButton = new JButton("Xong");
		panel_1.add(btnNewButton);
		
		
		this.jFrame = jFrame;
		setResizable(false);
		setLocationRelativeTo(null);
		
		btnNewButton.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnNewButton) {

			jFrame.setEnabled(true);
			this.dispose();

		}

	}

}


