package naver;

public class Server {
	String 이름 = "네이버서버";
	int 최대유저수 = 100000000;	//1억
	int 현재유저수;
	int 하루광고비 = 100000000;
	
	public void serverOn() {
		System.out.println("서버를 켭니다.");
	}
	public void serverOff() {
		System.out.println("서버를 끕니다.");
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get최대유저수() {
		return 최대유저수;
	}
	public void set최대유저수(int 최대유저수) {
		this.최대유저수 = 최대유저수;
	}
	public int get현재유저수() {
		return 현재유저수;
	}
	public void set현재유저수(int 현재유저수) {
		this.현재유저수 = 현재유저수;
	}
	public int get하루광고비() {
		return 하루광고비;
	}
	public void set하루광고비(int 하루광고비) {
		this.하루광고비 = 하루광고비;
	}
	
	
}
