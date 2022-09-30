
public class 프로그래머 {
	private String name;
	private int age;	//음수불가. 200살넘는거 불가
	private String gender;
	double 연차;
	String 주언어 = "자바";
	private String 현직장 = "휴먼";
		
	//생성자 = 이 설계도대로 인스턴스를 생성할때 호출하는 놈
	public 프로그래머(String name, String 주언어) {
		this.name = name;
		this.주언어 = 주언어;
	}
	
	public 프로그래머(String name) {
		this.name = name;
	}
	
	public void 쿼리작성() {
		System.out.println(name+"이 쿼리를 작성합니다.");
	}
	
	public boolean 자바함수작성(String functionName) {
		System.out.println(name+"이 자바의 함수를 작성합니다.");
		return false;
		
	}
	
	public boolean 자바설치(int version) {
		System.out.printf("%s이(가) 자바버전 %d를 설치합니다.", name, version);
		return false;
	}
	
	public String get현직장() {
		return this.현직장;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		if(gender.equals("남성")||gender.equals("여성")) {
			this.gender = gender;
		}else {
			System.out.println("잘못된 성별을 입력했습니다.");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age<0 || age>=200) {
			return ;
		}else {
			this.age = age;			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//우클릭 - 소스 - Generate Getters/Setters
}
