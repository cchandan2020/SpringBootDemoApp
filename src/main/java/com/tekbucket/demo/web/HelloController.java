package com.tekbucket.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/greeting")
public class HelloController {
	
@RequestMapping(value = "/")
public String sayHello() {
		return "<h1> Hello `java </h1>";
	}


@RequestMapping(value = "/proper")
public String sayProperHello() {
		return "<h1> Hello `java proper </h1>";
	}

@RequestMapping(value = "/proper/super", method = RequestMethod.GET)
public String sayProperlyHello() {
		return "<h1> Hello `java proper super </h1>";
	}

@RequestMapping(value = "/user_entry", method = RequestMethod.GET)
public String useForm() {
		return "<form action=\"/greeting/user_greeting\" method=\"POST\">\n" + 
				"  <label for=\"fname\">First name:</label><br>\n" + 
				"  <input type=\"text\" id=\"fname\" name=\"fname\" ><br>\n" + 
				"  <label for=\"lname\">Last name:</label><br>\n" + 
				"  <input type=\"text\" id=\"lname\" name=\"lname\" \"><br><br>\n" + 
				"  <input type=\"submit\" value=\"Submit\">\n" + 
				"</form> "; 
					
	}

@RequestMapping(value = "/user_greeting", method = RequestMethod.POST)
public String printUserGreeting(@RequestParam String fname, @RequestParam String lname) {
	 return "Hello " + fname + lname;
}

@RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
public String getOrder(@PathVariable String id) {
	 return "Order ID" + ""+ id ;
}






}
