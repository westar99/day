function myclick(){
    alert("내가만든 클릭함수가 실행됨");
}


let ele  = document.getElementById("cola");
console.log(ele);
ele.onclick = function(){
    alert("html의 onclick요소에 할당한 함수 실행");
}

let 웰치스 =  document.getElementById("welchs");
// 웰치스.addEventListener("dblclick", function(){
//     alert("이벤트 리스너로 등록한 함수 실행");
// })


let keydownEle = document.getElementById("keydown2");
keydownEle.addEventListener("keydown", mykeyDownFunc);

function mykeyDownFunc(){
    console.log("키보드가 눌러졌습니다.");
}

//3번째 인풋에 값이 바뀌었음을 인지하면 1번째 인풋의 값을 바뀐값으로 세팅
let changeInput = document.getElementById("changeInput");   //3번째요소 가져옴
changeInput.addEventListener("change", function(){    
    let firstEle = document.getElementById("follow3th");    //1번째요소 가져옴
    //3번째요소의 값을 1번째요소에 값으로 대입
    firstEle.value = changeInput.value; 
})

//퀴즈1. html에 인풋2개를 만들어서 두개의 합의 결과를 3번째 인풋에 실시간으로 보여줘보세요.  change이벤트 써서
//원본코드
let input1 = document.getElementById("input1");
let input2 = document.getElementById("input2");
let sumResult = document.getElementById("sumResult");
input1.onchange = function(){
    sumResult.value = Number(input1.value) + Number(input2.value);
}
input2.onchange = function(){
    sumResult.value = Number(input1.value) + Number(input2.value);
}


//리팩토링 코드
input1.onchange =  function(){
    sumTwoNum(input1, input2, sumResult);
}
//input1.onchange =  sumTwoNum(input1, input2, sumResult);
//이것처럼 해버리면 콜백이 아니라 이문장을 읽을때 실행하는것이 되므로 안된다.
input2.onchange = function(){
    sumTwoNum(input1, input2, sumResult);
}
function sumTwoNum(ele1, ele2, ele3){
    ele3.value = Number(ele1.value) + Number(ele2.value);
}

//퀴즈2. 클릭할때마다 이미지의 길이와 너비를 2배로 키우는 버튼을 만들어보세요
//1. 버튼에 클릭 이벤트 달기.  
    //버튼이 뭔지를 모르는지?  html에 버튼을 못만드는지? 버튼에 클릭이벤트를 못다는지. 
//2. 클릭이 됐을때 실행할 함수 제작
    //함수가 뭔지 모르는지? 함수 정의를 못하는지,  함수의 호출을 못하는지, 본문에서 뭘해야될지 모르는지
//3. 함수 본문에서 먼저 할일 : 이미지의 길이와 너비 구하기
    //html의 이미지태그를 못가져오는지,  그 요소의 길이를 못가져오는지, 
//4. 함수 본문에서 그 다음할일 :  길이와 너비를 2배로 키우는 작업

function twiceImg(){
    let img = document.getElementById("doolyImg");
    // console.log("너비 : "+img.width);
    // console.log("높이 : "+img.height);
    img.width = img.width * 2;
    
}

let inputList = document.getElementsByTagName("input");
console.log(inputList.length);
console.log(inputList[1]);

let selectEle  = document.querySelector(".redbull > input");
console.log(selectEle);

//퀴즈3. 버튼을 만들어주세요. 어떤 버튼이냐면
//      클릭할때마다 H3태그에 "동적으로만든요소"  라는 글자를 콜라밑에 동적으로 추가하는 버튼
let addBtn = document.getElementById("addNewText");
addBtn.onclick = function(){
    let heading = document.createElement("h3");
    let heading_text = document.createTextNode("동적으로만든요소");
    heading.appendChild(heading_text);
    ele.appendChild(heading);
}

 //퀴즈4. 동적h3삭제 버튼을 클릭하면 퀴즈3에서 만들었던 요소를 다 삭제
 //문법 : 추천방법.  부모.removeChild(자식); 
 //       2번째추천  자기.remove();
 //       3번째     요소.innerHTML = '';
let removeBtn = document.getElementById("removeDynamicH3");
removeBtn.onclick = function(){
    //부모
    console.log("가져온부모 : "+document.getElementById("cola"));
    //자식
    let dynamicH3 = document.querySelectorAll("#cola > h3");
    //제거
    //1번방식
    for(let i=0; i<dynamicH3.length; i++){
        ele.removeChild(dynamicH3[i]);
    }
    
    //2번방식
    // for(let i=0; i<dynamicH3.length; i++){
    //     dynamicH3[i].remove();
    // }
}

//퀴즈5. 웰치스를 더블클릭할때마다 웰치스옆에 1부터 9까지의 숫자를 붙여보세요.
// 이벤트를달요소.on이벤트타입 = 콜백함수
// 이벤트를달요소.addEventListener(이벤트타입, 콜백함수)
console.log(웰치스);
웰치스.ondblclick = addNums;
//웰치스.addEventListener("dblclick", addNums);
function addNums(){

    //컨텐츠 내용 제작
    let nums='';
    for(let i=1; i<=9; i++){
        nums += i;
    }
    
    //컨텐츠를 span으로 감싸기
    let newSpan = document.createElement('span');
    let text = document.createTextNode(nums);
    newSpan.appendChild(text);

    //만들어진 span을 웰치스의 형제로 넣기
    //부모노드.이전위치노드생성(생성대상, 기준위치)
    웰치스.append(newSpan); //요소내부의 끝에 삽입. "웰치스"글자옆에 새로생긴 숫자를 클릭해도 이벤트가 동작함.
    //prepend   //요소 내부의 시작에 삽입
    //after     //요소 뒤에 삽입
    //before    //요소 앞에 삽입
}

//Quiz6. lorem 글자색 바꾸기
function changeRed(){
     let loremWord = document.getElementById("here");
     loremWord.style.color = "red";
}
//Quiz7. 글자색 토글로 바꾸기
function toggleColor(){
    //검은색과 빨간색을 클릭할때마다 왔다리 갔다리
    let loremWord = document.getElementById("here");
    if(loremWord.style.color=="" || loremWord.style.color=="black"){
        loremWord.style.color = "red";
    }else if(loremWord.style.color == "red"){
        loremWord.style.color = "black";
    }
    console.log(loremWord.style.color);
}

//Quiz8. 5글자골라내기 라는 버튼을 누르면
//      <p>에서 글자수가 정확히 5글자인것만 골라서 배경색을 노란색으로 바꿔보세요.
//1. p태그 요소 자바스크립트 변수로 가져오기
//2. p태그안에있는 문자열을 뽑아내기
//3. 문자열을 띄워쓰기 기준으로 배열로 나눠서 뽑아내기
//4. 배열의 모든요소를 순회하면서 길이가 5인 요소 뽑아내기
//5. 그놈의 배경색을 노란색으로 변경
//어려움 : 동적으로 클래스 부여해야 깔끔