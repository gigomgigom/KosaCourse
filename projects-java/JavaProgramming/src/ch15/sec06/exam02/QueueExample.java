package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> que = new LinkedList<>();
		
		que.offer(new Message("sendMail", "홍길동"));
		que.offer(new Message("sendSMS", "신용권"));
		que.offer(new Message("sendKakaotalk", "심영조"));
		
		while(!que.isEmpty()) {
			Message message = que.poll();
			switch(message.command) {
			case "sendMail" : System.out.println(message.to + "님에게 메일을 보냅니다."); break;
			case "sendSMS" : System.out.println(message.to + "님에게 SMS를 보냅니다."); break;
			case "sendKakaotalk" : System.out.println(message.to + "님에게 카톡을 보냅니다."); break;
			}
		}

	}

}
