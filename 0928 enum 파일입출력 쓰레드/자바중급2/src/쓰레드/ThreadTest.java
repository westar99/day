package 쓰레드;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable d1 = new CheckThread("딸기");
		Runnable d2 = new CheckThread("초코");
		Runnable d3 = new CheckThread("멜론");
		Runnable d4 = new CheckThread("망고");
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		Thread t4 = new Thread(d4);
		
		//run으로 바꾸면 하나의 인스턴스가 끝나야 다음꺼 실행
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
