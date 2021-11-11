package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RateController {

	@Value("${rate}")
	String rate;
	@Value("${lanecount}")
	String laneCount;
	@Value("${tollstart}")
	String tollStart;
	@Value("${connstring}")
	String connstring;
	
	@GetMapping("/rate")
	public String getRate() {
		return "values : "+rate;
	}
}
