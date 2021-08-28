package com.product.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestConrollerAPI {
	@GetMapping("/home")
	public String home() {
		return "Hello";
	}

}
