package cn.lung.flower.pojo;

public class Option {

	private int id;
	private String value;
	private String text;
	private int order;
	
	private int questionId;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "Option [id=" + id + ", value=" + value + ", text=" + text + ", order=" + order + ", questionId="
				+ questionId + "]";
	}
	

}
