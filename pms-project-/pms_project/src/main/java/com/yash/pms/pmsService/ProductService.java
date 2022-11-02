package com.yash.pms.pmsService;

import java.util.List;

import com.yash.pms.model.Product;

public interface ProductService {
	
	Boolean add(Product product);
	
	List<Product> listAll();
	
	Product getProduct(Integer id);
	
	void delete(Integer id);
	
	Boolean updateId(Product product,Integer id);

}

