package com.boot.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boot.Item;
import com.boot.ItemList;
import com.boot.Vendor;

@RestController
public class VendorController {
		HashMap<Integer,Vendor>vendorData= new HashMap<>();
		RestTemplate template=new RestTemplate();
		
		public VendorController()
		{
			vendorData.put(1,new Vendor("1","vendor1","address1"));
			vendorData.put(2,new Vendor("2","vendor2","address2"));
			vendorData.put(3,new Vendor("3","vendor3","address3"));
		}
		
		@RequestMapping(value="vendors/{vid}")
		public Vendor getVendor(@PathVariable("vid")int id)
		{
			Vendor v= vendorData.get(id);
			ItemList item = template.getForObject("http://localhost:8082/items/vendor/"+id, ItemList.class);
			List<Item>l=item.getItems();
			v.setItems(l);
			return v;
		}
		
//		@RequestMapping(value="vendors")
//		public List<Vendor>getAllVendors()
//		{
//			Collection<Vendor>c=vendorData.values();
//			List<Vendor>list=new ArrayList<>();
//			list.addAll(c);
//			return list;
//		}
		
		@RequestMapping(value="vendors")
		public List<Vendor>getAllVendors()
		{
			Collection<Vendor>c=vendorData.values();
			for(Vendor v:c)
			{
				String id=v.getVendorCode();
				ItemList item = template.getForObject("http://localhost:8082/items/vendor/"+id, ItemList.class);
				List<Item>l=item.getItems();
				v.setItems(l);
			}
			List<Vendor> list=new ArrayList<>();
			
			list.addAll(c);
			return list;
		}
		
		@RequestMapping(value="vendors/items/{id}")
		public Item getItem(@PathVariable("id")int id)
		{
			RestTemplate template = new RestTemplate();
			Item item = template.getForObject("http://localhost:8082/items/"+id, Item.class);
			return item;
		}
}
