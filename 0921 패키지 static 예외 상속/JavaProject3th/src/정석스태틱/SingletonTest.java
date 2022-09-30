package 정석스태틱;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		//다 똑같은 인스턴스다.

	}

}
