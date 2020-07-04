package com.giordanbetat.projectcloud.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.giordanbetat.projectcloud.model.Product;

@FeignClient(name = "product-service")
public interface ProductClientRest {

	@GetMapping(value = "/findAll")
	public List<Product> findAll();
	
	@GetMapping(value = "/findById/{id}")
	public Product findById(@PathVariable(value = "id") Long id);
	
}
 