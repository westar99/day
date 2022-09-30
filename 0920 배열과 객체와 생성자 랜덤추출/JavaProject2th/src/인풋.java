import java.util.Scanner;

public class 인풋 {

	public static void main(String[] args) {
		
		int inputNum;
		//inputNum = 키보드로부터 입력값;
		//1. Console클래스를 이용해서 받기-> 이클립스의 버그
	    //2. Scanner클래스를 이용해서 받기
//		System.out.print("홀수인지 짝수인지 판단할 숫자를 입력해주세요 : ");
//		Scanner scanner = new Scanner(System.in);
//		inputNum = scanner.nextInt();
//		if(isOdd(inputNum) == true) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
//		scanner.close();
		
		//System.out.println(isClearDivide());
		//System.out.println(getLength());
		//System.out.println(plus());
		System.out.println(sum());
	}
	
	public static boolean isOdd(int num) {
		if(num % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	// 숫자2개를 입력받아서 앞의수에서 뒤의수가 정수로 깔끔하게 나눠떨어지는수인지 판단
	public static boolean isClearDivide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나눠질 수를 입력해주세요");
		int 나눠질수 = sc.nextInt();
		System.out.println("나눌 수를 입력해주세요");
		int 나눌수 = sc.nextInt();
		sc.close();
		if(나눠질수 % 나눌수 ==0) {
			return true;
		}else {
			return false;
		}
	}
	

	// 문자열 하나를 입력받아서 공백을 포함한 문자열의 길이 출력
	public static int getLength() {
		String input="";
		Scanner sc = new Scanner(System.in);
		System.out.println("길이를 분석할 문자열을 입력해주세요 : ");
		//input = sc.next();    //공백을 기준으로 끊음
		input = sc.nextLine();	//라인을 기준으로 끊음
		
		return input.length();
	}
	
	// 숫자2개를 띄워쓰기로 한번에입력받아서 합치는 plus함수를 만들어보세요
	public static int plus() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sum = num1 + num2;
		return sum;
	}
	
	// 숫자가 몇개들어올지 모르지만 한줄에 공백으로 구분되어 입력되면 
	// 그것을 다 합치는 sum함수를 만들어보세요
	// 예) 2 5 9 11     이면 4개들어온거
	public static int sum() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int 이번에읽을수;

		//공백을 기준으로 하나씩 읽는데 정수이면 읽음
		System.out.println("더할 수들을 공백으로 구분해서 입력해주세요. 숫자가 아닌수가 들어오면 종료됩니다.");
		while(sc.hasNextInt()) {	//|| 다음에읽을토큰이줄띄움이라면
			이번에읽을수 =sc.nextInt();
			System.out.println("이번에읽을수 : "+이번에읽을수);
			sum+=이번에읽을수;
		}
		sc.close();
		System.out.println("계산된 합 : "+sum);
		return sum;
	}
}
