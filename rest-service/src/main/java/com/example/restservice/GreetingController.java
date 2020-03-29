package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!!";
	private final AtomicLong counter = new AtomicLong();

	//Usage: http://localhost:8080/greeting?name=Sujeet2
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	//Usage: http://localhost:8080/greeting1/Sujeet
	@GetMapping("/greeting1/{name}")
	public Greeting greetingWithParam(@PathVariable("name") String name) {
		return new Greeting(counter.incrementAndGet(), "Value with Param: "+ name);
		
		
	}
}