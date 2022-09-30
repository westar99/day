package firstJavaProject;

public class 함수기초문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번문제. 하나의단 출력
		//printDan(3);
		//System.out.println(sigma(5));
		//System.out.println(calcHypot(5,12));
		//printBigger(5,8,18);

		
	}
	
	//1. printDan(int dan)	//입력받은 단만 구구단 출력
	//2. isCola(String 음료)	
		//음료수이름에 콜라가 들어가있으면 true를 리턴
		//예) 제로콜라o, 펩시콜라o, 815콜라o,    맥콜x, 밀키스x
		//문자열 포함함수 :  문자열.contains("검색할문자열");
	//3. sigma(int 숫자) 
		//1부터 해당숫자까지 1씩 더하면서 모두를 합친수
	//4. calcHypot(가로, 세로)
		//삼각형의 빗변구하는 함수. 루트(가로제곱+세로제곱)
		//루트는 Math.sqrt()
	//5. printBigger(숫자1, 숫자2, 숫자3)
		//숫자1과 숫자2의 곱이 숫자3중 무엇이 더 큰지 출력
		//숫자1*숫자2를 앞에,   숫자3을 뒤에 출력
		//출력형태 : "40은 30보다 작습니다."

	public static void printDan(int dan) {
		for(int i=1; i<=9; i++) {	//9번반복
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public static boolean isCola(String bevName) {
		if(bevName.contains("콜라")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sigma(int lastNum) {
		if(lastNum <1) {
			return 0;
		}else {
			return lastNum + sigma(--lastNum);
		}
	}
	
	public static double calcHypot(int 가로, int 세로) {
		double 빗변제곱 = Math.pow(가로, 2) + Math.pow(세로, 2);
		return Math.sqrt(빗변제곱);
	}
	public static void printBigger(int num1, int num2, int crieria) {
		int sum = num1+num2;
		if(sum < crieria  ) {
			System.out.printf("합 %d은 %d보다 작습니다", sum, crieria);
		}else if(sum == crieria){
			System.out.printf("합 %d은 %d과 같습니다.", sum, crieria);
		}else {
			System.out.printf("합 %d은 %d보다 큽니다", sum, crieria);
		}
	}
	


	
	
		
}
