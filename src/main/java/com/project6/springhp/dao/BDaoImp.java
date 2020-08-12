package com.project6.springhp.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project6.common.Pagination;
import com.project6.common.Search;
import com.project6.springhp.dto.BDto;
import com.project6.springhp.dto.RDto;

@Repository
public class BDaoImp implements BDao {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BDto> getBoardList(Search search) throws Exception {
		return sqlSession.selectList("com.project6.springhp.dao.mapper.BDao.getBoardList", search);
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

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return sqlSession.selectOne("com.project6.springhp.dao.mapper.BDao.getBoardListCnt", search);
	}

	// 댓글 리스트

	@Override

	public List<RDto> getReplyList(int bid) throws Exception {

		return sqlSession.selectList("com.project6.springhp.dao.mapper.RDao.getReplyList", bid);

	}

	@Override

	public int saveReply(RDto Rdto) throws Exception {

		return sqlSession.insert("com.project6.springhp.dao.mapper.RDao.saveReply", Rdto);

	}

	@Override

	public int updateReply(RDto Rdto) throws Exception {

		return sqlSession.update("com.project6.springhp.dao.mapper.RDao.updateReply", Rdto);

	}

	@Override

	public int deleteReply(int rid) throws Exception {

		return sqlSession.delete("com.project6.springhp.dao.mapper.RDao.deleteReply", rid);

	}

}
