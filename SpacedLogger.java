package codingAssignment05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String str) {
		StringBuilder word = new StringBuilder();
		for(int i = 0;  i <str.length(); i++) {
			word.append(str.charAt(i)).append(" ");	
		}
		System.out.println(word.toString());
	}

	@Override
	public void error(String str) {
		StringBuilder word = new StringBuilder();
		for(int i = 0;  i <str.length(); i++) {
			word.append(str.charAt(i)).append(" ");	
		}
		System.out.println("ERROR: "+word.toString());
		
		
		
	}

}
