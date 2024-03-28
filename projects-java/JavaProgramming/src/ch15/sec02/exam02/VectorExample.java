package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ch15.sec02.exam01.Board;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					list.add(new Board(i, "제목", "내용", "글쓴이", new Date()));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i = 1000; i < 2000; i++) {
					list.add(new Board(i, "제목", "내용", "글쓴이", new Date()));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		//main 스레드를 threadA와 threadB가 종료될때까지 기다리게 함.
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size = list.size();
		System.out.println(size);
	}

}
