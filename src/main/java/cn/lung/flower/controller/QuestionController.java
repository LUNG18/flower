package cn.lung.flower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lung.flower.pojo.Question;

@Controller
public class QuestionController {

	

	@RequestMapping("test/question")
	public String getQuestion(Model model,Question question){
		System.out.println(question);
		
		return "login";
	}
}
