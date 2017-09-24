package pc.websy.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

	@RequestMapping("/test/greeting")
	public String greeting() {
		return "Welcome!";
	}

}