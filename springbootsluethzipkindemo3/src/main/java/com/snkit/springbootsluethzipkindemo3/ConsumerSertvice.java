package com.snkit.springbootsluethzipkindemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerSertvice {

	@Autowired
	private RestTemplate restTemplate;

	public String sayHi() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello";
	}

	public String getUserBySpecification(String input) {

		System.out.println("  From getUserBySepc before callign ..............  ");
		
		MultiValueMap headers = new LinkedMultiValueMap();

		headers.add("Content-Type", "application/vnd.snkit-v1+json");
		headers.add("Accept", "application/vnd.snkit-v1+json");

		HttpEntity request = new HttpEntity(input,headers);

		ResponseEntity<String> resp = restTemplate.exchange("http://localhost:8090/getUsersBySpecification",
				HttpMethod.POST, request, String.class);
		return resp.getBody();
	}

}
