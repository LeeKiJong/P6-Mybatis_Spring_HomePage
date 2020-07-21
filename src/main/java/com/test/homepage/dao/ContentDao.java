package com.test.homepage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class ContentDao implements MDao{

	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public ContentDao() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void MInsertDao(String id, 
			String pw, 
			String name, 
			String eMail, 
			Timestamp time, 
			String Address) {}
	
	
	/*@Override
	public ArrayList<ContentDto> listDao() {
		String query = "select * from board order by mId desc";
		ArrayList<ContentDto> dtos = (ArrayList<ContentDto>) template.query(query, new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
		return dtos;
	}
	
	
	@Override
	public void writeDao(final String mWriter, final String mContent) {
		System.out.println("writeDao()");
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				String query = "insert into board (mId, mWriter, mContent) values (board_seq.nextval, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, mWriter);
				pstmt.setString(2, mContent);
				return pstmt;
			}
		});
		
	}

	
	@Override
	public ContentDto viewDao(String strID) {
		System.out.println("viewDao()");
		
		String query = "select * from board where mId = " + strID;
		return template.queryForObject(query, new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
	}

	
	@Override
	public void deleteDao(final String bId) {
		System.out.println("deleteDao()");
		
		String query = "delete from board where mId = ?";
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
		
	}
*/
}

