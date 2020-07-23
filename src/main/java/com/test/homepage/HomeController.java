package com.test.homepage;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.apache.ibatis.session.SqlSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.homepage.dao.MDao;
import com.test.homepage.dto.MDto;
import com.test.homepage.service.MemberService;
import com.test.homepage.util.Constant;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService memberservice;
	

	public MemberService getMemberservice() {
		return memberservice;
	}

	public void setMemberservice(MemberService memberservice) {
		this.memberservice = memberservice;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "MainPage/home";
	}
	
	@RequestMapping(value = "/join_check", method = RequestMethod.POST)
	public ModelAndView join_check(MDto dto){
		ModelAndView mav = new ModelAndView();
		memberservice.memberJoinProcess(dto);
		mav.setViewName("MainPage/home");
		return mav;
		
	}
	
	@RequestMapping("/join")
	public String join(Model model){
		return "MainPage/join";
	}
	

	
}
