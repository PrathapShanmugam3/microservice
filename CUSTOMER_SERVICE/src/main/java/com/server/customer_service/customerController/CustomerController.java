package com.server.customer_service.customerController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	
	@GetMapping("/home")
	public ResponseEntity<String> getMethodName() {
		return ResponseEntity.ok("Welcome");
	}
	
}
