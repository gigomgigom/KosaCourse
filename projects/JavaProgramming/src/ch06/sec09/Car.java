package ch06.sec09;

public class Car {

		// TODO Auto-generated method stub
		static String company = "현대자동차";
		String model;
		int speed;
		
		Car(String model) {
			this.model = model;
		}
		
		 static void info() {
			System.out.println(company + "가 설계한 자동차");
			System.out.println();
			//this.model = "그랜져"; 인스턴스 멤버인 model이 
		}
		 void setSpeed(int speed) {
			 this.speed = speed;
		 }
		 
		 void run() {
			 setSpeed(100);
			 System.out.println(this.model + "가 달립니다.(시속: " + this.speed + " )"); //this를 붙이는 의미에 대해서 생각을 해보자
		 }
}
