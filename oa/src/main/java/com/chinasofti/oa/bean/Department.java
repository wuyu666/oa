package com.chinasofti.oa.bean;
/**
 * 部门对象类
 * @author wy
 * 2017年6月15日
 */
public class Department {
	private int did;
	private String dnumber;
	private String dname;
	private Position position;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDnumber() {
		return dnumber;
	}
	public void setDnumber(String dnumber) {
		this.dnumber = dnumber;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dnumber=" + dnumber + ", dname=" + dname + ", position=" + position + "]";
	}
	
}
