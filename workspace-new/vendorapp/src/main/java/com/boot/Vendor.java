package com.boot;

import java.util.List;

public class Vendor {
	public Vendor(String vendorCode, String vendorName, String address) {
		super();
		this.vendorCode = vendorCode;
		this.vendorName = vendorName;
		this.address = address;
	}
	private String vendorCode;
	private String vendorName;
	private String address;
	private List<Item>items;
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
