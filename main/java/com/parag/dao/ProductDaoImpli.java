package com.parag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.parag.conn.MyConnection;
import com.parag.model.Products;

public class ProductDaoImpli implements ProductDao{
private MyConnection myConn;
public ProductDaoImpli() {
	myConn = new MyConnection();
}
	@Override
	public void save(Products products) {
		try {
			Connection con = myConn.getConnection();
			PreparedStatement s =con.prepareStatement("insert into product(pid, pname,pqty,pprice,pdate,id ) values(?,?,?,?,?,?)");
			s.setInt(1, products.getPid());
			s.setString(2, products.getPname());
			s.setInt(3, products.getPqty());
			s.setInt(4, products.getPprice());
			s.setString(5, products.getPdate());
			s.setInt(6, products.getId());
			int i = s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	@Override
	public List<Products> selectAll(int id) {
		List<Products> lst = new ArrayList<>();
		try {
			Connection con = myConn.getConnection();
			PreparedStatement s =con.prepareStatement("select * from product where id =?");
			s.setInt(1,id);
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Products products = new Products();
				products.setRef(rs.getInt(1));
				products.setPid(rs.getInt(2));
				products.setPname(rs.getString(3));
				products.setPqty(rs.getInt(4));
				products.setPprice(rs.getInt(5));
				products.setPdate(rs.getString(6));
				products.setId(rs.getInt(7));
				lst.add(products);
			}
			
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return lst;
	}
	@Override
	public void deleteByPid(int pid) {
		try {
			Connection con = myConn.getConnection();
			PreparedStatement s =con.prepareStatement("delete from product where ref = ?");
			s.setInt(1, pid);
			int i = s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	@Override
	public Products selectByPidorRef(int pid) {
		Products products = new Products();
		try {
			Connection con = myConn.getConnection();
			PreparedStatement s =con.prepareStatement("select * from product where ref =?");
			s.setInt(1,pid);
			ResultSet rs = s.executeQuery();
		  if(rs.next()) {
			  products.setRef(rs.getInt(1));
				products.setPid(rs.getInt(2));
				products.setPname(rs.getString(3));
				products.setPqty(rs.getInt(4));
				products.setPprice(rs.getInt(5));
				products.setPdate(rs.getString(6));
				products.setId(rs.getInt(7));
			   
			}
			
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
	@Override
	public void update(Products products) {
		try {
			Connection con = myConn.getConnection();
			PreparedStatement s =con.prepareStatement("update product set pid=?,pname=?,pqty=?,pprice=?,pdate =? where ref=?");
			
		       s.setInt(1, products.getPid());
		       s.setString(2, products.getPname());
		       s.setInt(3, products.getPqty());
		       s.setInt(4, products.getPprice());
		       s.setString(5,products.getPdate());
		       s.setInt(6, products.getRef());
				int i = s.executeUpdate();
			
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
