package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

	  @GetMapping(value="/")
	  public String homePage() {
		  System.out.println("Paso por home");
		  return "Home Page";
	  }
}
