package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//첫번재 예외 발생
				System.out.println("array[" + i + "]: " + value);
				/*
				 * } catch(ArrayIndexOutOfBoundsException e) {
				 * System.out.println("배열 인덱스가 초과되었어요." + e.getMessage()); }
				 * catch(NumberFormatException e) { System.out.println("숫자로 변환될 수 없어요. " +
				 * e.getMessage()); }
				 */
			} catch(Exception e) {
				
			}
		}
	}
}
