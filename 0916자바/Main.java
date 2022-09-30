package firstJavaProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		int a = 15;
		int b = 12;
		System.out.println(a+b);
		
		//기본자료형 8개
		//boolean
		//char
		//byte, short, int, long
		//float, double
		
		String cola = "cola";
		char c ='o';
		char r = 'ㄱ';
		char ra = '가';
		System.out.println(r);	//'ㄱ' 출력하고 한줄띄움  ln = line = 자기혼자 한줄. div같은놈
		System.out.println(ra);	//'가' 출력하고 한줄띄움
		System.out.print("하잇");	//"하잇"출력
		
		char x = 65;	//10진수로 65를 저장하고 문자로 출력
		System.out.printf("%c", x);	    //A   printf("형식, "값");  f는 format
		System.out.printf("%c", x+2);	//C
		System.out.printf("%c", x-1);	//@
	
		
		
		//String은 기본자료형이 아니다.
//		String str1 = "hello";
//		String str2 = "헬로";
//		System.out.println(str1+str2);
//		
//		if(a+b > 20) {
//			System.out.println("20보다 큽니다.");
//		}else {
//			System.out.println("20보다 작습니다.");
//		}
//		
//		for(int dan=2; dan<=9; dan++) {
//			for(int i=1; i<=9; i++) {
//				//System.out.println(dan + " * " +i+ " = " + i*dan);
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//				
//			}
//			System.out.println("");
//		}
//		%d : decimal. 정수(10진수)
//		%f : float. 소수점
//		%c : char. 문자
//		%s : string. 문자열
		
//		%e 또는 %E : 지수형식
//		%o : 8진수
//		%x 또는 %X : 16진수
//		%n : 줄바꿈

		
		double f1 = 0.5;
		double f2 = 0.6;
		if(f1+f2==1.1) {
			System.out.println("맞습니다.");
		}else {
			System.out.println("틀립니다.");
			System.out.println(f1+f2);
		}
		
		//퀴즈2. "내나이는 oo살이고 ooo ooo에 살고있습니다." 를 콘솔에 변수의 값을 사용해서 찍어보세요.
		//나이저장변수 데이터타입, 이름         주소저장변수 데이터타입, 이름
		int age = 35;
		String address = "서울시 영등포구 여의도동";
		System.out.printf("내 나이는 %d살이고 %s에 살고있습니다.", age, address);
	}

}
