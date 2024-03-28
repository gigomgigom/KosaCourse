package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
	
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int size = map.size();
		System.out.println("총 객체의 수 : " + size);
	
	}

}
