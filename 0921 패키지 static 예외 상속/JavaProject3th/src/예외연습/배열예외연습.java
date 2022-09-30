package 예외연습;

public class 배열예외연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//크기가 3개인 배열을 만들고
		//인덱스5에 접근해서 예외발생을 확인한 후
		//그 예외로 프로그램이 터지지 않도록 처리해보세요.
		String [] humans = {"빌게이츠", "스티브잡스", "엘빈토플러"};
		try {
			System.out.println(humans[5]);//ArrayIndexOutOfBoundsException	
		} catch (Exception e) {
			System.out.printf("접근하려는 객체의 크기는 %d입니다. %d이하의 수를 입력해주세요", humans.length, humans.length-1 );
		}
	}

}
