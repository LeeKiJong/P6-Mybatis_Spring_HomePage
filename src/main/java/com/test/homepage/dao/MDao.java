package com.test.homepage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javalec.spring_pjt_board.util.Constant;
import com.test.homepage.dto.ContentDto;

public class MDao {

	public static final int MEMBER_NONEXISTENT = 0;			//동일아이디 이미 존재
	public static final int MEMBER_EXISTENT = 1;			//동일아이디 없음
	public static final int MEMBER_JOIN_FAIL = 0;			//회원가입 실패
	public static final int MEMBER_JOIN_SUCCESS = 1;		//회원가입 성공
	public static final int MEMBER_LOGIN_PW_NO_GOOD = 0;	//비밀번호 틀렸음
	public static final int MEMBER_LOGIN_SUCCESS = 1;		//로그인 성공
	public static final int MEMBER_LOGIN_IS_NOT = -1;		//로그인 실패

	
	DataSource dataSource;
	
	JdbcTemplate template = null;
	
	public MDao(){
		template = Constant.template;
	}
	
	public int JoinOK(String PId, String PPw, String PName, String PEMail, Timestamp PTime, String PAddress) {
		//회원가입 성공 여부를 확인하는 함수
		int Join_Result = 0;
		if (confirmId(PId) == 0) {		//DB에 아이디가 없다면
			IDto dto = new IDto(PId, PPw, PName, PEMail, PTime, PAddress);
			Join_Result = insertMember(dto);	//insertMember를 통해 회원가입 정보를 DB에 삽입
		}

		return Join_Result;
	}
	
	
	public int confirmId(String id) {			//DB에 id가 이미 존재하는지 확인
		int result = 0;

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query = "select id from members where id = ?";

		try {
			connection = getConnection();
			pstmt = connection.prepareStatement(query);
			pstmt.setString(1, id);
			set = pstmt.executeQuery();
			if (set.next()) {
				result = MemberDao.MEMBER_EXISTENT;
			} else {
				result = MemberDao.MEMBER_NONEXISTENT;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	//public ArrayList<ContentDto> listDao();
	//public void writeDao(String mWriter, String mContent);
	//public ContentDto viewDao(String strID);
	//public void deleteDao(String bId);
}
