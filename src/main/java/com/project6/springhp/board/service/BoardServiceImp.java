package com.project6.springhp.board.service;

import javax.inject.Inject;

public class BoardServiceImp implements BoardService{
	
	@Inject
	private BDao Bdao;
	
	public List<BDto> getBoardList() throws Exception{
		return Bdao.getBoardList();
	}

}
