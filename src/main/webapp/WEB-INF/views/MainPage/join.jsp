<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="resources/css_folder/assets/css/main.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Page</title>
<script language="JavaScript" src="resources/members.js"></script>
</head>
<body>
	<section id=footer>
		<div class="container">
			<header class="major">
				<h2>회원가입</h2>
			</header>
			<form action="join_check" method="post" name="reg_frm">
				<div class="row gtr-uniform">
					<div class="col-12">
						<input type="text" name="id" placeholder="ID" />
					</div>
					<div class="col-12">
						<input type="password" name="pw" placeholder="PW" />
					</div>
					<div class="col-12">
						<input type="password" name="pw_check" placeholder="PW_CHECK" />
					</div>
					<div class="col-12">
						<input type="text" name="name" placeholder="NAME" />
					</div>
					<div class="col-12">
						<input type="text" name="eMail" placeholder="EMAIL" />
					</div>
					<div class="col-12">
						<input type="text" name="address" placeholder="ADDRESS" />
					</div>
					<div class="col-12">
						<ul class="actions special">
							<li><input type="submit" value="회원가입"
								onclick="infoConfirm()" class="primary"></li>
							  <li><input type="reset" value="취소"
								onclick="javascript:window.location = 'MainPage/login.jsp'"
								class="primary"></li>
						</ul>
					</div>
				</div>
			</form>
	</section>
</body>
</html>