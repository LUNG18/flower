package cn.lung.flower.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class UserInfo {

	@Field
	private int id;
	@Field("name")
	private String uName;
	@Field
	private Long attentionNum;
	@Field
	private Long funsNum;
	@Field
	private Long menuEnshrineNum;
	@Field
	private Long answerEnshrineNum;
	@Field
	private Long questionNum;
	@Field
	private Long askNum;
	@Field
	private Long answerNum;
	@Field
	private Long agreeNum;
	@Field
	private Long commetNum;
	@Field
	private Long deleteNum;
	@Field
	private String createTime;
	@Field
	private Long state;
	
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", uName=" + uName + ", attentionNum=" + attentionNum + ", funsNum=" + funsNum
				+ ", menuEnshrineNum=" + menuEnshrineNum + ", answerEnshrineNum=" + answerEnshrineNum + ", questionNum="
				+ questionNum + ", askNum=" + askNum + ", answerNum=" + answerNum + ", agreeNum=" + agreeNum
				+ ", commetNum=" + commetNum + ", deleteNum=" + deleteNum + ", createTime=" + createTime + ", state="
				+ state + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Long getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(Long attentionNum) {
		this.attentionNum = attentionNum;
	}
	public Long getFunsNum() {
		return funsNum;
	}
	public void setFunsNum(Long funsNum) {
		this.funsNum = funsNum;
	}
	public Long getMenuEnshrineNum() {
		return menuEnshrineNum;
	}
	public void setMenuEnshrineNum(Long menuEnshrineNum) {
		this.menuEnshrineNum = menuEnshrineNum;
	}
	public Long getAnswerEnshrineNum() {
		return answerEnshrineNum;
	}
	public void setAnswerEnshrineNum(Long answerEnshrineNum) {
		this.answerEnshrineNum = answerEnshrineNum;
	}
	public Long getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(Long questionNum) {
		this.questionNum = questionNum;
	}
	public Long getAskNum() {
		return askNum;
	}
	public void setAskNum(Long askNum) {
		this.askNum = askNum;
	}
	public Long getAnswerNum() {
		return answerNum;
	}
	public void setAnswerNum(Long answerNum) {
		this.answerNum = answerNum;
	}
	public Long getAgreeNum() {
		return agreeNum;
	}
	public void setAgreeNum(Long agreeNum) {
		this.agreeNum = agreeNum;
	}
	public Long getCommetNum() {
		return commetNum;
	}
	public void setCommetNum(Long commetNum) {
		this.commetNum = commetNum;
	}
	public Long getDeleteNum() {
		return deleteNum;
	}
	public void setDeleteNum(Long deleteNum) {
		this.deleteNum = deleteNum;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Long getState() {
		return state;
	}
	public void setState(Long state) {
		this.state = state;
	}
	
}
