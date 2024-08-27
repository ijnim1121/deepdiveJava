package javaEx04;

public interface RemoteControl {
	//상수
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	
	//추상메서드
	void turnOn();
	void turnOff();
	void setVolumn(int volumn);
	
	//디폴트메서드: 실행 블록이 있는 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	//정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
