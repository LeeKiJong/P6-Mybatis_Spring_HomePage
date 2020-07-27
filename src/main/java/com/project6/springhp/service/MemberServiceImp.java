package com.project6.springhp.service;

import javax.inject.Inject;

import com.project6.springhp.dao.MDao;
import com.project6.springhp.dto.MDto;

public class MemberServiceImp implements MemberService{

	private MDao dao;
	
	public void setDao(MDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void memberJoinProcess(MDto dto) {
		dao.MInsertDao(dto);
	}

}
