package com.project6.springhp.dao;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project6.springhp.dto.MDto;

@Repository
public class MDaoImp implements MDao{

	@Inject 
	private SqlSession sqlSession; 
	
	@Override 
	public List<MDto> getUserList() throws Exception { 
		return sqlSession.selectList("com.project6.springhp.dao.mapper.MDao.getUserList"); 
	} 
	
	@Override 
	public MDto getUserInfo(String uid) throws Exception { 
		return sqlSession.selectOne("com.project6.springhp.dao.mapper.MDao.getUserInfo", uid); 
	} 
	
	@Override 
	public int insertUser(MDto userVO) throws Exception { 
		return sqlSession.insert("com.project6.springhp.dao.mapper.MDao.insertUser", userVO); 
	}
	
	@Override 
	public int updateUser(MDto userVO) throws Exception { 
		return sqlSession.update("com.project6.springhp.dao.mapper.MDao.updateUser", userVO); 
	} 
	
	@Override 
	public int deleteUser(String uid) throws Exception { 
		return sqlSession.delete("com.project6.springhp.dao.mapper.MDao.deleteUser", uid); 
	}
	
}
