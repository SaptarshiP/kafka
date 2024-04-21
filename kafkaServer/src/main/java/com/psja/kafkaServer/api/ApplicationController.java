package com.psja.kafkaServer.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import com.psja.kafkaServer.service.ApplicationService;

@RestController
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value="/postMessage", method=RequestMethod.POST)
	public String postMessage() {
		applicationService.sendData();
		return "Hello PSJA";
	}
}
