package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 객체를 생성
		Car car = new Car();
		
		//Car 객체의 필드값 변경
		car.model = "그랜저";
		car.start = true;
		car.speed = 60;
		
		//Car 객체 내부의 데이터 읽기
		System.out.println("모델명 : " + car.model);
		System.out.println("시동여부 : " + car.start);
		System.out.println("시동여부 : " + car.speed);
		System.out.println();
		
		//Car 객체를 생성
		Car yourCar = new Car();
		
		//Car 객체 내부의 데이터 읽기
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("시동여부 : " + yourCar.start);
		System.out.println("시동여부 : " + yourCar.speed);
	}

}
