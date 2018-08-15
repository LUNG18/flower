package cn.lung.flower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginOutController extends BaseController{

	@RequestMapping("loginOut")
	private String loginOut(){
		session.removeAttribute("user");
		return "login";
	}
}
