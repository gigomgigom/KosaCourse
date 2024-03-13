package ch11.sec06;

public class InsufficientException extends Exception {
	InsufficientException() {
		
	}
	InsufficientException(String message) {
		super(message);
	}
}
