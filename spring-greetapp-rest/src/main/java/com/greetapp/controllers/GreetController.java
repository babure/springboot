package com.greetapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	//http://localhost:8080/greet
		@GetMapping("/greet")
		public String greet() {
			return "Have a good day";
		}
		
//		http://localhost:8080/hello-user/Sri
		@GetMapping("/hello-user/{username}")
		public String sayHello(@PathVariable("username") String username) {
			return "Hello "+username;
		}
		
		
//		http://localhost:8080/print?name=Raju&city=Ban
		@GetMapping("/print")
		public String printUser(@RequestParam("name") String username,@RequestParam("city") String city) {
			return "Hello "+username +" from "+city;
		}
		
//		http://localhost:8080/welcome/Priya/city/Bangalore
		@GetMapping("/welcome/{username}/city/{city}")
		public String sayHello(@PathVariable("username") String username,@PathVariable("city") String city) {
			return "Hello "+username +" from "+city;
		}
		
		
//		http://localhost:8080/show-books
		@GetMapping("/show-books")
		public List<String> show() {
			return List.of("Many Masters","Java","Angular");
		}
}
