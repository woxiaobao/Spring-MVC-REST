package com.cnblogs.yjmyzz.web.controller;

import java.util.Locale;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
*
* @author LvBaolin
* @date: 2016年4月18日
* @time: 上午10:22:55
*/
@Controller
public class HomeController {

	Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Locale locale, Model model) {
		return "index";
	}

}
