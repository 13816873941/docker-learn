package com.test.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class IndexController {

	@RequestMapping("/open")
	public String open() {
		return "index";
	}
}
