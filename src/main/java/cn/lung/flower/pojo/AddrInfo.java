package cn.lung.flower.pojo;

import java.util.Date;

public class AddrInfo {

	private int aid;
	private int uid;
	private String aname;
	private String azipcode;
	private String atel;
	private String aaddr;
	private String aemail;
	private Date atime;//发货时间
	
	
	@Override
	public String toString() {
		return "AddrInfo [aid=" + aid + ", uid=" + uid + ", aname=" + aname + ", azipcode=" + azipcode + ", atel="
				+ atel + ", aaddr=" + aaddr + ", aemail=" + aemail + ", atime=" + atime + "]";
	}
	public Date getAtime() {
		return atime;
	}
	public void setAtime(Date atime) {
		this.atime = atime;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAzipcode() {
		return azipcode;
	}
	public void setAzipcode(String azipcode) {
		this.azipcode = azipcode;
	}
	public String getAtel() {
		return atel;
	}
	public void setAtel(String atel) {
		this.atel = atel;
	}
	public String getAaddr() {
		return aaddr;
	}
	public void setAaddr(String aaddr) {
		this.aaddr = aaddr;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	
	
}
