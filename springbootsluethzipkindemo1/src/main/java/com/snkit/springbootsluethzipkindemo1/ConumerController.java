package com.snkit.springbootsluethzipkindemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConumerController {

	@Autowired
	ConsumerSertvice consumerSertvice;

	@GetMapping(value = "/service2")
	public String hi() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return consumerSertvice.sayHi()+" Sleuth Demo";

	}

	@PostMapping(value = "/getUsersBySpecification", consumes = { "application/vnd.snkit-v1+json",
			"application/vnd.snkit-v1+xml" }, produces = { "application/vnd.snkit-v1+json",
					"application/vnd.snkit-v1+xml" })
	public String getUsersBySpecification(@RequestBody String req) {

		return consumerSertvice.getUserBySpecification(req);

	}

}
