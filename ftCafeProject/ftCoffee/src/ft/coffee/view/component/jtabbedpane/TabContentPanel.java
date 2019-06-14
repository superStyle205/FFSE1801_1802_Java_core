package ft.coffee.view.component.jtabbedpane;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabContentPanel extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	private List<String> listTabName;

	public TabContentPanel() {
		setTabLayoutPolicy(SCROLL_TAB_LAYOUT);
		listTabName = new ArrayList<String>();
	}

	private boolean checkTabExist(String title) {
		boolean flgExist = false;
		for (int i = 0; i < listTabName.size(); i++) {
			if (listTabName.get(i).equals(title)) {
				flgExist = true;
				break;
			}
		}

		return flgExist;
	}

	@Override
	public void addTab(String title, Component component) {
		if (!checkTabExist(title)) {
			super.addTab(title, component);
			listTabName.add(title);
			if (listTabName.size() != 1) {
				setTabComponentAt(listTabName.size() - 1, new CustomTab(title));
			}
			setSelectedIndex(listTabName.size() - 1);
		} else {
			int index = -1;
			for (int i = 0; i < listTabName.size(); i++) {
				if (listTabName.get(i).equals(title)) {
					index = i;
					break;
				}
			}

			if (index != -1) {
				setSelectedIndex(index);
			}
		}
	}

	public void removeTab(String title) {
		// TODO dung de remove tab voi title name tuong ung
	}

	private class CustomTab extends JPanel {

		private static final long serialVersionUID = 1L;

		private JLabel lblTitleTab;
		private JButton btnCloseTab;

		public CustomTab(String title) {
			setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			setOpaque(false);

			lblTitleTab = new JLabel(title);
			btnCloseTab = new JButton(new ImageIcon("image/close.png"));
			btnCloseTab.setPreferredSize(new Dimension(15, 15));
			btnCloseTab.setOpaque(false);

			add(lblTitleTab);
			add(btnCloseTab);
		}
	}
}
