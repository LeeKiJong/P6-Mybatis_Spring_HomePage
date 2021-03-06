package com.project6.springhp.dao;

import java.util.List;

import com.project6.common.Pagination;
import com.project6.common.Search;
import com.project6.springhp.dto.BDto;
import com.project6.springhp.dto.RDto;

public interface BDao {
	
	public List<BDto> getBoardList(Search search) throws Exception;
	public BDto getBoardContent(int bid) throws Exception;
	public int insertBoard(BDto boardVO) throws Exception;
	public int updateBoard(BDto boardVO) throws Exception;
	public int deleteBoard(int bid) throws Exception;
	public int updateViewCnt(int bid) throws Exception;
	public int getBoardListCnt(Search search) throws Exception;
	public List<RDto> getReplyList(int bid) throws Exception;
	public int saveReply(RDto Rdto) throws Exception;
	public int updateReply(RDto Rdto) throws Exception;
	public int deleteReply(int rid) throws Exception;


	

}

