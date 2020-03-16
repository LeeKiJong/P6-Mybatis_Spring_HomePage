package com.SpringHP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/MainPage")

public class MainPage {

	@RequestMapping("/admin")
	public void admin() {
	}
	
	@RequestMapping("/user")
	public void user() {
	}
}

