package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepository empRepository;
	EmpEntity empEntity;
	
	@GetMapping("/msg")
	public String getData() {
		return "Hello!!";
	}
	
	@PostMapping("/insert")
	public String insertData(@RequestBody EmpRepository empRepository) {
		empRepository.save(empEntity);
		return"Data saved Sucessfully!!!";
	}

}
