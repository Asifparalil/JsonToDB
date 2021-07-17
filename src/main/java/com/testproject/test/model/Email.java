package com.testproject.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Email  {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mailid;
	
	@Column
	private Long sno;
	@Column
	private String address;
	@Column
	private String type;
	
	public Long getMailid() {
		return mailid;
	}
	public void setMailid(Long mailid) {
		this.mailid = mailid;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Email [mailid=" + mailid + ", sno=" + sno + ", address=" + address + ", type=" + type + "]";
	}
	
}
