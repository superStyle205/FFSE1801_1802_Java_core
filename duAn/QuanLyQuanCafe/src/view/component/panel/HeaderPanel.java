package view.component.panel;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	public static final String CARD_HE_THONG = "cardHeThong";
	public static final String CARD_THU_NGAN = "cardThuNgan";
	public static final String CARD_DEFAULT = "cardDefault";

	// controll item
	private JButton btnHeThong;
	private JButton btnThuNgan;
	private CardLayout mCardLayout;
	private JPanel toolContentPanel;
	private ToolHeThongPanel CardHeThong;
	private ToolThuNganPanel CardThuNgan;
	private DefaultPanel defaultPanel;

	public HeaderPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setPreferredSize(new Dimension(Integer.MAX_VALUE, 128));
		// phan tab
		initTabButtonView();

		// phan menu item
		initToolItemView();
	}

	public void initTabButtonView() {
		JPanel tabButtonPanel = new JPanel();
		btnHeThong = new JButton("Hệ Thống");
		btnThuNgan = new JButton("Thu Ngân");

		btnHeThong.addActionListener(this);
		btnThuNgan.addActionListener(this);

		tabButtonPanel.add(btnHeThong);
		tabButtonPanel.add(btnThuNgan);
		tabButtonPanel.setMaximumSize(new Dimension(190, 10));
		tabButtonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

		this.add(tabButtonPanel);
	}

	public void initToolItemView() {
		CardHeThong = new ToolHeThongPanel();
		CardThuNgan = new ToolThuNganPanel();
		defaultPanel = new DefaultPanel();

		mCardLayout = new CardLayout();
		toolContentPanel = new JPanel();

		toolContentPanel.setLayout(mCardLayout);
		toolContentPanel.add(defaultPanel, CARD_DEFAULT);
		toolContentPanel.add(CardHeThong, CARD_HE_THONG);
		toolContentPanel.add(CardThuNgan, CARD_THU_NGAN);

		this.add(toolContentPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object action = e.getSource();
		if (action == btnHeThong) {
			showCardWithName(CARD_HE_THONG);
		} else if (action == btnThuNgan) {
			showCardWithName(CARD_THU_NGAN);
		}
	}

	public void showCardWithName(String CardName) {
		mCardLayout.show(toolContentPanel, CardName);
	}

	public ToolHeThongPanel getCardHeThong() {
		return CardHeThong;
	}

	public void setCardHeThong(ToolHeThongPanel cardHeThong) {
		CardHeThong = cardHeThong;
	}
}
