package com.test.homepage.dao;

import java.sql.Timestamp;

public interface MDao {
	
	public void MInsertDao(String id, 
			String pw, 
			String name, 
			String eMail, 
			Timestamp time, 
			String Address);
}
