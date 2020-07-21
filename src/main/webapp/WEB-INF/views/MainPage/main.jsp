<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css_folder/assets/css/main.css" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ValidMem" value="${ValidMem}" />
<c:if test="${ValidMem eq null}">
	<%
		response.sendRedirect("login.do");
	%>
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<section id="footer">
		<div class="container">
			<header class="major">
				<h2>메인 페이지</h2>
			</header>
			<p>${name}님안녕하세요.</p>
			<form action="logout.do" method="post">
				<div class="row gtr-uniform">
					<div class="col-12">
						<ul class="actions special">
							<li><input type="submit" value="로그아웃" class="primary"></li>
							<li><input type="button" value="정보수정"
								onclick="javascript:window.location='modify.do'" class="primary"></li>
							<li><input type="button" value="게시판"
								onclick="javascript:window.location='list.do'" class="primary"></li>
						</ul>
					</div>
				</div>
			</form>
	</section>
</body>
</html>