package com.chinasofti.oa.bean;
/**
 *登录对象
 * @author Administrator
 *
 */
public class Log {
	/**
	 * 登录id
	 */
	 private int uid;
	 /**
	 * 登录用户名
	 */
	 private String username;
	 /**
	 * 登录密码
	 */
	 private String password;
	 
	

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Log [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}


	
	
}
