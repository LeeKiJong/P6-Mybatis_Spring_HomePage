package com.project6.springhp.dao.imp;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.project6.springhp.dao.MDao;
import com.project6.springhp.dto.MDto;


public class MDaoImp implements MDao{
	
	private SqlSessionTemplate sqlSession;
	
	public MDaoImp() {
		
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void MInsertDao(MDto dto) {
		sqlSession.insert("members.insert", dto);
	}
}

