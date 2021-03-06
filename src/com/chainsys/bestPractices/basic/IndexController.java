package com.chainsys.bestPractices.basic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public ModelAndView service(UserDetails ud) {
		ModelAndView mvc=new ModelAndView();
		mvc.addObject("details",ud);
		mvc.setViewName("index");
		return mvc;
	}
}
