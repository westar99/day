package 상속연습;

public class 자동차경주장 {

	public static void main(String[] args) {
		SuperCar 람보르기니 = new SuperCar("Lamborghini", 360);
		System.out.println(람보르기니.getPresentSpeed());
		람보르기니.turboOn();
		System.out.println(람보르기니.getPresentSpeed());
		
		Car 그랜저 = new Car("grandeur", 260);
		//그랜저.turboOn(); 	//문법에러. 그랜저는 터보은 함수가 없다.
		그랜저.horn();
		람보르기니.horn();
	}

}
