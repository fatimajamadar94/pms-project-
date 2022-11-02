package com.yash.pms.pmsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.model.Product;
import com.yash.pms.pmsdao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductDao pmdDao;
	@Override
	public Boolean add(Product product) {
		Boolean flag=pmdDao.add(product);
		return flag;
	}
	@Override
	public List<Product> listAll() {
		List<Product>list=pmdDao.listAll();
 		return list;
	}
	@Override
	public Product getProduct(Integer id) {
     Product product=pmdDao.getProduct(id);
		return product;
	}
	@Override
	public void delete(Integer id) {
pmdDao.deleteId(id);		
	}
	@Override
	public Boolean updateId(Product product,Integer id) {
		Product product1= pmdDao.getProduct(id);
		   if(product1 !=null) {
				Boolean flag=pmdDao.update(product);
		   }
    Boolean flag=pmdDao.update(product);
		return flag;
	}

}
