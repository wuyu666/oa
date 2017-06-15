package com.chinasofti.oa.bean;
/**
 * 职位对象类
 * @author wy
 * 2017年6月15日
 */
public class Position {
	/**
	 * 职位id
	 */
	private int pid;
	/**
	 * 职位名称
	 */
	private String pname;
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
	@Override
	public String toString() {
		return "Position [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
