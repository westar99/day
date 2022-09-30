package firstJavaProject;

public class 함수기초 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 결과값 = add(2,3);
		int 결과값2 = minus(2,3);
		int 결과값3 = add(1,5,9);
		int 결과값4 = divide(10, 3);
		double 결과값5 = divide(10.0, 3.0);	//3으로바꿔도 자동형변환
		System.out.println(결과값);
		System.out.println(결과값2);
		System.out.println(결과값3);
		System.out.println(결과값4);
		System.out.println(결과값5);
		int 큰수1 = 2000000000;	//20억;
		int 큰수2 = 147483648;	//1억4천7백만;
		//int의 한계= 2,147,483,648
		System.out.println(add(큰수1, 큰수2));
	}
	
//	  접근제한자 리턴타입 메소드명(인자타입 인자명, 인자타입 인자명...){
//		    함수본문;
//		    리턴타입 void가 아닐경우 리턴문;
//		  }
	//add
	public static int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//오버로딩. 
	//같은 이름의 함수가 여러개 있더라도 매개변수가 달라지면 다르게 호출되는 기능
	public static int add(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}
	
	//minus
	public static int minus(int a, int b) {
		return a-b;
	}
	//multiple
	public static int multiple(int a, int b) {
		return a*b;
	}
	//divide
	public static int divide(int a, int b) {
		System.out.println(a/b);
		//인트와 인트를 나누면 인트를 리턴하는구나.
		//더블과 더블을 나누면 더블을 리턴하는구나  2.6666666666666665
		//플롯과 플롯을 나누면 플롯을 리턴하는구나. 2.6666667
		return (int) (a/b);
	}
	
	public static double divide(double a, double b) {
		return a/b;
	}
	

}
