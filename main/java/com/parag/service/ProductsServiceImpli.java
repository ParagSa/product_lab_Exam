package com.parag.service;

import java.util.List;

import com.parag.dao.ProductDao;
import com.parag.dao.ProductDaoImpli;
import com.parag.model.Products;

public class ProductsServiceImpli  implements ProductService{
	private ProductDao productdao;
	public ProductsServiceImpli() {
		productdao = new ProductDaoImpli();
	}

	@Override
	public void add(Products products) {
		productdao.save(products);
		
	}

	@Override
	public List<Products> getAll(int id) {
		return productdao.selectAll(id);
	}

	@Override
	public void removeByPId(int pid) {
		productdao.deleteByPid(pid);
		
	}

	

	@Override
	public void renew(Products products) {
		productdao.update(products);
		
	}

	@Override
	public Products getByPidorRef(int pr) {
		return productdao.selectByPidorRef(pr);
	}

}
