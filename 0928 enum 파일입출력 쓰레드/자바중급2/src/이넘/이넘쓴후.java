package 이넘;

enum Day{
	월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
}

public class 이넘쓴후 {
	public static void main(String[] args) {
		Day day = Day.월요일;
		switch(day) {
			case 월요일:
				System.out.println("월요일");
				break;
			case 화요일:
				System.out.println("화요일");
				break;
			case 수요일:
				System.out.println("수요일");
				break;
			case 목요일:
				System.out.println("목요일");
				break;
			case 금요일:
				System.out.println("금요일");
				break;
			case 토요일:
				System.out.println("토요일");
				break;
			case 일요일:
				System.out.println("일요일");
				break;

		}
	}


}
