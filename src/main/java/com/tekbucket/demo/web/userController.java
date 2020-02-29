package com.tekbucket.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tekbucket.demo.domain.Product;

@RestController
@RequestMapping ("/user")

public class userController {

	@RequestMapping ("/{userid}")
	public String displayUser(@PathVariable int userid) {
		return "User found " + userid; 
	}
	
	@RequestMapping ("/{userid}/invoices")
	public String displayUserInvoices(
			@PathVariable int userid, 
			@RequestParam (value = "date", required=false)Date dateornull) {
		return "Invoice found " + userid + " on " + dateornull; 
	}
	
	
	@RequestMapping ("/{userid}/products_as_array")
	public List<String> displayUserProducts(
			@PathVariable int userid, 
			@RequestParam (value = "date", required=false)Date dateornull) {
		return  Arrays.asList("firstproduct", "seconnd Product"); 
	}
	
	@RequestMapping ("/{userid}/products_as_json")
	public List<Product> displayUserProductsJSON(
			@PathVariable int userid, 
			@RequestParam (value = "date", required=false)Date dateornull) {
//		
		return Arrays.asList(new Product(1,"shoes",12.00),
				new Product(2,"book",22.00),
				new Product(3,"bag",32.00));
		
		//return (new Product(1, "Book", 12.99)),
//				(new Product(2, "Shirt", 23)),
//				(new Product(3, "Bag", 40.99)); 
	}
	
}
