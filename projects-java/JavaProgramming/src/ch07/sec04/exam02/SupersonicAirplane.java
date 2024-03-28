package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	
	public FlyMode flyMode = FlyMode.NORMAL;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == FlyMode.SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else { //노멀일 경우
			super.fly(); //부모의 fly()메서드를 호출한다. 자식에서 재정의한 fly()메서드를 호출하는것이 아니다~
		}
	}
	
}
