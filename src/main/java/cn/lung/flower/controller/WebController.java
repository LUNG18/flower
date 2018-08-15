package cn.lung.flower.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lung.flower.pojo.Prodect;
import cn.lung.flower.service.ProdectService;

@Controller
public class WebController extends BaseController{

	@Resource
	private ProdectService ps;
	
	@RequestMapping("Plist")
	public String getPList(Model m){
		List<Prodect> pList = ps.getPlist();
		System.out.println(pList);
		m.addAttribute("pList",pList);
		return "prodList";
	}
}
