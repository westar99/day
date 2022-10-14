<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  <style>
  a{
  	text-decoration : none;
  }
  table{
 	border-collapse: collapse;
 	width: 1000px;    
 	margin-top : 20px;
 	text-align: center;
  }
  td, th{
  	border : 1px solid black;
  	height: 50px;
  }
  th{
  	font-size : 17px;
  }
  thead{
  	font-weight: 700;
  	background-color: skyblue;
  }
  .table_wrap{
  	margin : 50px 0 0 50px;
  }
  .bno_width{
  	width: 12%;
  }
  .writer_width{
  	width: 20%;
  }
  .regdate_width{
  	width: 15%;
  }
  .updatedate_width{
  	width: 15%;
  }
  .top_btn{
  	font-size: 20px;
    padding: 6px 12px;
    background-color: #fff;
    border: 3px solid #ddd;
    font-weight: 600;
  }
  .pageInfo{
    list-style : none;
    display: inline-block;
    margin: 50px 0 0 100px;      
  }
  .pageInfo li{
    float: left;
    font-size: 20px;
    margin-left: 18px;
    padding: 7px;
    font-weight: 500;
  }
 a:link {color:black; text-decoration: none;}
 a:visited {color:black; text-decoration: none;}
 a:hover {color:black; text-decoration: underline;}
 .active{
    background-color: #cdd5ec;
  }
  .search_area{
    display: inline-block;
    margin-top: 30px;
    margin-left: 260px;
  }
  .search_area input{
    height: 30px;
    width: 250px;
  }
  .search_area button{
    width: 100px;
    height: 36px;
  } 
  .search_area select{
    height: 35px;
  } 
  
  </style>
</head>
<body>
		<h1>게시판</h1>
<div class="table_wrap">
	<a href="/board/enroll"class="top_btn">게시판 등록</a>
	<table>
		<thead>
			<tr>
				<th class="bno_width">번호</th>
			<!--<th class="bno_width">가짜번호</th>
				<th class="bno_width">진짜번호</th> -->
				<th class="title_width">제목</th>
				<th class="writer_width">작성자</th>
				<th class="regdate_width">작성일</th>
				<th class="updatedate_width">수정일</th>
			</tr>
		</thead>
		<!-- 빽단에서 넘어온 list변수를 순회하면서 하나의 요소(var)를 list라는 이름으로 쓰겠다. -->
		<c:forEach items="${list}" var="list">
		<%-- "${리스트가 받아올 배열이름}","for문 내부에서 사용할 변수",varStatus="상태용 변수" --%>
            <tr>
            	<%-- <td><c:out value="${status.index+1}"/></td> --%>
                <td><c:out value="${list.bno}"/></td>
                <%-- <td><c:out value="${list.title}"/></td> --%>
                <%--리스트를 눌러이동가능하게 함 --%>
                <td>
                    <a class="move" href='<c:out value="${list.bno}"/>'>
        				<c:out value="${list.title}"/>
    				</a>
                </td>    
                <td><c:out value="${list.writer}"/></td>
                <td><fmt:formatDate pattern="yyyy/MM/dd" value="${list.regdate}"/></td>
                <td><fmt:formatDate pattern="yyyy/MM/dd" value="${list.updateDate}"/></td>
            </tr>
        </c:forEach>
	</table>
	<div class="search_wrap">
        <div class="search_area">
        
            <select name="type">
                <option value="" <c:out value="${pageMaker.cri.type == null?'selected':'' }"/>>선택하세요</option>
                <option value="T" <c:out value="${pageMaker.cri.type eq 'T'?'selected':'' }"/>>제목</option>
                <option value="C" <c:out value="${pageMaker.cri.type eq 'C'?'selected':'' }"/>>내용</option>
                <option value="W" <c:out value="${pageMaker.cri.type eq 'W'?'selected':'' }"/>>작성자</option>
                <option value="TC" <c:out value="${pageMaker.cri.type eq 'TC'?'selected':'' }"/>>제목 + 내용</option>
                <option value="TW" <c:out value="${pageMaker.cri.type eq 'TW'?'selected':'' }"/>>제목 + 작성자</option>
                <option value="TCW" <c:out value="${pageMaker.cri.type eq 'TCW'?'selected':'' }"/>>제목 + 내용 + 작성자</option>
            </select>
            <input type="text" name="keyword" value="${pageMaker.cri.keyword }"> 
            <button>Search</button>
         
        </div>
    </div> 

	<div class="pageInfo_wrap" >
        <div class="pageInfo_area">
        	<ul id="pageInfo" class="pageInfo">
        	<!-- 이전페이지 버튼 -->
                <c:if test="${pageMaker.prev}">
                    <li class="pageInfo_btn previous"><a href="${pageMaker.startPage-1}">Previous</a></li>
                </c:if>
 			<%-- <!-- 각 번호 페이지 버튼 -->
                <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="pageInfo_btn"><a href="${num}">${num}</a></li>
                </c:forEach> --%>
             <!-- 각 번호 페이지 버튼+ 색깔을 넣음-->
                <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="pageInfo_btn ${pageMaker.cri.pageNum == num ? 'active':''}"><a href="${num}">${num}</a></li>
                </c:forEach>
            <!-- 다음페이지 버튼 -->
                <c:if test="${pageMaker.next}">
                    <li class="pageInfo_btn next"><a href="${pageMaker.endPage + 1 }">Next</a></li>
                </c:if>    
            </ul>    
        </div>
    </div>
	
	<form id="moveForm" method="get">   
        <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
        <input type="hidden" name="amount" value="${pageMaker.cri.amount }">  
        <input type="hidden" name="keyword" value="${pageMaker.cri.keyword }">
        <input type="hidden" name="type" value="${pageMaker.cri.type }">
    </form>
