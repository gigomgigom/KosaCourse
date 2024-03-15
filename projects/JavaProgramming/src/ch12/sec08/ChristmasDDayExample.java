package ch12.sec08;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChristmasDDayExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime christmas = LocalDateTime.of(now.getYear(), 12, 25, 0, 0, 0);
		
		long dday = now.until(christmas, ChronoUnit.DAYS);
		
		System.out.println("D - day : " + dday);
	}
}
