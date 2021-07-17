package com.testproject.test.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Candidate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno; 
	
	@Column
	private String id;
	
	@Column
	private String job_company_location_geo;
	
	@Column
	private String job_company_name;
	
	@Column
	private String birth_date;
	
	@Column
	private String middle_initial;
	
	@Column
	private String job_company_size;
	
	@Column
	private String linkedin_username;
	
	@Column
	private String birth_year;
	
	@Column
	private String job_company_location_locality;
	
	@Column
	private String job_title;
	
	@Column
	private String facebook_url;
	
	@Column
	private String job_company_id;
	
	@Column
	private String location_region;
	
	@Column
	private String location_street_address;
	
	@Column
	private String location_address_line_2;
	
	@Column
	private String job_company_location_postal_code;
	
	@Column
	private String facebook_id;
	
	@Column
	private String location_name;
	
	@Column
	private String full_name;
	
	@Column
	private String location_last_updated;
	//private String version_contains;
	//private String previous_version;
	//private String current_version;
	//private String version_status;
	@Column
	private String job_company_location_street_address;
	
	@Column
	private String job_company_founded;
	
	@Column
	private String linkedin_url;
	
	@Column
	private String work_email;
	
	@Column
	private String job_company_location_region;
	
	@Column
	private String job_company_website;
	
	@Column
	private String gender;
	
	@Column
	private String location_country;
	
	@Column
	private String facebook_username;
	
	@Column
	private String twitter_username;
	
	@Column
	private String job_company_location_country;
	
	@Column
	private String github_username;
	
	@Column
	private String industry;
	
	@Column
	private String location_geo;
	
	@Column
	private String job_company_location_address_line_2;
	
	@Column
	private String location_postal_code;
	
	@Column
	private String mobile_phone;
	
	@Column
	private String location_continent;
	
	@Column
	private String location_locality;
	
	@Column
	private String first_name;
	
	@Column
	private String twitter_url;
	
	@Column
	private String job_company_location_continent;
	
	@Column
	private String  job_company_facebook_url;
	
	@Column
	private String job_company_linkedin_url;
	
	@Column
	private String last_name;
	
	@Column
	private String linkedin_id;
	
	@Column
	private String job_last_updated;
	
	@Column
	private String middle_name;
	
	@Column
	private String job_company_twitter_url;
	
	@Column
	private String job_title_role;
	
	@Column
	private String job_company_linkedin_id;
	
	@Column
	private String github_url;
	
	@Column
	private String  job_company_industry;
	
	@Column
	private String job_company_location_name;
	
	@Column
	private String[] skills;
	
	@Column
	private String[] job_title_levels;
	
	@Column
	private String[] countries;
	
	@Column
	private String[] location_names;
	
	@Column
	private String[] regions;
	
	@Column
	private String[] street_addresses;
	
	@Column
	private String[] phone_numbers;
	
	@Column
	private String[] interests;
	
	@Column
	private String inferred_salary;
	
	@Column
	private String inferred_years_experience;
	
	@Column
	private String summary;
	
	@Column
	private String username;
	
	@javax.persistence.Transient
	private List<Education> education;
	
	@javax.persistence.Transient
	private List<Email> emails;
	
	@javax.persistence.Transient
	private List<Experience> experience;
	
	@javax.persistence.Transient
	private List<Profiles> profiles;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob_company_location_geo() {
		return job_company_location_geo;
	}

	public void setJob_company_location_geo(String job_company_location_geo) {
		this.job_company_location_geo = job_company_location_geo;
	}

	public String getJob_company_name() {
		return job_company_name;
	}

	public void setJob_company_name(String job_company_name) {
		this.job_company_name = job_company_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getMiddle_initial() {
		return middle_initial;
	}

	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}

	public String getJob_company_size() {
		return job_company_size;
	}

	public void setJob_company_size(String job_company_size) {
		this.job_company_size = job_company_size;
	}

	public String getLinkedin_username() {
		return linkedin_username;
	}

	public void setLinkedin_username(String linkedin_username) {
		this.linkedin_username = linkedin_username;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getJob_company_location_locality() {
		return job_company_location_locality;
	}

	public void setJob_company_location_locality(String job_company_location_locality) {
		this.job_company_location_locality = job_company_location_locality;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public String getJob_company_id() {
		return job_company_id;
	}

	public void setJob_company_id(String job_company_id) {
		this.job_company_id = job_company_id;
	}

	public String getLocation_region() {
		return location_region;
	}

	public void setLocation_region(String location_region) {
		this.location_region = location_region;
	}

	public String getLocation_street_address() {
		return location_street_address;
	}

	public void setLocation_street_address(String location_street_address) {
		this.location_street_address = location_street_address;
	}

	public String getLocation_address_line_2() {
		return location_address_line_2;
	}

	public void setLocation_address_line_2(String location_address_line_2) {
		this.location_address_line_2 = location_address_line_2;
	}

	public String getJob_company_location_postal_code() {
		return job_company_location_postal_code;
	}

	public void setJob_company_location_postal_code(String job_company_location_postal_code) {
		this.job_company_location_postal_code = job_company_location_postal_code;
	}

	public String getFacebook_id() {
		return facebook_id;
	}

	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getLocation_last_updated() {
		return location_last_updated;
	}

	public void setLocation_last_updated(String location_last_updated) {
		this.location_last_updated = location_last_updated;
	}

	public String getJob_company_location_street_address() {
		return job_company_location_street_address;
	}

	public void setJob_company_location_street_address(String job_company_location_street_address) {
		this.job_company_location_street_address = job_company_location_street_address;
	}

	public String getJob_company_founded() {
		return job_company_founded;
	}

	public void setJob_company_founded(String job_company_founded) {
		this.job_company_founded = job_company_founded;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getWork_email() {
		return work_email;
	}

	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}

	public String getJob_company_location_region() {
		return job_company_location_region;
	}

	public void setJob_company_location_region(String job_company_location_region) {
		this.job_company_location_region = job_company_location_region;
	}

	public String getJob_company_website() {
		return job_company_website;
	}

	public void setJob_company_website(String job_company_website) {
		this.job_company_website = job_company_website;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation_country() {
		return location_country;
	}

	public void setLocation_country(String location_country) {
		this.location_country = location_country;
	}

	public String getFacebook_username() {
		return facebook_username;
	}

	public void setFacebook_username(String facebook_username) {
		this.facebook_username = facebook_username;
	}

	public String getTwitter_username() {
		return twitter_username;
	}

	public void setTwitter_username(String twitter_username) {
		this.twitter_username = twitter_username;
	}

	public String getJob_company_location_country() {
		return job_company_location_country;
	}

	public void setJob_company_location_country(String job_company_location_country) {
		this.job_company_location_country = job_company_location_country;
	}

	public String getGithub_username() {
		return github_username;
	}

	public void setGithub_username(String github_username) {
		this.github_username = github_username;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLocation_geo() {
		return location_geo;
	}

	public void setLocation_geo(String location_geo) {
		this.location_geo = location_geo;
	}

	public String getJob_company_location_address_line_2() {
		return job_company_location_address_line_2;
	}

	public void setJob_company_location_address_line_2(String job_company_location_address_line_2) {
		this.job_company_location_address_line_2 = job_company_location_address_line_2;
	}

	public String getLocation_postal_code() {
		return location_postal_code;
	}

	public void setLocation_postal_code(String location_postal_code) {
		this.location_postal_code = location_postal_code;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getLocation_continent() {
		return location_continent;
	}

	public void setLocation_continent(String location_continent) {
		this.location_continent = location_continent;
	}

	public String getLocation_locality() {
		return location_locality;
	}

	public void setLocation_locality(String location_locality) {
		this.location_locality = location_locality;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getJob_company_location_continent() {
		return job_company_location_continent;
	}

	public void setJob_company_location_continent(String job_company_location_continent) {
		this.job_company_location_continent = job_company_location_continent;
	}

	public String getJob_company_facebook_url() {
		return job_company_facebook_url;
	}

	public void setJob_company_facebook_url(String job_company_facebook_url) {
		this.job_company_facebook_url = job_company_facebook_url;
	}

	public String getJob_company_linkedin_url() {
		return job_company_linkedin_url;
	}

	public void setJob_company_linkedin_url(String job_company_linkedin_url) {
		this.job_company_linkedin_url = job_company_linkedin_url;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLinkedin_id() {
		return linkedin_id;
	}

	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}

	public String getJob_last_updated() {
		return job_last_updated;
	}

	public void setJob_last_updated(String job_last_updated) {
		this.job_last_updated = job_last_updated;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getJob_company_twitter_url() {
		return job_company_twitter_url;
	}

	public void setJob_company_twitter_url(String job_company_twitter_url) {
		this.job_company_twitter_url = job_company_twitter_url;
	}

	public String getJob_title_role() {
		return job_title_role;
	}

	public void setJob_title_role(String job_title_role) {
		this.job_title_role = job_title_role;
	}

	public String getJob_company_linkedin_id() {
		return job_company_linkedin_id;
	}

	public void setJob_company_linkedin_id(String job_company_linkedin_id) {
		this.job_company_linkedin_id = job_company_linkedin_id;
	}

	public String getGithub_url() {
		return github_url;
	}

	public void setGithub_url(String github_url) {
		this.github_url = github_url;
	}

	public String getJob_company_industry() {
		return job_company_industry;
	}

	public void setJob_company_industry(String job_company_industry) {
		this.job_company_industry = job_company_industry;
	}

	public String getJob_company_location_name() {
		return job_company_location_name;
	}

	public void setJob_company_location_name(String job_company_location_name) {
		this.job_company_location_name = job_company_location_name;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String[] getJob_title_levels() {
		return job_title_levels;
	}

	public void setJob_title_levels(String[] job_title_levels) {
		this.job_title_levels = job_title_levels;
	}

	public String[] getCountries() {
		return countries;
	}

	public void setCountries(String[] countries) {
		this.countries = countries;
	}

	public String[] getLocation_names() {
		return location_names;
	}

	public void setLocation_names(String[] location_names) {
		this.location_names = location_names;
	}

	public String[] getRegions() {
		return regions;
	}

	public void setRegions(String[] regions) {
		this.regions = regions;
	}

	public String[] getStreet_addresses() {
		return street_addresses;
	}

	public void setStreet_addresses(String[] street_addresses) {
		this.street_addresses = street_addresses;
	}

	public String[] getPhone_numbers() {
		return phone_numbers;
	}

	public void setPhone_numbers(String[] phone_numbers) {
		this.phone_numbers = phone_numbers;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getInferred_salary() {
		return inferred_salary;
	}

	public void setInferred_salary(String inferred_salary) {
		this.inferred_salary = inferred_salary;
	}

	public String getInferred_years_experience() {
		return inferred_years_experience;
	}

	public void setInferred_years_experience(String inferred_years_experience) {
		this.inferred_years_experience = inferred_years_experience;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Profiles> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profiles> profiles) {
		this.profiles = profiles;
	}

	@Override
	public String toString() {
		return "Candidate [sno=" + sno + ", id=" + id + ", job_company_location_geo=" + job_company_location_geo
				+ ", job_company_name=" + job_company_name + ", birth_date=" + birth_date + ", middle_initial="
				+ middle_initial + ", job_company_size=" + job_company_size + ", linkedin_username=" + linkedin_username
				+ ", birth_year=" + birth_year + ", job_company_location_locality=" + job_company_location_locality
				+ ", job_title=" + job_title + ", facebook_url=" + facebook_url + ", job_company_id=" + job_company_id
				+ ", location_region=" + location_region + ", location_street_address=" + location_street_address
				+ ", location_address_line_2=" + location_address_line_2 + ", job_company_location_postal_code="
				+ job_company_location_postal_code + ", facebook_id=" + facebook_id + ", location_name=" + location_name
				+ ", full_name=" + full_name + ", location_last_updated=" + location_last_updated
				+ ", job_company_location_street_address=" + job_company_location_street_address
				+ ", job_company_founded=" + job_company_founded + ", linkedin_url=" + linkedin_url + ", work_email="
				+ work_email + ", job_company_location_region=" + job_company_location_region + ", job_company_website="
				+ job_company_website + ", gender=" + gender + ", location_country=" + location_country
				+ ", facebook_username=" + facebook_username + ", twitter_username=" + twitter_username
				+ ", job_company_location_country=" + job_company_location_country + ", github_username="
				+ github_username + ", industry=" + industry + ", location_geo=" + location_geo
				+ ", job_company_location_address_line_2=" + job_company_location_address_line_2
				+ ", location_postal_code=" + location_postal_code + ", mobile_phone=" + mobile_phone
				+ ", location_continent=" + location_continent + ", location_locality=" + location_locality
				+ ", first_name=" + first_name + ", twitter_url=" + twitter_url + ", job_company_location_continent="
				+ job_company_location_continent + ", job_company_facebook_url=" + job_company_facebook_url
				+ ", job_company_linkedin_url=" + job_company_linkedin_url + ", last_name=" + last_name
				+ ", linkedin_id=" + linkedin_id + ", job_last_updated=" + job_last_updated + ", middle_name="
				+ middle_name + ", job_company_twitter_url=" + job_company_twitter_url + ", job_title_role="
				+ job_title_role + ", job_company_linkedin_id=" + job_company_linkedin_id + ", github_url=" + github_url
				+ ", job_company_industry=" + job_company_industry + ", job_company_location_name="
				+ job_company_location_name + ", skills=" + Arrays.toString(skills) + ", job_title_levels="
				+ Arrays.toString(job_title_levels) + ", countries=" + Arrays.toString(countries) + ", location_names="
				+ Arrays.toString(location_names) + ", regions=" + Arrays.toString(regions) + ", street_addresses="
				+ Arrays.toString(street_addresses) + ", phone_numbers=" + Arrays.toString(phone_numbers)
				+ ", interests=" + Arrays.toString(interests) + ", inferred_salary=" + inferred_salary
				+ ", inferred_years_experience=" + inferred_years_experience + ", summary=" + summary + ", username="
				+ username + ", education=" + education + ", emails=" + emails + ", experience=" + experience
				+ ", profiles=" + profiles + "]";
	}

	
}