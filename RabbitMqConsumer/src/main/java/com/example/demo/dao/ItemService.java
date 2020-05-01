package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Item;

public interface ItemService {

	public void addItem(Item item);
	public List<Item> getItems();
}
