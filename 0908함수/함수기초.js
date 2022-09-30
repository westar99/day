//정의 : function 함수명(인자){본문};
//호출 : 함수명(인자전달);

// function printHello(name){
//     console.log(name+"님 반가워요");
// }

// printHello("홍길동");

// function add(num1, num2){
//     return num1+num2;
// }
// let result = add(5, 23);

// let result2 = add(3,5);
// let result3 = add(92, 5);
// let result4 = result2+result3;
// console.log(result4);


//문제1. 3개의 숫자를 받아서 합을 리턴하는 함수
// function add(num1, num2, num3){
//     return num1+num2+num3;
// }
// console.log(add(3,5,8));

//문제2. 두수를 입력받아서 더 큰수를 리턴하는 함수
// function getBigger(num1, num2){
//     if(num1>num2){
//         return num1;
//     }else{
//         return num2;
//     }
// }
// console.log(getBigger(83, 83));


//문제3. 가로와 높이를 입력받아 삼각형의 넓이를 구하는 함수
        //예) 함수(4,5) == 10
// function calcTriArea(width, height){    //매개변수(파라미터)
//     if(width<0 || height<0){
//         return false;
//     }
//     return 0.5 * width * height;
// }


// let result = calcTriArea(-3,8); //전달인자(아규먼트)
// if(result == false){
//     console.log("양수를 입력해주세요");
// }
// else{
//     console.log(result);
// }


//문제4. 첫번째수부터 두번째수까지 자연수의 총합을 구하는 함수
       //예) 함수(1,3) ==1+2+3 = 6     함수(1,100) == 5050
// function sum(starNum, endNum){
//     let total = 0;
//     for(let i=starNum; i<=endNum; i++){
//         total += i;
//     }
//     return total;
// }

//  let result = sum(2,10);    //이름을 total로 바꿔도 block에 의해 다른 변수임
//  console.log(result);

//문제5. 가우스가 푼방식으로 풀기
//1+100=101   2+99 = 101    3+98 = 101   가운데서 50과 51에서 끝나고 101
//101*50 = 5050         //양끝을 합친수 * 둘사이 수의갯수/2
function gauseSum(startNum, endNum){
    let 합친수 = startNum + endNum;
    let 갯수 = (endNum - startNum +1)/2;    //맞는식
        //(startNum + endNum -1)  /2;   //틀린식
    let 합계 = 합친수 * 갯수;
    return 합계;
}

//홀짝으로 분리
function gauseSum2(startNum, endNum){
    let 합친수 = startNum + endNum;
    let 차이 = endNum - startNum;
    let 갯수;
    //2,4   2+3+4 = 3*1 +3     차이2 짝수
    //3,7   3+4+5+6+7 = 10*2 +5   차이4 짝수
    //1,10  1+2+3...+10 = 11*5   차이9 홀수
    //짝수일때 : 합친수*차이/2 + 가운데수
    //홀수일때 : 합친수*차이/2
}


//무조건 반값에다가 갯수 곱하기
    // 1부터 10이면 11/2 = 5.5  반값에다가 원소갯수
    // 2부터 5이면  7/2 =3.5  3.5*4 = 14
    // 2부터 6이면  8/2 =4   4*5 = 20



//겁나 헷갈리게

// function getName(name){
//     name3 = name+"함수의네임";
//     console.log("name : "+name3);
//     return name3;
// }

// getName("홍길동");


// 문제6. 숫자를 하나 받아서 구구단중 해당단만 출력하는 함수를 만들어보세요.
//1. 함수이름
//2. 인자
//3. 본문
//4. 리턴값
function printDan(dan){
    for(let i=1; i<=9; i++){
        console.log(`${dan} * ${i} = ${dan*i}`);
    } 
}


//방금만든 printDan함수를 그대로 활용해서 구구단 전체를 찍는 printGugudan함수를 만들어보세요. 단끼리는 한줄 띄워주세요.
// 나는 이미 하나의 단을 찍는 무기를 가지고있다.
// 이 무기를 활용해서 인자로 전달되는 숫자만 1부터 9까지 바꿔주면서 호출해주면 되겠네.
// 각 단끼리 한줄씩 띄우는 코드 추가하면 되겠네.
function printGugudan(){
    //반복문돌면서 dan에 1부터 9까지 넣어주면됨
    for(let dan=2; dan<=9; dan++){
        printDan(dan);
        console.log("");
    }
}



//printUpgradeGugudan(n,m)함수   //n단부터 m단까지만 출력해보세요.
function printUpgradeGugudan(n, m){
    for(let dan=n; dan<=m; dan++){
        printDan(dan);
        console.log("");
    }
}


//점심먹고 오후시간

//1. 인자 2개를 받아서 큰수에서 작은수를 뺀값을 출력하는 함수
        // f(2,5)==3   f(10,5)==5    f(-2, -5)==3
function diffTwoNum(num1, num2){
    let result= (num1>num2)? num1-num2 : num2-num1;
    console.log(result);
    return result;
}


//2. 첫번째인자 : 문자열   두번째인자 : 숫자
//   첫번째인자를 n번 출력하는 함수
//  f("bong", 3)   bong 을 줄띄우면서 3번이 아니라 bongbongbong 을 찍어보세요.
function printNtimes(inputStr, n){
    let result = "";
    for(let i=0; i<n; i++){
        result+=inputStr;
    }
    console.log(result);
}

//3. isOverTen(숫자) 는 10보다 크면 true, 이하면 false를 반환하는 함수다.
//     1번에서 만든 함수의 결과값을 인자로넘겨 "10보다 큽니다.", "10이하입니다."를 출력해보시오.
function isOverTen(숫자){
    return 숫자>10? true: false;
}

// let overTen = isOverTen(diffTwoNum(30,10)); 
// (overTen==true)? console.log("10보다 큽니다.") : console.log("10이하입니다.");

// if(overTen == true){
//     console.log("10보다 큽니다.");
// }else{
//     console.log("10이하입니다.");
// }


//4. calcFigure(도형이름, 변의길이)
    //삼각형, 사각형, 원 3개의 넓이를 리턴하는 함수를 만들어보세요.
    //가정 : 정삼각형, 정사각형, 원은 변의길이를 지름으로 쓴다.
         //정삼각형공식 = 루트3 / 4 * 한변의제곱
         //루트구하기 = Math.sqrt(숫자)
    //저 3개 말고 들어오면 "지원하지 않는 도형입니다." 출력
    
    function calcFigure(도형이름, 변의길이){
        const PI = 3.14;
        switch(도형이름){
            case '삼각형':
                return Math.sqrt(3) / 4 * 변의길이 * 변의길이;
            case '사각형':
                return 변의길이 * 변의길이;
            case '원':
                return PI * (변의길이/2) * (변의길이/2);
            default:
                console.log("지원하지 않는 도형입니다.");
                return;
        }
    }
