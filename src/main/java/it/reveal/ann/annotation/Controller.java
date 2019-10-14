package it.reveal.ann.annotation;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/ping")
	public LocalTime ping() {
		return LocalTime.now();
	}

}
