package com.boot.beans;

import java.util.List;

public class ItemList {
	public ItemList() {
		super();
	}

	List<Item>items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ItemList(List<Item> items) {
		super();
		this.items = items;
	}

	
}