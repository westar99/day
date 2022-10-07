<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
    <style>
        ul{list-style: none;padding-left: 0px;}
        .login{width:400px; position:absolute;left:50%;top:40%;transform: translate(-50%,-50%);}
        .login h1 {text-align: center;margin:20px;line-height:1;font-size: 40px; color: rgb(0, 85, 128);}
        .login fieldset{
            border-radius:10px 10px 10px 10px;
        }
        .login li{padding:0 0 12px;}
        .login li input{width: 100%; height:46px;box-sizing:border-box;text-indent:16px;}
        .login button {display:block;width:100%;height:50px;background:rgb(0, 85, 128);
        font-size: 18px;border-radius: 5px 5px 5px 5px;color:aliceblue;}

        #chk_id{font-size:10px;}
        footer{	display:flex;flex-direction: column;align-items: center;}
    </style>
</head>

<body>

    <section class="login" method="get">
        <h1>JSP로그인</h1>
        <fieldset>  
	        <form action="loginAction.jsp">
	            <ul> 
	                <li><input type ="text" name= "userid" placeholder="아이디" title="아이디입력"></li>
	                <li><input type="password" name= "pwd" placeholder="비밀번호" title="비밀번호입력"></li>
	                <input type="checkbox"id="chk_id"><label for="chk_id">아이디기억하기</label>
	                <button type="submit">로그인</button>
	            </ul>
	        </form>
		</fieldset>
            <footer>
                <ul>
	                 <a href="joinForm.jsp">회원가입</a>
            	</ul>
            
            </footer>
    </section>
</body>
</html>