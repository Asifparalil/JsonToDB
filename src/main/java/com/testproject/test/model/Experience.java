package com.testproject.test.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long expid;
	
	@Column
	private  Long sno;
	@Column
	private  String name;
	@Column
	private  String size;
	@Column
	private  String founded;
	@Column
	private  String industry;
	@Column
	private  String lname;
	@Column
	private  String id;
	@Column
	private  String locality;
	@Column
	private  String region;
	@Column
	private  String country;
	@Column
	private  String continent;
	@Column
	private  String street_address;
	@Column
	private  String address_line_2;
	@Column
	private  String postal_code;
	@Column
	private  String geo;
	@Column
	private  String linkedin_url;
	@Column
	private  String linkedin_id;
	@Column
	private  String facebook_url;
	@Column
	private  String twitter_url;
	@Column
	private  String website;
	@Column
	private  String[] location_names;
	@Column
	private  String end_date;
	@Column
	private  String start_date;
	@Column
	private  String title_name;
	@Column
	private  String title_role;
	@Column
	private  String is_primary;
	@Column
	private  String summary;
	
	public Long getExpid() {
		return expid;
	}
	public void setExpid(Long expid) {
		this.expid = expid;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFounded() {
		return founded;
	}
	public void setFounded(String founded) {
		this.founded = founded;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getGeo() {
		return geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}
	public String getLinkedin_url() {
		return linkedin_url;
	}
	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}
	public String getLinkedin_id() {
		return linkedin_id;
	}
	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}
	public String getFacebook_url() {
		return facebook_url;
	}
	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}
	public String getTwitter_url() {
		return twitter_url;
	}
	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String[] getLocation_names() {
		return location_names;
	}
	public void setLocation_names(String[] location_names) {
		this.location_names = location_names;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getTitle_name() {
		return title_name;
	}
	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}
	public String getTitle_role() {
		return title_role;
	}
	public void setTitle_role(String title_role) {
		this.title_role = title_role;
	}
	public String getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(String is_primary) {
		this.is_primary = is_primary;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	@Override
	public String toString() {
		return "Experience [expid=" + expid + ", sno=" + sno + ", name=" + name + ", size=" + size + ", founded="
				+ founded + ", industry=" + industry + ", lname=" + lname + ", id=" + id + ", locality=" + locality
				+ ", region=" + region + ", country=" + country + ", continent=" + continent + ", street_address="
				+ street_address + ", address_line_2=" + address_line_2 + ", postal_code=" + postal_code + ", geo="
				+ geo + ", linkedin_url=" + linkedin_url + ", linkedin_id=" + linkedin_id + ", facebook_url="
				+ facebook_url + ", twitter_url=" + twitter_url + ", website=" + website + ", location_names="
				+ Arrays.toString(location_names) + ", end_date=" + end_date + ", start_date=" + start_date
				+ ", title_name=" + title_name + ", title_role=" + title_role + ", is_primary=" + is_primary
				+ ", summary=" + summary + "]";
	}
	
}
