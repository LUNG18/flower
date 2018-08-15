package cn.lung.flower.pojo;

import java.util.Date;

public class Prodect {
	
	private int pid;
	private String pname;
	private int cid;
	private int pstate;
	private int pso;
	private String pinfo;
	private String psimg;
	private String pbimg;
	private String pcost;
	private int psnum;
	private int prnum;
	private int fid;
	private String insertCost;
	private String tempCost;
	private Date ptime;
	
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cid=" + cid + ", pstate=" + pstate + ", pso=" + pso
				+ ", pinfo=" + pinfo + ", psimg=" + psimg + ", pbimg=" + pbimg + ", pcost=" + pcost + ", psnum=" + psnum
				+ ", prnum=" + prnum + ", fid=" + fid + ", insertCost=" + insertCost + ", tempCost=" + tempCost
				+ ", ptime=" + ptime + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPstate() {
		return pstate;
	}
	public void setPstate(int pstate) {
		this.pstate = pstate;
	}
	public int getPso() {
		return pso;
	}
	public void setPso(int pso) {
		this.pso = pso;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	public String getPsimg() {
		return psimg;
	}
	public void setPsimg(String psimg) {
		this.psimg = psimg;
	}
	public String getPbimg() {
		return pbimg;
	}
	public void setPbimg(String pbimg) {
		this.pbimg = pbimg;
	}
	public String getPcost() {
		return pcost;
	}
	public void setPcost(String pcost) {
		this.pcost = pcost;
	}
	public int getPsnum() {
		return psnum;
	}
	public void setPsnum(int psnum) {
		this.psnum = psnum;
	}
	public int getPrnum() {
		return prnum;
	}
	public void setPrnum(int prnum) {
		this.prnum = prnum;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getInsertCost() {
		return insertCost;
	}
	public void setInsertCost(String insertCost) {
		this.insertCost = insertCost;
	}
	public String getTempCost() {
		return tempCost;
	}
	public void setTempCost(String tempCost) {
		this.tempCost = tempCost;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	
	
}
