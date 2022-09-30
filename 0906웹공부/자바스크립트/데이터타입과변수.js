
//자바스크립트의 원시형데이터타입 5개
//undefined(정의되지않음), null, Boolean, number, string

console.log(typeof("hi"));  //string
console.log(typeof(100));  //number
console.log(typeof(3.141592));  //number
console.log(typeof("100"));  //string
var a;
console.log(typeof(a));  //undefined
var b = "hi";
console.log(typeof(b));  //string
console.log(typeof(null));  //object
        //자바스크립트의 버그. 지금 고쳐버리면 사회가 망가져서
console.log(typeof(true));  //boolean

var 변수1 = 513;
변수1 = "갑자기 변경";
console.log(typeof(변수1));

// 자바에서는 실행도 못함
// int 변수2 = 513;
// 변수2 = "갑자기변경";


let num1 = 123;
let num2 = 45;
num2 += 4;              //num2 = num2 + 4;
console.log(num2);

let 변수3 = 333;
let 변수4 = "333";
console.log(변수3===변수4);
//== 2개면 값을 비교
//=== 3개면 값과 데이터타입을 같이 비교