package com.ust.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/docker")
public class BootController {
	

		@GetMapping
		public String message()
		{
			return " OLA!Commo Sava ";
		}
		
}
