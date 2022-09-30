package 정석스태틱;

public class Singleton {
	private static Singleton one;
	
	private Singleton() {	
		//이 클래스를 벗어나는순간 이 설계도대로 찍어낼수가 없게된다. 
		//이 클래스에서만 이 클래스의 인스턴스를 만들 수 있게된거다.
		System.out.println("인스턴스 생성됨");
	}
	
	public static Singleton getInstance() {
		if(one==null) {
			System.out.println("기존에 인스턴스가 없음");
			one = new Singleton();
		}
		else {
			System.out.println("이미 있음");
		}
		return one;
	}
}
