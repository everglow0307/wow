<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    
    <style>
    .button {
				  background-color: #4CAF50; /* Green */
				  border: none;
				  color: white;
				  padding: 10px 20px;
				  text-align: center;
				  text-decoration: none;
				  display: inline-block;
				  font-family : 맑은고딕, Malgun Gothic, dotum, gulim, sans-serif;
				  font-size : 14px;
				  margin: 4px 2px;
				  transition-duration: 0.4s;
				  cursor: pointer;
			}
			
		.button4 {
				  background-color: white;
				  color: white;
				  background-color: #7F00FF;
				  border: 1px solid  #7F00FF;
				}
				
	.button4:hover {  background-color: white;
				  color: black;
				  border: 1px solid  #7F00FF;}
	
	.name {
	font-family : 맑은고딕, Malgun Gothic, dotum, gulim, sans-serif;
	font-size : 14px;
	}
		
    </style>


<br>

    <form action="messagepost.do" name="myForm" method="post">
    <script>
			var csrfHeaderName ="${_csrf.headerName}";
			var csrfTokenValue="${_csrf.token}";
/* 			$(function(){
				$('#pop_btn').on('click',function(){
					alert("쪽지가 성공적으로 보내졌습니다.")
					window.open("about:blank","_self").close();
				});	
			}); */
			
		</script>	
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="hidden" name="${_csrf.headerName}" value="${_csrf.headerName}" />
    <div class="name">
    	<p>
    		<b><input type="text" name="get_id" value="받는 사람.. 바꿔야됨"/></b>
    		
    	<sec:authorize access="isAuthenticated()">
            <input type="text" name="id" 
            value="<sec:authentication property="principal.member.id"/>" readonly/>
        </sec:authorize>
        </p>
       		</div>
    <br>

    <textarea name="msg_contents" cols="60" rows="15">
           
    </textarea>
    <br><br>


    <button type="submit" id="pop_btn" class="button button4">보내기</button>
    <button class="button button4">취소</button>
    </form>
    
    <br>