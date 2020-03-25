<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css_folder/assets/css/main.css" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<c:set var="ValidMem" value="${ValidMem}" />
	<c:if test="${ValidMem ne null}">
		<%
			response.sendRedirect("main.do");
		%>
	</c:if>
	<section id="footer">
		<div class="container">
			<header class="major">
				<h2>로그인</h2>
			</header>
			<form action="loginOK.do" method="post">
				<div class="row gtr-uniform">
					<h4>ID</h4>
					<div class="col-12">
						<input type="text" name="id"
							value="<%if (session.getAttribute("id") != null)
				out.println(session.getAttribute("id"));%>"
							placeholder="ID" />
					</div>
					<h4>PW</h4>
					<div class="col-12">
						<input type="password" name="pw" placeholder="PW" />
					</div>
					<div class="col-12">
						<ul class="actions special">
							<li><input type="submit" value="로그인" class="primary" /></li>
							<li><input type="button" value="회원가입" class="primary"
								onclick="javascript:window.location='join.do'"></li>
						</ul>
					</div>
				</div>
			</form>
	</section>

</body>
</html>