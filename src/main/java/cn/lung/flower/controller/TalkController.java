package cn.lung.flower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TalkController {
//
//	@Resource
//	private TalkService ts;
	
	@RequestMapping("aa")
	public String getClient(){
		return "aa";
	}
}
