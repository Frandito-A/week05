package codingAssignment05;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("Jesus");
		System.out.println(" ");
		logger.error("Jesus");
		
		System.out.println(" ");
		
		Logger logger1 = new SpacedLogger();
		logger1.log("hello");
		logger1.error("hello");
		

	}

}
