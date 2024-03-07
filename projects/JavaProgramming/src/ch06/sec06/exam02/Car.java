package ch06.sec06.exam02;

public class Car {
	//필드 선언(객체에 포함되는 데이터 선언)
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed = 250;
	int speed;
	
	//생성자 선언
	Car() {
		model = "Grandeur";
		color = "Black";
	}
	
	//메서드 선언
	void run() {
		speed = 60;
	}
}
