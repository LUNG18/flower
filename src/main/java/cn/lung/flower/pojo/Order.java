package cn.lung.flower.pojo;

import java.util.Date;

public class Order {
	private int oid;
	private String onum;
	private int uid;
	private String ototal;
	private int ostate;//付款状态 1.未付款 2.待付款 3.已付款 4.退款
	private Date otime;//订单时间
	

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", onum=" + onum + ", uid=" + uid + ", ototal=" + ototal + ", ostate=" + ostate
				+ ", otime=" + otime + "]";
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOnum() {
		return onum;
	}

	public void setOnum(String onum) {
		this.onum = onum;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getOtotal() {
		return ototal;
	}

	public void setOtotal(String ototal) {
		this.ototal = ototal;
	}

	public int getOstate() {
		return ostate;
	}

	public void setOstate(int ostate) {
		this.ostate = ostate;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	
}
