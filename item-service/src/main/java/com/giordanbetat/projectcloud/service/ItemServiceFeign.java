package com.giordanbetat.projectcloud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giordanbetat.projectcloud.clients.ProductClientRest;
import com.giordanbetat.projectcloud.model.Item;

@Service(value = "serviceFeign")
public class ItemServiceFeign implements ItemService{

	@Autowired
	private ProductClientRest clientFeign;
	
	@Override
	public List<Item> findAll() {
		return clientFeign.findAll().stream().map(product -> new Item(product, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer amount) {
		return new Item(clientFeign.findById(id), amount);
	}
	
}
