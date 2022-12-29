package com.parag.service;

import java.util.List;

import com.parag.model.Products;

public interface ProductService {
	void add(Products products);
	List<Products> getAll(int id);
	void removeByPId(int pid);
	Products getByPidorRef(int pr);
	void renew (Products products);

}
