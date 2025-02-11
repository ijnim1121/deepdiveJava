package javaEx04;

public class SmartTV implements RemoteControl, Searchable {
	private int volumn;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");


	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");


	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn>RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else if(volumn<RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}else {
			////
		}
		System.out.println("현재 TV 볼륨 : " + this.volumn);

	}

}
