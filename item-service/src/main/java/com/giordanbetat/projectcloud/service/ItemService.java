package com.giordanbetat.projectcloud.service;

import java.util.List;

import com.giordanbetat.projectcloud.model.Item;

public interface ItemService {

	public List<Item> findAll();
	
	public Item findById(Long id, Integer amount);
	
}
