package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/home")
	public String rocks() {
		return "WELCOME to cse third year";
		
	}
	@GetMapping("/cse")
	public String rocks1() {
		return "Hi this is tabassum from bangladesh";
	}
}
