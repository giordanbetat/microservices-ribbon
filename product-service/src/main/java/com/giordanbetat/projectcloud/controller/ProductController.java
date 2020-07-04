package com.giordanbetat.projectcloud.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.giordanbetat.projectcloud.model.Product;
import com.giordanbetat.projectcloud.service.IProductService;

@RestController
public class ProductController {
	
	@Value(value = "${server.port}")
	private Integer port;
	
	@Autowired
	private IProductService service;
	
	@GetMapping(value = "/findAll")
	public List<Product> findAll(){
		return service.findAll().stream().map(product -> {
			product.setPort(port);
			return product;
		}).collect(Collectors.toList());
	}
	
	@GetMapping(value = "/findById/{id}")
	public Product findById(@PathVariable Long id) {
		
		Product product = service.findById(id);
		product.setPort(port);
		return product;
	}
}
  