</div>

<script>
    $(document).ready(function(){
    	//let result = "${result}"; // 컨트롤러에서 넘어온 result변수값을 JSP에 변수값으로 할당
    	let result = '<c:out value="${result}"/>'//보안상 이렇게 바꿔줌
    	
    	checkAlert(result);
        
        function checkAlert(result){
            if(result === ''){
                return;
            }
            else if(result === "enroll success"){
                alert("등록이 완료되었습니다.");
            }
            else if(result === "enroll fail"){
                alert("등록이 실패하였습니다.");
            }
            else if(result === "modify success"){
                alert("수정이 완료되었습니다.");
            }
            else if(result === "delete success"){
                alert("삭제가 완료되었습니다.");
            }
        }   
    });
 
    let moveForm = $("#moveForm");
    //제목을 클릭하면 
    $(".move").on("click", function(e){
    	/* alert("move클릭됨"); */
        e.preventDefault();
        
        //계속반복되는 것을 막으려면(블로그에는 해결이 안된 사항!!!!!!!!)
        let nameEle =$("input[name=bno]");
        nameEle.remove();//제이쿼리로 dom삭제 
		//바닐라 자바스크립트로 하면 부모요소.removeChild(자식요소);
        moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
        //빈 껍데기인 moveForm에 넣어줌
        moveForm.attr("action", "/board/get");
        moveForm.submit();
    });
  	//페이지번호 클릭
    $(".pageInfo a").on("click", function(e){
 
        e.preventDefault();
        moveForm.find("input[name='pageNum']").val($(this).attr("href"));
        moveForm.attr("action", "/board/list");
        moveForm.submit();
        
    });
    //서치(검색) 클릭
    $(".search_area button").on("click", function(e){
    	      
    	e.preventDefault();
        
    	let type = $(".search_area select").val();
        let keyword = $(".search_area input[name='keyword']").val();
        
        if(!type){
            alert("검색 종류를 선택하세요.");
            return false;
        }
        
        if(!keyword){
            alert("키워드를 입력하세요.");
            return false;
        }
        moveForm.find("input[name='type']").val(type);
        moveForm.find("input[name='keyword']").val(keyword);
    	
    /* 	let val = $("input[name='keyword']").val();
        moveForm.find("input[name='keyword']").val(val);//클릭했을 그 순간의 값으로 form을 제출 */
        moveForm.find("input[name='pageNum']").val(1);//1페이지로 감
        moveForm.submit();
     //<form> 태그에 action 속성을 통해 url을 지정해주지 않으면 전송하였을 때 현재의 url경로의 
     //매핑 메서드를 호출하게 됩니다. 검색 버튼을 통해 사용되어야 할 url 경로 또한 "/board/list"이기 때문에
     //"moverForm.attr("action", "/board/list")"를 따로 추가해주지 않았습니다.   
    });
    
</script>		
</body>
</html>