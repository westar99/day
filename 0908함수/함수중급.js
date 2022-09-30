function printWhat(what){
    console.log(what);
}


// printWhat(str2);
// var str2 = "초코우유";

// let print = function(){ //함수표현식
//     console.log('print');
// };
// print();  //변수지만 함수다.
//자바스크립트에서는 함수가 1급객체이기 때문에 가능


// (function (){
//     console.log("익명함수!!!");
// })();



function 정답함수(){    //콜백함수
    console.log("정답입니다.!!!!");
}
function 오답함수(){    //콜백함수
    console.log("오답입니다.!!!!");
}

//함수정의
function matchQuiz(answer, printTrue, printFalse){
    if(answer=="무령왕릉"){
        printTrue();
    }else{
        printFalse();
    }
}

//함수호출
//matchQuiz("광개토대왕릉", 정답함수, 오답함수);  



// 동기 = syncronous. 요청과 결과가 동시에 일어남
// 비동기 = unsyncronous. 요청과 결과가 동시에 일어나지 않음


//문제1. isOdd(판단할숫자, 짝수일때호출할함수, 홀수일때호출할함수);

function isOdd(판단할숫자, 짝수일때호출할함수, 홀수일때호출할함수){
    if(판단할숫자%2==0){
        짝수일때호출할함수();  
    }else{
        홀수일때호출할함수();
    }
    //(판단할숫자%2==0)? 짝수일때호출할함수():홀수일때호출할함수();
}

function callBackEven(){
    console.log("짝수 짝수 짝수 짝수 ");
}
function callBackOdd(){
    console.log("홀수 홀수 홀수 홀수 ");
}
//isOdd(45678, callBackEven, callBackOdd);

//--------------------------------------------
function sum(num1, num2){
    console.log(num1+num2);
}
sum(2,9,10); //1. 자바스크립트에서는 정의된 파라미터가 넘는 갯수가 전달되면 뒤에거는 무시한다.
sum('이', 'five');
// sum(30);    //NaN = Not a Number
// console.log(50+undefined);

isOdd(323, "짝수", 55);