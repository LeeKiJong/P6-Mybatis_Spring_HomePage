package com.project6.springhp.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.project6.springhp.dao.MDao;
import com.project6.springhp.dto.MDto;

@Service
public class MemberServiceImp implements MemberService{

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImp.class); 
	
	@Inject 
	private MDao Mdao; 
	
	
	@Override 
	public List<MDto> getUserList() throws Exception { 
		return Mdao.getUserList(); 
	} 
	
	
	@Override 
	public MDto getUserInfo(String uid) throws Exception { 
		return Mdao.getUserInfo(uid); 
	} 
	
	
	@Override 
	public void insertUser(MDto Mdto) throws Exception { 
		Mdao.insertUser(Mdto); 
	} 
	
	
	@Override 
	public void updateUser(MDto Mdto) throws Exception { 
		Mdao.updateUser(Mdto); 
	} 
	
	
	@Override 
	public void deleteUser(String uid) throws Exception { 
		Mdao.deleteUser(uid); 
	}


}
