package com.migration.helloworld.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HelloWorldController {
	
	private static final Logger log = LogManager.getLogger(HelloWorldController.class.getName());
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld()
	{
		log.info("Hello Chubb!!");
		return "Hello Chubb!!";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String welcome()
	{
		log.info("Welcome!!");
		log.info("Reading Environment Variable: " + System.getenv("mypwd"));
		log.info("Reading System Property: " + System.getenv("truststorepwd"));
		return "Welcome!!";
	}
}