package com.parag.dao;

import java.util.List;

import com.parag.model.Products;

public interface ProductDao {
	void save(Products products);
	List<Products> selectAll(int id);
	void deleteByPid(int pid);
	Products selectByPidorRef(int pid);
	void update (Products products);

}
