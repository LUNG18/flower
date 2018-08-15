package cn.lung.flower.pojo;

import java.util.List;

public class Form {
	private Integer id;
	private String formId;
	private String action;
	private String method;
	private String formTitle;
	private int orderBy;
	private Integer flowId;
	private String remark;
	private List<FormModule> modules;
	
	public List<FormModule> getModules() {
		return modules;
	}
	public void setModules(List<FormModule> modules) {
		this.modules = modules;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getFormTitle() {
		return formTitle;
	}
	public void setFormTitle(String formTitle) {
		this.formTitle = formTitle;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getFlowId() {
		return flowId;
	}
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Form [id=" + id + ", formId=" + formId + ", action=" + action + ", method=" + method + ", formTitle="
				+ formTitle + ", orderBy=" + orderBy + ", flowId=" + flowId + ", remark=" + remark + ", modules="
				+ modules + "]";
	}
}
