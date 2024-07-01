package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.dao.ProductDao;
import com.tka.entity.Prouct;


@Service
public class ProductService {
	
	@Autowired
	ProductDao dao;

	public ArrayList<String> getproductnamebyprice(@PathVariable int price) {
		
		List<Prouct> getgetproductnamebyprice = dao.getgetproductnamebyprice(price);
		ArrayList<String> al= new ArrayList<>();
		for (Prouct prouct : getgetproductnamebyprice) {
			 if(prouct.getPrice()>price) {
				 al.add(prouct.getProdname());
			 }
			
		}
		
		return al;
	}

}
