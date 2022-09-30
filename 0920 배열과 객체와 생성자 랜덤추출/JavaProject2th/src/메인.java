
public class 메인 {

	public static void main(String[] args) {
		
		
		프로그래머 steveJobs = new 프로그래머("시티브잡스", "자바");
		steveJobs.setAge(65);
		
		프로그래머 billGates = new 프로그래머("빌게이츠", "C#");
		billGates.name = "빌게이츠";
		billGates.setAge(67);
		System.out.println("빌게츠의 나이 : "+billGates.getAge());

		프로그래머 hongseunggi = new 프로그래머("홍승기");
		//System.out.println(hongseunggi.현직장);
		System.out.println(hongseunggi.get현직장());
		//오버로딩
		//private으로 선언된 변수를 그 클래스 외부에서 어떻게 가져올수있는지
			
		System.out.println(billGates.getGender());
		//private으로 선언된 변수의 값을 외부에서 바꿀수 있을까
		billGates.setGender("남성");
		System.out.println(billGates.getGender());
		
		//변수를 public으로 만들어서 외부에서 접근가능하도록 하면 객체.속성으로
		//쉽게 코딩할수 있는데 왜 private으로 만들고 public 메소드로 귀찮게 했을까?
		//값을 변경할수있게 만든 함수가 public으로 돼있으면 누구나 그 값을 변경할수있는데
		//값 자체를 public하게 만든것과 뭐가 다른데?
	}

}
