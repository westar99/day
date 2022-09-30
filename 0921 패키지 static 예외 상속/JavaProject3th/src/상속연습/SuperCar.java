package 상속연습;

public class SuperCar extends Car{

	public SuperCar(String name, int maxSpeed) {
		super(name, maxSpeed);
	}
	
	//없던 함수 추가
	public void turboOn() {
		System.out.println("터보엔진 작동!!!!~~");
		setPresentSpeed(getPresentSpeed()+60);
	}
	
	//있는 함수 오버라이딩. Car에 정의된 horn()함수를 덮어썼다.
	@Override
	public void horn() {
		System.out.println("우르르릉 길을 비켜라");
	}

}
