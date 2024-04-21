package com.psja.kafkaServer.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.psja.kafkaServer.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendData() {
		this.kafkaTemplate.send("testTopicname", "Here in psja service");
	}
	
}
