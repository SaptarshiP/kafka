package com.psja.KafkaConsumer.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.psja.KafkaConsumer.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Override
	@KafkaListener(topics="testTopicname", groupId="my-group")
	public void getData(String message) {
		System.out.println(message);
	}
}
