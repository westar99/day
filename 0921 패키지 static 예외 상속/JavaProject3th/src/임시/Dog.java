package 임시;

public class Dog {
	String name;
	int age;
	int weight;
	
	public void bark() {
		System.out.println("멍멍");
	}
	public void eat(먹이 meal) {
		System.out.println(meal.name+"을 먹습니다.");
	}
}
