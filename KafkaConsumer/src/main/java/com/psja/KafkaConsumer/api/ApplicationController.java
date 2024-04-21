package com.psja.KafkaConsumer.api;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApplicationController {

	
	
	@RequestMapping(value="/getData", method=RequestMethod.GET)
	public String getData() {
		return "getData";
	}
}
