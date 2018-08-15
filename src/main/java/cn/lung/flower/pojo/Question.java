package cn.lung.flower.pojo;

import java.util.List;
import java.util.Set;

public class Question {

	private int id;
	private String text;
	private String grama;
	private int maxId;
	private List<Option> options;
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", grama=" + grama + ", options=" + options + "]";
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
//	private Set<Option> options;
//	public Question() {
//		options.add(new Option());
//		options.add(new Option());
//		options.add(new Option());
//	}
//	
//	public Set<Option> getOptions() {
//		return options;
//	}
//	public void setOptions(Set<Option> options) {
//		this.options = options;
//	}
	public int getId() {
		return id;
	}
	public int getMaxId() {
		return maxId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getGrama() {
		return grama;
	}
	public void setGrama(String grama) {
		this.grama = grama;
	}
//	@Override
//	public String toString() {
//		return "Question [id=" + id + ", text=" + text + ", grama=" + grama + ", options=" + options + "]";
//	}
//	
	
}
