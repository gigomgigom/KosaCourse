package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("Current time : " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("plus 1 year : " + result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("minus 2 months : " + result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(3);
		System.out.println("plus 3 days : " + result3.format(dtf));
	}

}
