package com.test.homepage.service;

import javax.inject.Inject;

import com.test.homepage.dao.MDao;
import com.test.homepage.dto.MDto;

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
