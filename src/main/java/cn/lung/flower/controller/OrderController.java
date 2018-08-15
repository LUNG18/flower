package cn.lung.flower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

	
	@RequestMapping("getOrders")
	@ResponseBody
	public String getOreders(){
		
		return "200";
	}
	
}
