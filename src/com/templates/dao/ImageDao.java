package com.templates.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.templates.bean.ImageBean;
import com.templates.db.*;

public class ImageDao {
	Connection con = null;
	PreparedStatement ps = null;
	
	public Boolean Insert(ImageBean data) {
	    String sql = "INSERT into image (name,image) Values(?,?) ";
	    int count;
	    
	    try {
	    	  con = new DBConnection().getConnection();
	    	  ps = con.prepareStatement(sql);
	    	  ps.setString(1, data.getName());
	    	  ps.setBlob(2, data.getImage());
	    	  
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
