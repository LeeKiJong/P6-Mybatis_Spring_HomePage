package com.test.homepage.dao.imp;

import org.mybatis.spring.SqlSessionTemplate;

import com.test.homepage.dao.MDao;
import com.test.homepage.dto.MDto;

public class MDaoImp implements MDao{
	private SqlSessionTemplate sqlSession;
	
	public MDaoImp() {
		
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void MInsertDao(MDto dto) {
		sqlSession.insert("members.join", dto);
	}
}
