package ch08.sec05;

public class Audio implements RemoteControl{

	public int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 오디오의 볼륨 : " + this.volume);
	}
	
	public int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			memoryVolume = volume;
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(memoryVolume);
		}
	}
}
