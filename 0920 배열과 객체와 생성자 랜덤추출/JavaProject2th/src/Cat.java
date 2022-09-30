
public class Cat {
	//변수
	private String name;
	private int age;
	private double weight;
	private String kind;
	
	//생성자
	//함수처럼 보이지만 리턴타입이 없고, 이름이 클래스명과 같다.
	public Cat(String name, String kind) {
		//this = 이것 = 자기 = Cat클래스 = Cat클래스로 실체화된 인스턴스
		super();	//부모 = 이놈의 부모는 누군가? 특별히 Cat의 부모가 누구인지 명시해준적이 없다.
			//부모의 부모의 부모의... 더이상 부모가 없는 최종 조상. Object
			//super는 그거라 치고 super()는 뭔가?  Object();
			//최종조상의 인스턴스 하나를 생성.
			//왜? 나라는 존재를 생성하기 위해서. 조상이 없는 나는 존재할수가 없기 때문에
			//부모 인스턴스를 생성해주는 super()가 없으면 .class파일로 변환될때 자동생성
		this.name = name;
		this.kind = kind;
	}
	

	//getter, setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}

	//함수
	public void jump() {
		
	}
	
	
	public void walk() {
		
	}
	public void cry(String sound) {
		System.out.println("고양이가 웁니다."+sound);
	}
	
}
