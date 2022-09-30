// let num1 = 5;
// if(num1 < 0){
//     console.log("음수입니다.");
// }else if(num1 < 10){
//     console.log('10보다 작은 양수입니다.');
// }else{
//     console.log("10보다 큰 수입니다.");
// }

//1. 주어진수가 짝수인지 홀수인지를 판단해보세요.
//1. 짝수와 홀수를 어떻게 구분할까?
//    2?   3?   17?   322?
// let num3 = 57248;
// if(num3%2==0){
//     console.log("짝수입니다.");
// }else{
//     console.log("홀수입니다.");
// }

//2. 변수가 숫자인지 아닌지 판별해보세요.
// let 변수4 = 135;
// if(typeof(변수4)=='number'){
//     console.log("숫자입니다.");
// }else{
//     console.log("숫자가 아닙니다.");
// }

//3. 변수가 3의 배수인지 판별해보세요.
// let 변수3 = 140;
// if(변수3%3==0){
//     console.log("3의배수입니다.");
// }else{
//     console.log("3의배수가 아닙니다.");
// }
//반복문, Math, Time, 배열 등 아무 배우지않은것 사용안하고 풀기. 
//자바스크립트 기본변수에 내장된함수까지만 허용

//4. 반지름이 r인 원의 넓이를 구해보세요.     //조건문 아님
   //원넓이 공식 = 원주율파이(3.141592) * r * r
//    let r = 8;
//    let PI = 3.141592;
//    let 원넓이 = PI * r * r;
//    console.log(원넓이);
   
//5. 숫자가 3의 배수면 3의배수, 5의 배수면 5의 배수라고 출력하되 15의 배수라면 15의 배수라고만 출력해주세요.(3,5의 배수인지는 출력하지말아라)
//현재 실력으로는 논리연산자 활용 또는 비교의 순서
    let num5 = 30;
    if(num5 % 15 ==0){
        console.log("15의 배수");
    }else if(num5 % 5 ==0){
        console.log("5의 배수");
    }else if(num5 % 3 ==0){
        console.log("3의 배수");
    }

//6. 세숫자를 비교하여 가장 큰 숫자를 출력해보세요.
    //테스트는 음수, 소수 다 해보세요.
    // let num1 = 20;
    // let num2 = 333.145;
    // let num3 = 533;
    // let max = num1;     //임시로 아무숫자를 가장큰수로 가정
    
    // if(num2>max){   //나머지 2개숫자 비교하면서 max보다 크면 바꿔치기
    //     max = num2;
    // }
    // if(num3>max){
    //     max = num3;
    // }
    // console.log(max);

//7. 문자열이 들어있는 변수에 "안녕" 이 들어있으면 "안녕하세요"를 콘솔에 찍으세요.
// let str = "안녕하세요 자바 초보 개발자 입니다.";
// if(str.includes("안녕")){
//     console.log("안녕하세요");
// }

//8. 0~100의 점수가 들어있는 변수의 등급을 출력해보세요.
    //59미만 = 가, 60점대 = 양, 70점대 =미, 80점대 = 우,  90점대 = 수
// let score = -20;
// let grade = "";
// if(score<=100 && score >= 90){
//     grade = "수";
// }else if(score<90 && score >= 80){
//     grade = "우";
// }else if(score<80 && score >= 70){
//     grade = "미";
// }else if(score<70 && score >= 60){
//     grade = "양";
// }else if(score>0 && score < 59){
//     grade = "가";
// }else{
//     grade = "잘못된 점수";
// }
// console.log(grade);


//9. 분을 입력하면 몇시간 몇분인지를 알려주세요.   //조건문 아님
// 예)  380 => 360(6시간) + 20분
// 예)  505 => 480(8시간) + 25분
let hours;
let minutes;
let time = 480;
minutes = time % 60;    //나눠떨어지지않는 분
time -= minutes;    //깔끔한 시간단위의 분
hours = time/60;    //시간단위로 변경
console.log(hours+"시간" + minutes+"분");
