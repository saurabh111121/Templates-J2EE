package com.templates.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.templates.bean.ImageBean;
import com.templates.db.*;

public class ImageDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
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
	
	public Boolean Update(ImageBean data) {
	    String sql = "UPDATE image SET image=?  WHERE name = ?";
	    int count;
	    
	    try {
	    	  con = new DBConnection().getConnection();
	    	  ps = con.prepareStatement(sql);
	    	  
	    	  ps.setBlob(1, data.getImage());
	    	  ps.setString(2, data.getName());
	    	  
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

	
	public byte[] getImage(String name) {
		byte[] image = null;
		try {
		con  = new DBConnection().getConnection();
		ps = con.prepareStatement("select image from image where name= ? ");
		ps.setString(1, name);
		rs = ps.executeQuery();
		if(rs.next()) {
			image = rs.getBytes("image");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return image;
	}
	
}
