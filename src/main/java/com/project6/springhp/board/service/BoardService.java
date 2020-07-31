package com.project6.springhp.board.service;

import java.util.List;
import java.util.Map;

import com.project6.springhp.dto.BDto;

public interface BoardService {
	public List<BDto> getBoardList() throws Exception;
	
	public void insertBoard(BDto Bdto) throws Exception;
	
	public BDto getBoardContent(int bid) throws Exception;


}
