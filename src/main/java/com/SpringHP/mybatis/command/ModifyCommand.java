package com.SpringHP.mybatis.command;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.jsp_homepage.Dao.MemberDao;
import com.javalec.jsp_homepage.Dto.MemberDto;

public class ModifyCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String eMail = request.getParameter("eMail");
		String address = request.getParameter("address");

		System.out.println(id + pw + eMail + address);
		MemberDao dao = new MemberDao();
		int Update_Result = dao.updateMember(id, pw, eMail, address);

		HttpSession session = request.getSession();
		session.setAttribute("Update_Result", Update_Result);
	}

}
