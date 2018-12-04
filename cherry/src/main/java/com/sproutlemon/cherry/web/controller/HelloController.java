package com.sproutlemon.cherry.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sproutlemon.cherry.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {

		return helloService.hello();

	}
}
