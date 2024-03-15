package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2024, 3, 15, 0, 0, 0);
		
		System.out.println("Start date : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 25, 0, 0, 0);
		System.out.println("Finish date : " + endDateTime);
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("continue");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("finish");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("equal");
		}
		
		long remainYears = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonths = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		
		long remainHours = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSeconds = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해 : " + remainYears);
		System.out.println("남은 월 : " + remainMonths);
		System.out.println("남은 일 : " + remainDays);
		System.out.println("남은 시 : " + remainHours);
		System.out.println("남은 분 : " + remainMinutes);
		System.out.println("남은 초 : " + remainSeconds);
		
		
	}

}
