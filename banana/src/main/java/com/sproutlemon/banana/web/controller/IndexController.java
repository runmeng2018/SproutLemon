package com.sproutlemon.banana.web.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.logging.Logger;

@RestController
public class IndexController {

	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() throws InterruptedException {

		int sleepTime = new Random().nextInt(3000);

		logger.info("/hello sleepTime:" + sleepTime);

		Thread.sleep(sleepTime);

		return "Hello World";

	}
}
