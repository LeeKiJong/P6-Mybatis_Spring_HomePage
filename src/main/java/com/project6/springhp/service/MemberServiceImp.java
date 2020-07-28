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
	private MDao userDAO; 
	
	
	@Override 
	public List<MDto> getUserList() throws Exception { 
		return userDAO.getUserList(); 
	} 
	
	
	@Override 
	public MDto getUserInfo(String uid) throws Exception { 
		return userDAO.getUserInfo(uid); 
	} 
	
	
	@Override 
	public void insertUser(MDto userVO) throws Exception { 
		userDAO.insertUser(userVO); 
	} 
	
	
	@Override 
	public void updateUser(MDto userVO) throws Exception { 
		userDAO.updateUser(userVO); 
	} 
	
	
	@Override 
	public void deleteUser(String uid) throws Exception { 
		userDAO.deleteUser(uid); 
	}


}
