package ch06.sec08.exam02;

public class Computer {
	//Define Field
	
	//Define Constructor
	
	//Define Method
	int sum1(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		/*
		for(int i = 0; i < values.length; i++) {
			result += values[i];
		}
		 */
		
		return result;
	}
	int sum2(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		/*
		for(int i = 0; i < values.length; i++) {
			result += values[i];
		}
		 */
		
		return result;
	}
}
