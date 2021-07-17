package com.testproject.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testproject.test.model.Experience;

/**
 * Service Layer for Experiance Model
 * @author Asif
 *
 */
@Service
public interface ExperienceService {

	/**
	 * Save Experiance
	 * @param experience
	 * @author Asif
	 */
	public void saveExperience(List<Experience> experience);
}
