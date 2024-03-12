package ch08.sltn.sltn5;

public class TV implements Remocon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon r = new TV();
		r.powerOn();
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("티비를 켭습니다.");
	}

}
