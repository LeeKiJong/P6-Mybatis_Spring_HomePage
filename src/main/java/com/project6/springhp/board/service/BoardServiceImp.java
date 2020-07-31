package com.project6.springhp.board.service;


import javax.inject.Inject;
import java.util.List;

import com.project6.springhp.dao.BDao;
import com.project6.springhp.dto.BDto;

public class BoardServiceImp implements BoardService{
	
	@Inject
	private BDao Bdao;
	
	public List<BDto> getBoardList() throws Exception{
		return Bdao.getBoardList();
	}
	
	@Override
	public void insertBoard(BDto Bdto) throws Exception {

		Bdao.insertBoard(Bdto);

	}

	

}
