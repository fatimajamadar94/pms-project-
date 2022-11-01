
package com.yash.pms.pmsdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
