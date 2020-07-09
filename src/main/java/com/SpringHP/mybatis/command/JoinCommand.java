package com.SpringHP.mybatis.command;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.javalec.jsp_homepage.Dao.MemberDao;
import com.javalec.jsp_homepage.Dto.MemberDto;

public class JoinCommand implements Command {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String eMail = request.getParameter("eMail");
		Timestamp time = new Timestamp(System.currentTimeMillis());
		String address = request.getParameter("address");

		MemberDao dao = new MemberDao();
		int Join_Result = dao.JoinOK(id, pw, name, eMail, time, address);	//사용자의 회원가입 정보를 dao의 JoinOK를 통해 회원가입 성공 여부를 받아온다.
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("Join_Result", Join_Result);					//세션에 id와 회원가입 성공 여부를 저장한다.

	}

}
