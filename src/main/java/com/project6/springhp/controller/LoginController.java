package com.project6.springhp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project6.springhp.dto.MDto;
import com.project6.springhp.service.MemberService;

@Controller
@RequestMapping(value = "/user")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class); 
	
	@Inject 
	private MemberService memberService; 
	
	@RequestMapping(value = "/getUserList", method = RequestMethod.GET) 
	public String getUserList(Model model) throws Exception{ 
		logger.info("getUserList()...."); 
		model.addAttribute("userList", memberService.getUserList()); 
		return "MainPage/home";
	}
	
	@RequestMapping(value = "/insertUser", method = RequestMethod.POST) 
	public String insertUser(@ModelAttribute("userVO") MDto userVO 
			, RedirectAttributes rttr) throws Exception { 
		memberService.insertUser(userVO); 
		return "redirect:/user/getUserList"; 
	}
	
	
	@RequestMapping(value = "/signupForm", method = RequestMethod.GET) 
	public String signupForm(Model model) throws Exception { 
		model.addAttribute("userVO", new MDto()); 
		return "login/signupForm"; 
	}

	
}
