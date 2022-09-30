package firstJavaProject;

public class 변수와스코프 {
	public static void main(String[] args) {
		
		int dan = 5;
		
		for(int i=0; i<10; i++) {
			int dan2 = 3;
			System.out.println(dan*i);
		}
		//System.out.println(dan2);
//		부모스코프에서 자식스코프의 변수를 참조할 수 없다.
//		자식스코프에서 부모스코프의 변수를 참조할 수 있다.
//		=> 변수의 스코프는 {가 열렸을때부터 }가 닫힐때까지 존재한다.
	}
	
	// Javascript의 let으로 했다면?
//	let dan = 5;
//	
//	for(let i=0; i<10; i++) {
//	    let dan2 = 3;
//	    console.log(dan*i);
//	}
//	console.log(dan2);	//부모에서 자식 참조 못한다.
//	console.log('hello');
	//답 : 5단찍고 dan2 is not defined 에러기때문에 hello안찍힘
	

	// Javascript의 var로 했다면?
//	var dan = 5;
//	
//	for(var i=0; i<10; i++) {
//	    var dan2 = 3;
//	    console.log(dan*i);
//	}
//	console.log(dan2);
//	console.log('hello');
	// var는 함수블록만 인정한다.	for의 블록은 없는취급돼서 3정상출력
	// 답 : 5단찍고  hello 찍음
}
