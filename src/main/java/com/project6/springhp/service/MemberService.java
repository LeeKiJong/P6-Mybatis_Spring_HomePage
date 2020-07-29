package com.project6.springhp.service;

import java.util.List;

import com.project6.springhp.dto.MDto;

public interface MemberService {

	public List<MDto> getUserList() throws Exception; 
	public MDto getUserInfo(String uid) throws Exception; 
	public void insertUser(MDto Mdto) throws Exception; 
	public void updateUser(MDto Mdto) throws Exception; 
	public void deleteUser(String uid) throws Exception;

}
