package firstJavaProject;

public class 로또 {

	public static void main(String[] args) {
		
		for(int i=0; i<1000; i++) {
			int pick = pickOneNum();
			if(pick==1) {
				System.out.println("1뽑음");
			}else if (pick==45) {
				System.out.println("45뽑음");
			}else if (pick<=0 || pick > 45) {
				System.out.println("뽑히면 안될수가 뽑힘");
			}
		}	//반복문끝
	}	//메인함수끝
	
	
	public static int pickOneNum() {
		int randomNum=0;
		//문제의 포인트 : 0이상 1미만의 double로 어떻게 1이상 45이하의 정수를 만들까
		//1. Math.random();		  //0이상 1미만의 double
		//2. Math.random()*45	  //0이상 45미만의 double
		//3. Math.random()*45+1	  //1이상 46미만의 double
		//4. ??					  //1이상 46미만의 int
		randomNum = (int)(Math.random()*45)+1;
		//8이상 20미만의 int도 순식간에 할줄알아야한다.
		return randomNum;
	}

}
