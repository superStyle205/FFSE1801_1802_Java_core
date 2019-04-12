import controller.ManagerPersonController;

/**
 * Main class for run program.
 * 
 * @author Thang Tran
 */
public class MainClass {

	public static void main(String... args) {
		ManagerPersonController managerPersonController = new ManagerPersonController();
		managerPersonController.loadProgram();
	}

}
