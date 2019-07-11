package mainChayChuongTrinh;

import model.bean.bo.UserBo;
import model.bean.bo.UserBoImpl;
import view.LoginFrame;

public class main {
	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame(new UserBoImpl());
		frame.setVisible(true);
	}
}
