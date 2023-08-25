package day07;

public class TV {
	// TV 클래스의 멤버변수 (각 TV의 상태를 나타내는 변수)
	// - 채널(channel)
	// - 이전채널(prevChannel)
	// - 볼륨(volumn)
	// - 전원(isPowerOn)
	
	// 각 인스턴스(각 개체)마다 다룰 수 있는 값을 클래스의 변수(멤버변수)로 사용한다.
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 100;
	
	// 기본 생성자 : 채널 7, 볼륨 20을 생성
	
	// TV기능
	// -isPowerOn 값이 true면 false, false면 true 변경
	
	private int channel;
	private int prevChannel;
	private int volumn;
	private boolean isPowerOn;
	
	TV() {
		channel = 7;
		volumn = 20;
		isPowerOn = false;
	}
	
	public void turnOnTV() {
		isPowerOn = !isPowerOn;
	}
	
	public void volumeUp() {
		if (isPowerOn)
			volumn++;
	}
	
	public void volumeDown() {
		if (isPowerOn)
			volumn--;
	}
	
	public void channelUp() {
		if (isPowerOn) {
			prevChannel = channel;
			channel++;
		}
	}

	public void channelDown() {
		if (isPowerOn) {
			prevChannel = channel;
			channel--;
		}
	}
	
	public void moveChannel(int nextChannel) {
		if (isPowerOn) {
			prevChannel = channel;
			channel = nextChannel;
		}
	}
	
	public void prevChannel() {
		int temp;
		if (isPowerOn) {
			temp = channel;
			channel = prevChannel;
			prevChannel = temp;
		}
	}
	
	public void getTvInfo() {
		System.out.println("전원 : "+isPowerOn);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volumn);
		System.out.println("저장된 이전채널 : "+prevChannel);
		System.out.println();
		
	}
}
