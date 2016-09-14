package cn.qdev.entity;

import java.sql.Date;

public class User {
	private String email;
	private String name;
	private String pwd;
	private Date createDate;
	private int status;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User() {
		super();
	}
	public User(String email, String name, String pwd, Date createDate,
			int status) {
		super();
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.createDate = createDate;
		this.status = status;
	}

	public User(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	
	
	
}
