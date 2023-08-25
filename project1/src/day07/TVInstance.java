package day07;

public class TVInstance {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.getTvInfo();
		tv.channelUp();
		tv.getTvInfo();
		tv.turnOnTV();
		tv.getTvInfo();
		tv.channelDown();
		tv.getTvInfo();
		tv.moveChannel(80);
		tv.getTvInfo();
		tv.prevChannel();
		tv.getTvInfo();
	}
}
