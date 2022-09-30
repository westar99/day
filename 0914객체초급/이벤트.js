function myclick(){
    alert("내가만든 클릭함수가 실행됨");
}


let ele  = document.getElementById("cola");
console.log(ele);
ele.onclick = function(){
    alert("html의 onclick요소에 할당한 함수 실행");
}

let 웰치스 =  document.getElementById("welchs");
웰치스.addEventListener("click", function(){
    alert("이벤트 리스너로 등록한 함수 실행");
})