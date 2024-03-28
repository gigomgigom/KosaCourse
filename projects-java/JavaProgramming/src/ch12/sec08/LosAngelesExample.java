package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPM = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPM == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%s %d시 %d분 %d초", strAmPm, hour, minute, second);
	}

}
