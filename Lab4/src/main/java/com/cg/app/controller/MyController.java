package com.cg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.app.entity.Product;
import com.cg.app.exception.ProductException;
import com.cg.app.service.MyServiceInterface;

public class MyController {
	
	@Autowired
	private MyServiceInterface myService;

	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

		Product pk = myService.save(product);

		return new ResponseEntity<Product>(pk, HttpStatus.OK);
	}

	@GetMapping("/getProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> lb = myService.reterive();
		return new ResponseEntity<List<Product>>(lb, HttpStatus.OK);
	}
	

}
