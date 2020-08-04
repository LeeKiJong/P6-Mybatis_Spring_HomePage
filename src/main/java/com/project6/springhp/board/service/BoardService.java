package com.project6.springhp.board.service;

import java.util.List;

import com.project6.springhp.dto.BDto;

public interface BoardService {
	public List<BDto> getBoardList() throws Exception;
	
	public void insertBoard(BDto Bdto) throws Exception;
	
	public BDto getBoardContent(int bid) throws Exception;

	public void updateBoard(BDto Bdto) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
}
