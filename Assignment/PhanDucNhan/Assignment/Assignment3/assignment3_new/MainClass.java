import controller.ManagerStudentController;

/**
 * Main class for run program.
 * 
 * @author Thang Tran
 */
public class MainClass {

	public static void main(String... args) {
		ManagerStudentController managerStudentController = new ManagerStudentController();
		managerStudentController.loadProgram();
	}

}
