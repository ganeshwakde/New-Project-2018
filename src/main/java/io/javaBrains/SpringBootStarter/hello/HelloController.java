package io.javaBrains.SpringBootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String gethi() {
		
		return "hi ganesh this is the first Request";
	}
}
