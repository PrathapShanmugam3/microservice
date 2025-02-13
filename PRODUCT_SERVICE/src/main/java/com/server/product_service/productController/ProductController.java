package com.server.product_service.productController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	

	@GetMapping("/home")
	public ResponseEntity<String> getMethodName() {
		return ResponseEntity.ok("Welcome");
	}

}
