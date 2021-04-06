package com.kh.project.member.controller;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.project.member.service.WishService;
import com.kh.project.member.vo.Wish;

@Controller
public class WishController {

	@Autowired
	WishService wishS;
	
	// insert
	@ResponseBody
	@RequestMapping(value="wishInsert.do", method=RequestMethod.POST)
	public String wishInsert(Wish wish, Model m) throws Exception {
		m.addAttribute("success", wishS.wishInsert(wish));
		return "";
	}
	
	// delete
	@ResponseBody
	@RequestMapping(value="wishDelete.do", method=RequestMethod.POST)
	public String wishDelete(int post_no) throws Exception {
		int data = wishS.wishDelete(post_no);
		return "1";
	}
	
}
