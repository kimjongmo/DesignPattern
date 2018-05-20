
public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	

	private SystemSpeaker() {
		volume = 5;
	}
	
	
	//Singleton : 하나의 인스턴스만 생성하고 이 인스턴스만 돌려준다.
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			instance = new SystemSpeaker();
			System.out.println("인스턴스를 생성합니다");
		}else {
			System.out.println("생성된 인스턴스를 반환합니다");
		}
		
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
