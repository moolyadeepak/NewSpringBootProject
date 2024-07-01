package com.tka.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
 
	@Autowired
	ProductService productService;
	
	@GetMapping("getproductnamebyprice/{price}")
	public ArrayList<String> getproductnamebyprice(@PathVariable int price) {
		
		return productService.getproductnamebyprice(price);
	}
	
	
}
