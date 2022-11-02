package com.yash.pms.pmsController;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.Product;
import com.yash.pms.pmsService.ProductService;

@RestController
@RequestMapping("/pms")
public class ProductController {
	@Autowired
	ProductService ProductService;

	@RequestMapping("/hii")
	public String hello() {
		System.out.println("hello ");
		return "hello";
	}

	@PostMapping("/products")
	public Boolean add(@RequestBody Product product) {
		System.out.println(product);
		Boolean flag = ProductService.add(product);
		return flag;
	}

	@RequestMapping("/getall")
	public List<Product> getall() {
		List<Product> list = ProductService.listAll();
		System.out.println(list);
		return list;

	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer id) {
		try {
			Product product = ProductService.getProduct(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {

			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		ProductService.delete(id);
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Integer id) {
		Boolean flag=ProductService.updateId(product, id);
   try {
		
     return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println("not found");
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		}
	
}
