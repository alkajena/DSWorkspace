package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(){
		return "abc";
	}
}
