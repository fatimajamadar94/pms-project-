package com.yash.pms.pmsdao;

import java.util.List;

import com.yash.pms.model.Product;

public interface ProductDao {
	Boolean add( Product product);
	List<Product> listAll();
	Product getProduct(Integer id);
	void deleteId(Integer id);
	Boolean update(Product product);
}
