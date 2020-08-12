package com.project6.springhp.board.service;

import java.util.List;

import com.project6.common.Search;
import com.project6.springhp.dto.BDto;
import com.project6.springhp.dto.RDto;

public interface BoardService {
	public List<BDto> getBoardList(Search search) throws Exception;
	
	public void insertBoard(BDto Bdto) throws Exception;
	
	public BDto getBoardContent(int bid) throws Exception;

	public void updateBoard(BDto Bdto) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
	
	public int getBoardListCnt(Search search) throws Exception;
	
	// 댓글 리스트

	public List<RDto> getReplyList(int bid) throws Exception;

	public int saveReply(RDto Rdto) throws Exception;

	public int updateReply(RDto Rdto) throws Exception;

	public int deleteReply(int rid) throws Exception;


		

		
}
