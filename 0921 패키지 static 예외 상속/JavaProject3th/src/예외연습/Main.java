package 예외연습;

public class Main {
	public static void main(String[] args) {
		
		
		int num = 100;
		int divisor = 0;
		System.out.println("나누기직전");
		try {
			System.out.println(num/divisor);
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("실행됨?");
		

			
		
	}
}
