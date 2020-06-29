package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping(value = "hello")
	public String hello() {
		return "hello";
	}
}
