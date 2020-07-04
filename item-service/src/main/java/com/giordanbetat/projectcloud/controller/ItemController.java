package com.giordanbetat.projectcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.giordanbetat.projectcloud.model.Item;
import com.giordanbetat.projectcloud.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier(value = "serviceFeign")
	private ItemService service;

	@GetMapping(value = "/findAll")
	public List<Item> findAll() {
		
		return service.findAll();
	}
	
	@GetMapping(value = "/findById/{id}/amount/{amount}")
	public Item findById(@PathVariable Long id, @PathVariable Integer amount) {
		
		return service.findById(id, amount);
	}

}
