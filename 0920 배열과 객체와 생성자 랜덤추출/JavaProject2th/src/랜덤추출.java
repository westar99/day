
public class 랜덤추출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = {"차형주","박근태","문호준","김선형","정상필","오세영","박세웅","서선호","채제형","김승욱","홍승기","정민경","이용수"};
		//13명
		int 랜덤번호 = 0; 
		int 몇명 = 3;
		for(int i=0; i<몇명; i++) {
			랜덤번호 = (int) ((Math.random()*13));
			System.out.println(students[랜덤번호]);
		}
		
	}

}
