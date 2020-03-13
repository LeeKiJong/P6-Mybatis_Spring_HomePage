package com.SpringHP.mybatis.dao;

import java.util.ArrayList;

import com.SpringHP.mybatis.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mContent);
	public ContentDto viewDao(String strID);
	public void deleteDao(String bId);
}
