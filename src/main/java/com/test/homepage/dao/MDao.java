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

	public void MInsertDao();
}
