package cn.lung.flower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController extends BaseController{

	
	@RequestMapping("manage")
	public String goManager(){
		return "manager_main";
	}
}
