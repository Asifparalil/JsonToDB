package com.testproject.test.service;

import org.springframework.stereotype.Service;

import com.testproject.test.model.Education;

/**
 * Service Layer For Education Model
 * @author Asif
 *
 */
@Service
public interface EducationService {

	/**
	 * Save Education
	 * @param education
	 * @author Asif
	 */
	public void saveEducation(Education education);
	
}
