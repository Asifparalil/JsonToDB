package com.testproject.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Profiles {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long proid;
	
	@Column
	private Long sno;
	@Column
	private String network;
	@Column
	private String id;
	@Column
	private String url;
	public Long getProid() {
		return proid;
	}
	public void setProid(Long proid) {
		this.proid = proid;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Profiles [proid=" + proid + ", sno=" + sno + ", network=" + network + ", id=" + id + ", url=" + url
				+ "]";
	}
	
	
}
