package com.boot.beans;

public class Item {
	private int itemCode;
	private String itemName;
	private float price;
	
	public Item() {}
	
	public Item(int itemCode, String itemName, float price) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + "]";
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
