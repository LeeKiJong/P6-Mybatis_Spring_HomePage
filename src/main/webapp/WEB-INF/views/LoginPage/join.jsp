<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<article class="container">
	<div class="page-header">
		<div class="col-md-6 col-md-offset-3">
			<h3>회원가입</h3>
		</div>
	</div>
	<div class="col-sm-6 col-md-offset-3">
		<form action="${pageContext.request.contextPath}/user/insertUser" method="post" role="form"
			id="usercheck" name="member">
			<div class="form-group">
				<label for="uid">아이디</label> <input type="text" class="form-control"
					id="uid" name="uid" placeholder="ID">
				<div class="eheck_font" id="uid"></div>
			</div>
			<div class="form-group">
				<label for="name">이름</label> <input type="text"
					class="form-control" id="name" name="name"
					placeholder="Name">
				<div class="eheck_font" id="name"></div>
			</div>
			<div class="form-group">
				<label for="pwd">비밀번호</label> <input type="password"
					class="form-control" id="pwd" name="pwd"
					placeholder="PASSWORD">
				<div class="eheck_font" id="pwd"></div>
			</div>
			<div class="form-group">
				<label for="re_pwd">비밀번호 확인</label> <input type="password"
					class="form-control" id="re_pwd" name="re_pwd"
					placeholder="Confirm Password">
				<div class="eheck_font" id="re_pwd"></div>
			</div>
			<div class="form-group">
				<label for="email">이메일 주소</label> <input type="email"
					class="form-control" id="email" name="email"
					placeholder="E-mail">
				<div class="eheck_font" id="email"></div>
			</div>
			<div class="form-group text-center">
				<button type="submit" class="btn btn-primary">회원가입</button>
			</div>
		</form>
	</div>
</article>

