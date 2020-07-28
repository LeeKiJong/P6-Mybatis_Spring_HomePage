package com.project6.springhp.dao;

import java.sql.Timestamp;
import java.util.List;

import com.project6.springhp.dto.MDto;

public interface MDao {
	
	public List<MDto> getUserList() throws Exception; 
	public MDto getUserInfo(String uid) throws Exception; 
	public int insertUser(MDto userVO) throws Exception; 
	public int updateUser(MDto userVO) throws Exception; 
	public int deleteUser(String uid) throws Exception;

}
