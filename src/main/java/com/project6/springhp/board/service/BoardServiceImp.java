package com.project6.springhp.board.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import com.project6.common.Pagination;
import com.project6.common.Search;
import com.project6.springhp.dao.BDao;
import com.project6.springhp.dto.BDto;
import com.project6.springhp.dto.RDto;
import com.project6.springhp.service.MemberServiceImp;

@Service
public class BoardServiceImp implements BoardService {

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImp.class);

	@Inject
	private BDao Bdao;

	@Override
	public List<BDto> getBoardList(Search search) throws Exception {
		return Bdao.getBoardList(search);
	}

	@Override
	public void insertBoard(BDto Bdto) throws Exception {

		Bdao.insertBoard(Bdto);

	}

	@Override
	public void updateBoard(BDto Bdto) throws Exception {

		Bdao.updateBoard(Bdto);

	}

	@Override
	public BDto getBoardContent(int bid) throws Exception {
		Bdao.updateViewCnt(bid);
		return Bdao.getBoardContent(bid);
	}

	@Override
	public void deleteBoard(int bid) throws Exception {
		Bdao.deleteBoard(bid);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return Bdao.getBoardListCnt(search);
	}

	// 댓글 리스트

	@Override

	public List<RDto> getReplyList(int bid) throws Exception {

		return Bdao.getReplyList(bid);

	}

	@Override

	public int saveReply(RDto Rdto) throws Exception {

		return Bdao.saveReply(Rdto);

	}

	@Override

	public int updateReply(RDto Rdto) throws Exception {

		return Bdao.updateReply(Rdto);

	}

	@Override

	public int deleteReply(int rid) throws Exception {

		return Bdao.deleteReply(rid);

	}

}
