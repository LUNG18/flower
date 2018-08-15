package cn.lung.flower.pojo;


public class FormModule {

	private Integer id;
	private String inputType;
	private String inputId;
	private String inputName;
	private int NotNull;
	private String inputTitle;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	public String getInputId() {
		return inputId;
	}
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}
	public String getInputName() {
		return inputName;
	}
	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	public int getNotNull() {
		return NotNull;
	}
	public void setNotNull(int notNull) {
		NotNull = notNull;
	}
	public String getInputTitle() {
		return inputTitle;
	}
	public void setInputTitle(String inputTitle) {
		this.inputTitle = inputTitle;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "FormModule [id=" + id + ", inputType=" + inputType + ", inputId=" + inputId + ", inputName=" + inputName
				+ ", NotNull=" + NotNull + ", inputTitle=" + inputTitle + ", remark=" + remark + "]";
	}
	
}
