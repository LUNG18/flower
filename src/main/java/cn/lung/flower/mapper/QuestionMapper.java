package cn.lung.flower.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.lung.flower.pojo.Option;
import cn.lung.flower.pojo.Question;

public interface QuestionMapper {

//	@Insert("insert into question values (null,#{text},#{grama})")
	public int insertQuestion(Question question);

	
//	@Select("select * from question where id = #{id}")
	public Question getQuestionById(int id);


//	public void insertOption(List<Option> opts);

	@Insert("insert into `option` values (null,#{text},#{value},#{order},#{questionId})")
	public void insertOption(Option opt);

}
