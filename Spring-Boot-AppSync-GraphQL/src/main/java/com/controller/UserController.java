package com.controller;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@RequestMapping(method = RequestMethod.GET, value = "getUserList")
	public String getUserList() {

		JSONObject userJson = null;
		System.out.println("Inside the getUserList()");

		String baseUrl = "https://rkowabpf2feahcnzgyywjrk5pi.appsync-api.us-east-2.amazonaws.com/graphql";

		// create request body
		JSONObject request = new JSONObject();
		request.put("query", "query listUsers{ listUsers { items{ id, name, country}}}"); // set headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("x-api-key", "");
		HttpEntity<String> entity = new HttpEntity<String>(request.toString(), headers);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;

		// send request and parse result
		ResponseEntity<String> loginResponse = restTemplate.exchange(baseUrl, HttpMethod.POST, entity, String.class);
		if (loginResponse.getStatusCode() == HttpStatus.OK) {
			  userJson = new JSONObject(loginResponse.getBody());

			
			//System.out.println(userJson);
		} else if (loginResponse.getStatusCode() == HttpStatus.UNAUTHORIZED) {
			System.out.println("Something went wrong");
		}
		return userJson.toString();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("x-api-key", "da2-qrl5blu7w5fefo37zuddft27la");
		return new HttpEntity<>(headers);
	}
}
