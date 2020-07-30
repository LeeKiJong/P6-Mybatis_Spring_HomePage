<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form class="form-signin" name="form" id="form" role="form"
	modelAttribute="Mdto" method="post"
	action="${pageContext.request.contextPath}/board/saveBoard">
	
	<div class="form-label-group">
		<form:input path="uid" id="uid" class="form-control"
			placeholder="User ID" required="" autofocus="" />
		<label for="uid" class="sr-only">User ID</label>
	</div>
	<div class="form-label-group">
		<form:password path="pwd" id="pwd" class="form-control"
			placeholder="User Password" required="" />
		<label for="pwd" class="sr-only">User Password</label>
	</div>
	<button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
	<span style="font-size: 11pt;">회원가입</span>
</form:form>




<span style="font-size: 11pt;"> <a href="#"
	onClick="fn_btnSignupClick()">회원가입</a>
</span>
<script>
	function fn_btnSignupClick() {
		location.href = "${pageContext.request.contextPath}/user/signupForm";
	}
</script>
