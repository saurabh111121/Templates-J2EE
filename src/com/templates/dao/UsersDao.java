package com.templates.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.templates.bean.UsersBean;
import com.templates.db.DBConnection;

public class UsersDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String timeStamp = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(new Date());

	
public Boolean Insert(UsersBean data) {
		
	    String sql = "INSERT into users (user_name,user_email,user_password,user_signup_timestamp) Values(?,?,?,?) ";
	    int count; 
	    try {
	    	  con = new DBConnection().getConnection();
	    	  ps = con.prepareStatement(sql);
	    	  ps.setString(1, data.getName());
	    	  ps.setString(2, data.getEmail());
	    	  ps.setString(3, data.getPassword());
	    	  ps.setString(4, timeStamp);
  	  
	    	  count = ps.executeUpdate();
	    	  if(count > 0) {
	    		 return true;
	    	  }
	      }catch(Exception e ) {
	    	  e.printStackTrace();
	      }finally {
	    	  con = null;
	      }
		return false;
	} 	

}
