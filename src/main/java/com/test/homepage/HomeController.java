package com.test.homepage;

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

import com.test.homepage.dao.MDao;
import com.test.homepage.util.Constant;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public JdbcTemplate template;

	@Autowired
	private SqlSession sqlsession;
	
	@Autowired
	public void setTemplate(JdbcTemplate template){
	  this.template =template;
	  Constant.template = this.template;
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
	
	@RequestMapping("/join")
	public String join(HttpServletRequest request, Model model){
		System.out.println("join");
		/*MDao dao = sqlSession.getMapper(MDao.class);
		dao.MInsertDao(request.getParameter("id"), 
				request.getParameter("pw"), 
				request.getParameter("name"), 
				request.getParameter("email"), 
				new Timestamp(System.currentTimeMillis()), 
				request.getParameter("address"));*/

		return "redirect:MainPage/home";
	}
	

	
}
