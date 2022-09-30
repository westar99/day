package 상속연습;

public class Car {
	//alt shift a
	protected String name;
	protected String brand;
	protected int price;
	protected int maxSpeed=200;
	protected int presentSpeed=0;
	
	
	
	public Car(String name, int maxSpeed) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp(int howmuch) {
		presentSpeed+=howmuch;
	}
	public void speedDown(int howmuch) {
		presentSpeed-=howmuch;
	}
	public void horn() {
		System.out.println("빠아아아앙ㅇㅇ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPresentSpeed() {
		return presentSpeed;
	}

	public void setPresentSpeed(int presentSpeed) {
		this.presentSpeed = presentSpeed;
	}
	
	
	
	
}
