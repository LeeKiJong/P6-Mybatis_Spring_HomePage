package com.project6.springhp.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project6.springhp.dto.BDto;

@Repository
public class BDaoImp implements BDao {

	@Inject
	private SqlSession sqlSession;


	@Override
	public List<BDto> getBoardList() throws Exception {
		return sqlSession.selectList("com.project6.springhp.dao.mapper.BDao.getBoardList");
	}

	@Override
	public BDto getBoardContent(int bid) throws Exception {
		return sqlSession.selectOne("com.project6.springhp.dao.mapper.BDao.getBoardContent", bid);
	}

	@Override
	public int insertBoard(BDto boardVO) throws Exception {
		return sqlSession.insert("com.project6.springhp.dao.mapper.BDao.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BDto boardVO) throws Exception {
		return sqlSession.update("com.project6.springhp.dao.mapper.BDao.updateBoard", boardVO);
	}
		
	@Override
	public int deleteBoard(int bid) throws Exception {
		return sqlSession.insert("com.project6.springhp.dao.mapper.BDao.deleteBoard", bid);
	}
		
	@Override
	public int updateViewCnt(int bid) throws Exception {
		return sqlSession.update("com.project6.springhp.dao.mapper.BDao.updateViewCnt", bid);
	}
}


	
