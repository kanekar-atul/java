package com.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumUserController {

	@Autowired
	private LoadBalancerClient loadBalancer;

	@GetMapping("/consumeUsers")
	public void consumeUsers() {

		System.out.println("Consumer().....................");
		
		
		// String baseUrl = "http://localhost:1001/alluser";

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> response = null;

		ServiceInstance serviceInstance = loadBalancer.choose("SPRINGBOOTPRODUCER");

		System.out.println(serviceInstance.getUri());

		String baseUrl = serviceInstance.getUri().toString();

		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(response.getBody());

	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<Object>(headers);
	}
}
