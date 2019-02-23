package com.mitsui.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("/hi")
	@ResponseBody
	public Maptest index() {
		throw new RuntimeException("index");
	}

}
