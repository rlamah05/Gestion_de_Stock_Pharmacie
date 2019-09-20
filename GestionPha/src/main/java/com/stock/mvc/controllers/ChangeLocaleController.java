package com.stock.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.utils.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.utils.ApplicationUtils;

@Controller
@RequestMapping(value = "/changelocale")
public class ChangeLocaleController {

	private static final String REFERER = "referer";
	
	@RequestMapping(value = "/{locale}")
	public String changeLocale(HttpServletRequest request, HttpServletResponse response, @PathVariable String locale) {
		ApplicationUtils.changeLocale(request, response, locale);
		String lastUrl = request.getHeader(REFERER);
		if (!StringUtils.isEmpty(lastUrl)) {
			return "redirect:" + lastUrl;
		}
		return "redirect:/";
	}
}
