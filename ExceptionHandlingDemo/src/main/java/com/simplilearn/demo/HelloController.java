package com.simplilearn.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/testme")
	public String hello() {
		
		return "Hello World";
	}
	
	///localhost:8080/product/0
	@GetMapping("/product/{id}")
	public String ProductNotFoundException(@PathVariable("id") String id) {
		
		 if(id.contentEquals("0"))
			 throw new ProductNotFound();
		 else
			 return "Product was found";
	}


}
