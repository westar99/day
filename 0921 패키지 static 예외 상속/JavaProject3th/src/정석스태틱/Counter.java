package 정석스태틱;

//이 클래스가 한번 불릴때마다 1씩 증가
public class Counter {
	static int count = 0;	
	//static이 없으면 인스턴스들 마다 0으로 초기화한다.
	//static이 있으면 1개가 만들어져서 공유가된다.
	
	public Counter() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}
