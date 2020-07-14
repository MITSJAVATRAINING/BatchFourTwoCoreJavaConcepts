package exceptionExamples;

public class AgeException extends Exception{

	String exceptionMessage;

	public AgeException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "AgeException [exceptionMessage=" + exceptionMessage + "]";
	}
	
	
	
	
}
