package com.forum.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("/toIndex.do")
	public String toIndex(Model model, HttpServletRequest req) {
		return "index";
	}
}
