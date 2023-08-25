package day07;

public class TV {
	// TV Ŭ������ ������� (�� TV�� ���¸� ��Ÿ���� ����)
	// - ä��(channel)
	// - ����ä��(prevChannel)
	// - ����(volumn)
	// - ����(isPowerOn)
	
	// �� �ν��Ͻ�(�� ��ü)���� �ٷ� �� �ִ� ���� Ŭ������ ����(�������)�� ����Ѵ�.
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 100;
	
	// �⺻ ������ : ä�� 7, ���� 20�� ����
	
	// TV���
	// -isPowerOn ���� true�� false, false�� true ����
	
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
		System.out.println("���� : "+isPowerOn);
		System.out.println("ä�� : "+channel);
		System.out.println("���� : "+volumn);
		System.out.println("����� ����ä�� : "+prevChannel);
		System.out.println();
		
	}
}
