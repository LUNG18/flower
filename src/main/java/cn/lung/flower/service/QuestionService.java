package cn.lung.flower.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lung.flower.mapper.QuestionMapper;
import cn.lung.flower.pojo.Option;
import cn.lung.flower.pojo.Question;

@Service
public class QuestionService {

	@Resource
	private QuestionMapper qm;
	
	public void insertQusetion(Question question) {
		qm.insertQuestion(question);
		
	}

	public Question getQustionById(int id) {
		return qm.getQuestionById(id);
	}

	public void saveQuestion(Question question) {
		qm.insertQuestion(question);
		int maxId = question.getMaxId();
		for(Option opt : question.getOptions()){
			opt.setQuestionId(maxId);
			qm.insertOption(opt);
		}
	}

	
}
